package by.bntu.fitr.povt.alexeyd.lab05;

/**
 * Mark the answer choices in which the pairs are equal to each other.
 *  A. 4 and 04
 *  B. 0x5A and 90L
 *  C. 10 and 010
 *  D. 8 and 08
 *  E. 8 and 0x8
 *  F. 11 and 0b11
 *  G. 16 and 0x10
 * Answer:
 * A. 4 and 04
 * B. 0x5A and 90L
 * E. 8 and 0x8
 * G. 16 and 0x10
 */
public class Lab05Exercise3 {

    public static void main (String[] args) {
        System.out.println(4 == 04);
        System.out.println(0x5A == 90L);
        System.out.println(10 == 01);
        //System.out.println(8 == 8); //Numbers beginning with 0 are considered octal – and 9 is not an octal digit (but (conventionally) 0-7 are).
        System.out.println(8 == 0x8);
        System.out.println(11 == 0b11);
        System.out.println(16 == 0x10);
    }
}
