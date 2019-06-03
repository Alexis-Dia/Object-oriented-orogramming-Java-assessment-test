package by.bntu.fitr.povt.alexeyd.lab09;

/**
 * What is the output of this program?
 * o A. [0, 1, 2, 3, 4, 5]
 * o B. [1, 2, 3, 4, 5, 6]
 * o C. [0, 1, 0, 3, 0, 5]
 * o D. [1, 0, 3, 0, 5, 0]
 * o E. [0, 0, 2, 0, 4, 0]
 * o F. [0, 2, 0, 4, 0, 6]
 * o G. a compiler error
 * o H. a runtime error
 * Answer: F. [0, 2, 0, 4, 0, 6]
 */
public class Lab09Exercise19 {

    public static void main(String[] args) {
        int[] array = new int[6];
        for (int i = 1; i < array.length;) {
            array[i++] = i++;
        }

        System.out.println(java.util.Arrays.toString(array));
    }
}
