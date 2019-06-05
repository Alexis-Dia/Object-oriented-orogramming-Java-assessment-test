package by.bntu.fitr.povt.alexeyd.lab05;

/**
 * Consider the following code.
 * o A. 2
 * o B. 3
 * o C. 4
 * o D. 5
 * o E. 6
 * o F. compilation fails
 * o G. an exception is thrown at runtime o Your answer:
 * Answer:
 * D. 5
 */
public class Lab05Exercise11 {

    public static void main(String[] args) {
        double d = 4;
        d = d+++d---d--;
        System.out.println(d);
/*        for (int i = 0; i < 10; i++) {
            d++;
            System.out.println(d);
        }*/
    }
}
