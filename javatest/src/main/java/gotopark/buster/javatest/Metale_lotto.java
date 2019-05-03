package gotopark.buster.javatest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Metale_lotto {

    public static void main(String[] args) throws IOException {

//        String url = "http://gotopark.blogspot.com";
        String url = "http://www.pronosticos.gob.mx/Paginas/Melate/resultados-melate-revancha-revanchita";


        Document doc = Jsoup.connect(url).get();

        String title = doc.title();
        Elements title2 = doc.select ("title");
        Elements f13= doc.select ("strong");
        Element colspan= doc.select (".table .info").get(1);


//        Elements lottogame = doc.select (".lotterygame2");
//        Elements results = doc.select (".results2");

        String lotto_num;
        String Lot_mon;
        String[] Lotto_num = new String[20];

        lotto_num= f13.toString().replaceAll("\\<.*?>", "");
        lotto_num = lotto_num.toString().replaceAll("&nbsp", "");
        lotto_num = lotto_num.toString().replaceAll(";;;;;;;;;;;", ",");
        lotto_num = lotto_num.toString().replaceAll(";;;;;;;;;;", ",");
        lotto_num = lotto_num.toString().replaceAll("\n", ",");
        lotto_num = lotto_num.toString().replaceAll("IMPORTANTE", "");

        Lotto_num = lotto_num.split (",");

        Lot_mon= colspan.toString().replaceAll("\\<.*?>", "");
        Lot_mon = Lot_mon.replace ("  ","\n");


        System.out.println(title);
        System.out.println(title2);
        System.out.println(Lotto_num[0]+Lotto_num[1]+Lotto_num[2]);


        System.out.println(lotto_num);
        System.out.println(Lot_mon);

//        System.out.println(lottogame);
//        System.out.println(results);

//        Log.d("dfdf",title);
    }
}