package by.bntu.fitr.povt.alexeyd.lab07;

/**
 * Consider the following code.
 * o A. 1 2 4 5 7
 * o B. 2 4 5 7
 * o C. 2 4 5 7 8
 * o D. 2 4 5 7 8 10
 * o E. 2 4 5 7 8 10 10
 * o F. 1 2 3 4 5 6 7 8 9 10
 * Answer:
 * B. 2 4 5 7
 */
public class Lab07Exercise12 {

    public static void main(String[] args) {
        int i = 1;
        while (i++ < 10) {
            if (i % 8 == 0) {
                break;
            }
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i + " ");
        }
    }
}