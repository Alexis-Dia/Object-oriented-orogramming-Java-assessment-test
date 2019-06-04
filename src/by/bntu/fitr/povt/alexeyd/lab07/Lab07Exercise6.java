package by.bntu.fitr.povt.alexeyd.lab07;

/**
 * Consider the following code.
 * What is the result?
 * o A. 0
 * o B. 132
 * o C. -127
 * o E. An exception is thrown at runtime
 * o F. Compilation fails
 * o Your answer:
 * Answer:
 * Your answer: -124
 */
public class Lab07Exercise6 {

    public static void main(String[] args) {
        byte number = 127;
        number += 5;
        System.out.println(number);
    }
}
