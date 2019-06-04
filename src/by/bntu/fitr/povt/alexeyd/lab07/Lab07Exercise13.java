package by.bntu.fitr.povt.alexeyd.lab07;

/**
 * What will be the output upon the execution of the following code?
 * o A. 0 3 2
 * o B. 1 2 3
 * o C. 0 3 4
 * o D. 1 4 2
 * Answer:
 * C. 0 3 4
 */
public class Lab07Exercise13 {

    public static void main(String[] args) {
        int j = 5;
        for (int i = 0; i < j; i++) {
            if (i < j--) {
                System.out.print(i * j + " ");
            }
        }
    }
}