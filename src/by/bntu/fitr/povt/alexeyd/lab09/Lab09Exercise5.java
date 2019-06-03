package by.bntu.fitr.povt.alexeyd.lab09;

/**
 * Consider the following line of code (дан код объявления одномерного массива):
 * int[] array = new int[6];
 * After execution, which statements are true?
 *  A. array[5] is null
 *  B. array[5] is undefined
 *  C. array[6] is 0
 *  D. array[0] is 0
 *  E. array.length is 6
 * Answer:
 * D. array[0] is 0
 * E. array.length is 6
 */
public class Lab09Exercise5 {

    public static void main(String[] args) {
        int[] array = new int[6];
        int[] array1 = null;
        int[] array2 = new int[0];

        if (array[6] == 0) {
            System.out.println("A");
        }
/*        if (array == undefined) {
            System.out.println("B");
        }*/
/*        if (array == 0) {
            System.out.println("A");
        }*/
        if (array.length == 6) {
            System.out.println("E");
        }

    }
}
