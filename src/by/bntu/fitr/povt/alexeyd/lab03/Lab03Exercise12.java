package by.bntu.fitr.povt.alexeyd.lab03;

/**
 *
 * Answer:
 */
public class Lab03Exercise12 {

    public static void main(String[] args) {
        byte[] array = new byte[6];
        for (byte i = 0; i++ < array.length;) {
            array[i] = i;
            System.out.print(array[i] + " ");
            i++;
        }
    }
}