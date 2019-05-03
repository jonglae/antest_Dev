package gotopark.buster.javatest.comput;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Contain1 {


    public static void main(String[] args) {
//
//        final String[] Imgnum = {"R.drawable.dball1",
//                "R.drawable.dball2",
//                "R.drawable.dball3",
//                "R.drawable.dball4",
//                "R.drawable.dball5",
//                "R.drawable.dball6"};


            int[] array = new int[]{1, 2, 3, 4, 5};

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();

            if(IntStream.of(array).anyMatch(x -> x == num)) {
                System.out.println("this  ddd"+num);
            } else {
                System.out.println("Not Contains" + num);
            }
        }



//
//    public class excute1{
//
//        String aaaa = Numimg2(3);
//
//
//    }
}
