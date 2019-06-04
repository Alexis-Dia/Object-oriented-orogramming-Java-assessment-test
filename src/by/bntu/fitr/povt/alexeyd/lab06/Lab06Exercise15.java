package by.bntu.fitr.povt.alexeyd.lab06;

/**
 * What will be printed out as a result of the following code execution?
 * o A. true true
 * o B. true false
 * o C. false false
 * o D. false true
 * Answer:
 *   D. false true
 */
public class Lab06Exercise15 {

    public static void main(String[] args) {
        System.out.print(((-7 % 5) > (7 % -5)) + " ");
        System.out.println(Math.abs(Math.ceil(-2.5)) < Math.ceil(Math.abs(-2.5)));
    }
}
