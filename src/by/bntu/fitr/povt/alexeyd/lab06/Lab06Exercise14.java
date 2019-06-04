package by.bntu.fitr.povt.alexeyd.lab06;

/**
 * 14) Consider the following code.
 * o A. 1
 * o B. 2
 * o C. 3
 * o D. 4
 * o E. 5
 * o F. compilation fails
 * o G. an exception is thrown at runtime
 * o Your answer:
 * Answer:
 *   D. 4
 */
public class Lab06Exercise14 {

    public static void main(String[] args) {
        float f = 3;
        f = f---f+++f++;
        System.out.println(f);
    }
}
