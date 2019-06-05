package by.bntu.fitr.povt.alexeyd.lab02;

/**
 * Which of the following are not legal since JDK 7.0?
 * (Что из нижеперечисленного является неправильным начиная с версии JDK 7.0?)
 *  A. int a = 0b100_500;
 *  B. int b = ABCD;
 *  C. int c = 0XCOFFEE_BABE;
 *  D. int d = _25;
 *  E. int e = 1_000_000;
 *  F. int f = 0_xabcd;
 *  G. int g = 0XABCD;
 *  H. int h = 012345678;
 *  I. int i = 0x_52;
 *  J. int j = 10_000_000_000;
 *  K. int k = 0b10101010;
 *  L. int l = 0xAbCd;
 * Answer:
 * A. int a = 0b100_500;
 * B. int b = ABCD;
 * C. int c = 0XCOFFEE_BABE;
 * D. int d = _25;
 * F. int f = 0_xabcd;
 * G. int g = 0XABCD;
 * H. int h = 012345678;
 * I. int i = 0x_52;
 * J. int j = 10_000_000_000;
 */
public class Lab02Exercise6 {

    public static void main(String[] args) {
        //int a = 0b100_500;
        //int b = ABCD;
        //int c = 0XCOFFEE_BABE;
        //int d = _25;
        int e = 1_000_000;
        //int f = 0_xabcd;
        //int g = 0XABCD_;
        //int h = 012345678;
        //int i = 0x_52;
        //int j = 10_000_000_000;
        int k = 0b10101010;
        int l = 0xAbCd;

        System.out.println(e);
    }
}
