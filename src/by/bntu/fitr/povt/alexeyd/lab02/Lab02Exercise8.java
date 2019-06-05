package by.bntu.fitr.povt.alexeyd.lab02;

/**
 * Which of the following are illegal?
 *  A. char c = '10';
 *  B. char c ='\u1234';
 *  C. char c = "\u1234";
 *  D. char c = \u1234;
 *  E. char c ='c'
 *  F. char c = 0x10000;
 *  G. char c = 088;
 *  H. char c = 0x1234;
 *  I. char c = 200_000;
 *  J. char c = 0b10000;
 * Answer:
 * A. char c = '10';
 * C. char c = "\u1234";
 * D. char c = \u1234;
 * F. char c = 0x10000;
 * G. char c = 088;
 * I. char c = 200_000;
 */
public class Lab02Exercise8 {

    public static void main(String[] args) {
        //char c1 = '10';
        char c2 ='\u1234';
        //char c3 = "\u1234";
        //char c4 = \u1234;
        char c5 ='c';
        //char c6 = 0x10000;
        //char c7 = 088;
        char c8 = 0x1234;
        //char c9 = 200_000;
        char c10 = 0b10000;
    }
}
