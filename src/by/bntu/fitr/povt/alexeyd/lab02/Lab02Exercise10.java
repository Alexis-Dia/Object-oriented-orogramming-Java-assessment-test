package by.bntu.fitr.povt.alexeyd.lab02;

/**
 * Which of the following are legal?
 *  A. float f = 2.0F;
 *  B. float f = 2.0f;
 *  C. float f = 2.;
 *  D. float f = 02.0;
 *  E. float f = 0x2.0;
 *  F. double d = 2.0d;
 *  G. double d = 2.0D;
 *  H. double d = 2.;
 *  I. double d = 02.0;
 *  J. double d = 0x2.0;
 * Answer:
 * C. float f = 2.;
 * D. float f = 02.0;
 * J. double d = 0x2.0;
 * E. float f = 0x2.0;
 */
public class Lab02Exercise10 {

    public static void main(String[] args) {
        float f1 = 2.0F;
        float f2 = 2.0f;
        //float f3 = 2.;
        //float f4 = 02.0;
        //float f5 = 0x2.0;
        double d6 = 2.0d;
        double d7 = 2.0D;
        double d8= 2.;
        double d9 = 02.0;
        //double d10 = 0x2.0;
    }
}
