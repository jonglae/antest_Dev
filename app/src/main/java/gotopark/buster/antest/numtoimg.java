package gotopark.buster.antest;

/**
 * Created by buster on 18. 3. 26.
 */

public class numtoimg {

    public String Numimg(int input1) {


        int Num = input1;

        String[] Imgnum = {"0~10", "11~20", "21~30", "31~40", "41~49"};


            if (Num >= 1 && Num <= 10) {
                return Imgnum[0];
            } else if (Num >= 11 && Num <= 20) {
                return Imgnum[1];
            } else if (Num >= 21 && Num <= 30) {
                return Imgnum[2];
            } else if (Num >= 31 && Num <= 40) {
                return Imgnum[3];
            } else if (Num >= 41 && Num <= 49) {
                return Imgnum[4];
            }else {
                return Imgnum[4];

            }


    }


    public int added(int input1 , int input2) {

        int add_b = input1 + input2;

        return add_b;


    }

}