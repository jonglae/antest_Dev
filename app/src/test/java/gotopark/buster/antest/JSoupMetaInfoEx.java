package gotopark.buster.antest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class JSoupMetaInfoEx {


    public static void main(String[] args) throws IOException {

        String url = "http://www.jsoup.org";

        Document document = Jsoup.connect(url).get();

        String description = document.select("meta[name=description]").first().attr("content");
        String keywords = document.select("meta[name=keywords]").first().attr("content");





        System.out.println("Description : " + description);
        System.out.println("Keywords : " + keywords);
    }
}
