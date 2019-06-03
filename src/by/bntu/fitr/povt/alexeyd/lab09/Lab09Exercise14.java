package by.bntu.fitr.povt.alexeyd.lab09;

/**
 * What is the output of this program?
 * Answer: C. a compiler error
 */
public class Lab09Exercise14 {

    public static void main(String[] args) {
        byte[] array = new byte[6];
        for (byte i = 0; i < array.length;) {
            //array[i] = i++ * i;
        }

        for (byte element: array) {
            System.out.print(element + " ");
        }
    }
}
