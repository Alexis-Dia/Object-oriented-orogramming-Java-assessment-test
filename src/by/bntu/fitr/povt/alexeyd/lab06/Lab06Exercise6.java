package by.bntu.fitr.povt.alexeyd.lab06;

/**
 * What is the output of this program? (Что будет на выходе при выполнении данной программы?
 * o A. 3 -1
 * o B. 4 0
 * o C. 5 1
 * o D. 260 256.4
 * Answer:
 * B. 4 0
 */
public class Lab06Exercise6 {

    public static void main(String[] args) {
        int a = 260;
        double b = 256.4;
        byte c = (byte) a;
        byte d = (byte) b;
        System.out.println(c + " " + d);
    }
}
