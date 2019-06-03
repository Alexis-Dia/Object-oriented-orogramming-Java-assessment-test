package by.bntu.fitr.povt.alexeyd.lab09;

/**
 * In the given array declaration, which expression returns the output as 6
 * int[] array = {45, 6, 78, 9, 12, 6};
 *  A. return array.length();
 *  B. return array[array.length() - 1];
 *  C. return array[1];
 *  D. return array[ ].length;
 *  E. return array[array.length];
 *  F. return array[array.length()];
 *  G. return array.length;
 *  H. return array[array.length - 1];
 * Answer: C, G, H
 */
public class Lab09Exercise11 {

    public static void main(String[] args) {
        int[] array = {45, 6, 78, 9, 12, 6};
        //System.out.println(array.length());
        //System.out.println(array[array.length() - 1]);
        System.out.println(array[1]);
        //System.out.println(array[].length);
        //System.out.println(array[array.length]);
        //System.out.println(array[array.length()]);
        System.out.println(array.length);
        System.out.println(array[array.length - 1]);
    }
}
