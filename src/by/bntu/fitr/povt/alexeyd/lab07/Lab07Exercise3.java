package by.bntu.fitr.povt.alexeyd.lab07;

/**
 * Consider the following code. What value is printed out?
 *  A. 1
 *  B. 1 7
 *  C. 1 7 14 21 28
 *  D. 1 8 15 22 29
 *  E. 8 15 22 29 36
 *  F. 7 14 21 28 36
 *  G. a compiler error
 *  H. a runtime error
 * Answer:
 * Your answer: endless lloop which starts from 8 15 22 29 36 ...
 */
public class Lab07Exercise3 {

    public static void main (String[] args) {
        int index = 1;
        while (index % 7 == 1) {
            index += 7;
            System.out.println(index + " ");
        }
    }
}
