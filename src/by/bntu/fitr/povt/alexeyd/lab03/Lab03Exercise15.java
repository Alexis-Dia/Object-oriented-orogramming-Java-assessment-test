package by.bntu.fitr.povt.alexeyd.lab03;

/**
 * What is the result of the following code compilation and execution?
 * o A. falsefalse
 * o B. truetrue
 * o C. falsetrue
 * o D. truefalse
 * o E. a compiler error
 * o F. a runtime error
 * Answer:
 * B. true true
 */
public class Lab03Exercise15 {

    public static void main(String[] args) {
        int x = 3;
        System.out.println(x++ == --x);
        System.out.println(++x == x--);
    }
}
