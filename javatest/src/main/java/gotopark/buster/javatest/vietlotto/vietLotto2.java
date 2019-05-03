package gotopark.buster.javatest.vietlotto;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URL;
import java.text.Normalizer;
import java.util.Arrays;


public class vietLotto2 {

    public static void main(String[] args) throws IOException {

//        String url = "http://gotopark.blogspot.com";
        String url = "https://vietlott.vn/";


//        Document doc = Jsoup.connect(url).get();
        Document doc = Jsoup.parse(new URL(url).openStream(), "UTF-8", url);
//

        String title = doc.title();
        Elements title2 = doc.select("title");
        Elements f13 = doc.select(".day_so_ket_qua_v2");
        Elements f14 = doc.select(".so_tien");
        Elements f15 = doc.select("h5");
//        Element colspan= doc.select (".table .info").get(1);


//        Elements lottogame = doc.select (".lotterygame2");
//        Elements results = doc.select (".results2");


        String[] Numbers = loopEl(f13);
        String Lot_mon;
        String[] Lotto_num = new String[20];

//        System.out.println("=================" + f14);
//        System.out.println("=================" + Numbers);


        // 첫 번째 문자.
        String lotto_num = f13.toString().replaceAll("\\<.*?>", "");


        // 두번째 문자.
        String lotto_num2 = f14.toString().replaceAll("\\<.*?>", "");
        lotto_num2 = lotto_num2.replaceAll(" ", "");

        lotto_num2 = lotto_num2.replaceAll("  ", "");
        lotto_num2 = lotto_num2.replaceAll("   ", "");
        String[] Lotto_num20 = lotto_num2.split("\n");

        String[] Lloto2 = removeA(Lotto_num20, "0");

        System.out.println("======완료==========" + Arrays.toString(Lloto2));

//        lotto_num2 = lotto_num2.replaceAll("\n", "");
//        lotto_num2 = lotto_num2.replaceAll("  ", "");
//        lotto_num2 = lotto_num2.replaceAll("   ", "");
//        lotto_num2 = lotto_num2.replaceAll("\u0090", "");
//        lotto_num2 = lotto_num2.replaceAll(" ", "");


        //외국어 에서 안보이는 문자 있을 때 EUC-KR 문자열 값을 바꿔서 진행
        lotto_num2 = lotto_num2.replaceAll("&#xfffd", "");
        lotto_num2 = lotto_num2.replaceAll("VN", "");
        lotto_num2 = lotto_num2.replace(";", ",");

        //로또 추첨 일
        String lotto_num3 = f15.toString().replaceAll("\\<.*?>", "");
        String[] Lotto_num4 = lotto_num3.split("\n");
        String[] Lloto = removeA(Lotto_num4, "QSMT");
        System.out.println("0 완료->" + Lloto[0]);
        System.out.println("1 ->" + Lloto[1]);
        System.out.println("2 ->" + Lloto[2]);
        System.out.println("3 ->" + Lloto[3]);
        System.out.println("4 ->" + Lloto[4]);


//        System.out.println("=================" + removeDiacriticalMarks(lotto_num2));

//        lotto_num = lotto_num.toString().replaceAll("&nbsp", "");
//        lotto_num = lotto_num.toString().replaceAll(";;;;;;;;;;;", ",");
//        lotto_num = lotto_num.toString().replaceAll(";;;;;;;;;;", ",");
//        lotto_num = lotto_num.toString().replaceAll("\n", ",");
//        lotto_num = lotto_num.toString().replaceAll("IMPORTANTE", "");


        Lotto_num = lotto_num.split(" ");
        String[] Lotto_num2 = lotto_num2.split(",");

//        String[] number2 = loopslit(lotto_num," ");
//        String[] number3 = loopslit(lotto_num2," ");


// Lotoo number1
//        System.out.println("완료 1 ->" + Arrays.toString(Lotto_num));
        System.out.println("완료 1 ->" + Lotto_num[116]);
        System.out.println("완료 1 ->" + Lotto_num[117]);
        System.out.println("완료 1 ->" + Lotto_num[118]);
        System.out.println("완료 1 ->" + Lotto_num[119]);
        System.out.println("완료 1 ->" + Lotto_num[120]);
        System.out.println("완료 1 ->" + Lotto_num[121]);

//        System.out.println("완료 1 ->" + Lotto_num[2]);
//        System.out.println("2 ->" + Lotto_num[3]);
//        System.out.println("3 ->" + Lotto_num[4]);
//        System.out.println("4 ->" + Lotto_num[5]);
//        System.out.println("5 ->" + Lotto_num[6]);
//        System.out.println("6 ->" + Lotto_num[7]);
//        System.out.println("7 ->" + Lotto_num[8]);
//        System.out.println("8 ->" + Lotto_num[9]);


// Lotoo number2
//        System.out.println("1 ->" + Lotto_num2[0]);
//        System.out.println("2 ->" + Lotto_num2[1]);
//        System.out.println("3 ->" + Lotto_num2[2]);
//        System.out.println("4 ->" + Lotto_num2[3]);
//        System.out.println("5 ->" + Lotto_num2[4]);
//        System.out.println("6 ->" + Lotto_num2[5]);
//        System.out.println("7 ->" + Lotto_num2[6]);


//        System.out.println("numbers2"+ String.valueOf(number2[1]));
//        System.out.println(lotto_num);
//        Lot_mon= colspan.toString().replaceAll("\\<.*?>", "");
//        Lot_mon = Lot_mon.replace ("  ","\n");

//
//        System.out.println(title);
//        System.out.println(title2);
//        System.out.println(Lotto_num[0]+Lotto_num[1]+Lotto_num[2]);
//        System.out.println(Arrays.toString(Lotto_num));


//        System.out.println(lotto_num);
//        System.out.println(Lot_mon);

//        System.out.println(lottogame);
//        System.out.println(results);

//        Log.d("dfdf",title);
    }

    static String[] loopEl(Elements string) {
        String[] pbnum2 = new String[string.size()];
        for (int i = 0; i < string.size(); i++) {
            pbnum2[i] = string.get(i).text();
        }
        return pbnum2;
    }


    static String[] loopslit(String string, String string2) {
        String[] pbnum2 = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {

////            System.out.println(string);
//
//            pbnum2[i] =string.get(i).text();
        }
        return pbnum2;
    }


    private static String removeDiacriticalMarks(String string) {
        return Normalizer.normalize(string, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }


    // 같은 문자를 포함 하고 있으면 다른 어레이에 치환
    static String[] removeA(String[] string, String string2) {
        int k = 0;
        String[] aaaa = new String[6];
        for (String s : string) {
            if (s.contains(string2)) {
                aaaa[k] = s;
                k = k + 1;

            }
        }
        return aaaa;
    }
}