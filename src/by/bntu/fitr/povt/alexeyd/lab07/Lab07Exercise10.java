package by.bntu.fitr.povt.alexeyd.lab07;

/**
 * What will be the output upon the execution of the following
 * code?
 * o A. 0 3 2
 * o B. 1 2 3
 * o C. 0 3 4
 * o D. 1 4 2
 * Answer:
 * C. 0 3 4
 */
public class Lab07Exercise10 {

    public static void main(String[] args) {
        int number = 5;
        for (int i = 0; i < number; i++) {
            if (i < number--) {
                System.out.println(i * number + " ");
            }
        }
    }
}
