package gotopark.buster.javatest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Jsoup_title2 {

    public static void main(String[] args) throws IOException {

//        String url = "http://gotopark.blogspot.com";
//        String url = "http://www.pronosticos.gob.mx/Paginas/Melate/resultados-melate-revancha-revanchita";
        String url = "http://www.lotteryextreme.com/south_africa/";

        Document doc = Jsoup.connect(url).get();

        String title = doc.title();
        Elements title2 = doc.select ("title");
        Elements f13= doc.select (".f13");
        Elements lottogame = doc.select (".lotterygame2");
        Elements results = doc.select (".results2");

        System.out.println(title);
        System.out.println(title2);
        System.out.println(f13);
        System.out.println(lottogame);
        System.out.println(results);

//        Log.d("dfdf",title);
    }
}