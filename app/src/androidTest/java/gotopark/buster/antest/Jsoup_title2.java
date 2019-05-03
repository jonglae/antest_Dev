package gotopark.buster.antest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


public class Jsoup_title2 {

    public static void main(String[] args) throws IOException {

//        String url = "http://gotopark.blogspot.com";
        String url = "http://www.naver.com";

        Document doc = Jsoup.connect(url).get();

        String title = doc.title();

        System.out.println(title);
//        Log.d("dfdf",title);
    }
}