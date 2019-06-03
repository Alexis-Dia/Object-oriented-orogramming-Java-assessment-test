package by.bntu.fitr.povt.alexeyd.lab09;

/**
 * Which of the following array declaration statement is illegal?
 *  A. int[ ][ ] array = new int [6][6];
 *  B. int array[ ][ ] = new int [6][6];
 *  C. int[ ] array[ ] = new int [6][6];
 *  D. int[ ][ ] array = new int [ ][6];
 *  E. int[ ] array[ ] = new int [ ][6];
 *  F. int array[ ][ ] = new int [6][ ];
 *  G. int[ ] array[ ] = new int [6][ ];
 * Answer: D, E
 */
public class Lab09Exercise10 {

    public static void main(String[] args) {
        int[][] array = new int [6][6];
        int array2[][] = new int [6][6];
        int[] array3[] = new int [6][6];
        //int[][] array4 = new int [][6];
        //int[] array5[] = new int [][6];
        int array6[][] = new int [6][];
        int[] array7[] = new int [6][];

    }
}
