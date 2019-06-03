package by.bntu.fitr.povt.alexeyd.lab09;

/**
 * What is the output of this program?
 * Answer: F (1 3 5)
 */
public class Lab09Exercise12 {

    public static void main(String[] args) {
        byte[] array = new byte[6];
        for (byte i = 0; i++ < array.length;) {
            array[i] = i;
            System.out.print(array[i] + " ");
            i++;
        }
    }
}