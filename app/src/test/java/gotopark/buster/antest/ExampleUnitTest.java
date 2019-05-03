package gotopark.buster.antest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {

        String imgTest;

        numtoimg Numi = new numtoimg ();


        imgTest =Numi.Numimg (45);

        int add_a = Numi.added (5,4);


        assertEquals ("dfdfd",imgTest);

//        assertEquals (9,add_a);
    }
}