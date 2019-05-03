package gotopark.buster.antest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Multi_jsoup_url {
    public static void main(String[] args) {

        String[] urls = new String[]{"http://www.naver.com/", "http://www.daum.net/", "https://docs.oracle.com/en/"};

        // Create and start workers
        List<Worker> workers = new ArrayList<> (urls.length);
        for (String url : urls) {
            Worker w = new Worker(url);
            workers.add(w);
            new Thread(w).start();
        }

        // Retrieve results
        for (Worker w : workers) {
            Elements results = w.waitForResults();
            if (results != null)
                System.out.println(w.getName()+": "+results.size());
            else
                System.err.println(w.getName()+" had some error!");
        }
    }
}

class Worker implements Runnable {

    private String url;
    private Elements results;
    private String name;
    private static int number = 0;

    private final Object lock = new Object();

    public Worker(String url) {
        this.url = url;
        this.name = "Worker-" + (number++);
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        try {
            Document doc = Jsoup.connect(this.url).get();

            Elements links = doc.select("a");

            // Update results
            synchronized (lock) {
                this.results = links;
                lock.notifyAll();
            }
        } catch (IOException e) {
            // You should implement a better error handling code..
            System.err.println("Error while parsing: "+this.url);
            e.printStackTrace();
        }
    }

    public Elements waitForResults() {
        synchronized (lock) {
            try {
                while (this.results == null) {
                    lock.wait();
                }
                return this.results;
            } catch (InterruptedException e) {
                // Again better error handling
                e.printStackTrace();
            }

            return null;
        }
    }
}