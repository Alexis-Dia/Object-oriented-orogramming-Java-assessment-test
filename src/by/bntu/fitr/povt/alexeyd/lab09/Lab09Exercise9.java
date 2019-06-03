package by.bntu.fitr.povt.alexeyd.lab09;

/**
 * What is the output of this program?
 * Answer: C [0, 1, 0, 3, 0, 5]
 */
public class Lab09Exercise9 {

    public static void main(String[] args) {
        short[] array = new short[6];
        for (short i = 0; i++ < array.length;) {
            System.out.println("*****");
            System.out.println(i);
            System.out.println("*****");
            array[i] = i++;
        }

        System.out.println(java.util.Arrays.toString(array));
    }
}
