package by.bntu.fitr.povt.alexeyd.lab03;

/**
 * Which of the following expressions are legal ? (Какие из нижеприведённых выражений корректны?)
 *  A. int x = 7; x = !x;
 *  B. int x = 7; !(x < 10) ? … : …
 *  C. int x = 7; x = ~x;
 *  D. String x = "Hello"; int y = 4; x += y;
 *  E. String x = "Hello"; int y = 4; x == y ? … : …
 *  F. String x = "Hello"; int y = 4; x = x + y;
 *  G. String x = "Hello"; int y = 4; y = y + x;
 * Answer:
 * C. int x = 7; x = ~x;
 * D. String x = "Hello"; int y = 4; x += y;
 * F. String x = "Hello"; int y = 4; x = x + y;
 */
public class Lab03Exercise3 {

    public static void main (String[] args) {
        //int x1 = 7; x1 = !x1;
        //int x2 = 7; !(x2 < 10) ? 91 : 104;
        int x3 = 7; x3 = ~x3;
        String x4 = "Hello"; int y4 = 4; x4 += y4;
        //String x5 = "Hello"; int y5 = 4; x5 == y5 ? 91 : 104;
        String x6 = "Hello"; int y6 = 4; x6 = x6 + y6;
        //String x7 = "Hello"; int y7 = 4; y7 = y7 + x7;
    }
}
