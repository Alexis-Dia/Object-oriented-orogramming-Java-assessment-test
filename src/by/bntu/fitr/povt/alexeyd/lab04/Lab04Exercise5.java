package by.bntu.fitr.povt.alexeyd.lab04;

/**
 * Какое из нижеприведённых выражений даст положительное значение переменной x ?
 *  A. short x = –3; x = x >> 1;
 *  B. int x = –3; x = x >>> 31;
 *  C. int x = –3; x = x >>> 1;
 *  D. char c = 2 >> 2;
 *  E. int x = –3; x = x >>> 32;
 *  F. int x = 3; x = x >> 31;
 *  G. byte x = -3 >>> 1;
 * Answer:
 * B. int x = –3; x = x >>> 31;
  */
public class Lab04Exercise5 {

    public static void main (String[] args) {
/*        short x1 = -3;
        x1 = x1 >> 1;
        System.out.println(x1);*/

        int x2 = -3;
        x2 = x2 >>> 31;
        System.out.println(x2);

/*        short x3 = -3;
        x3 = x3 >>> 1;
        System.out.println(x3);*/

        int x4 = 2 >> 2;
        System.out.println(x4);

        int x5 = -3;
        x5 = x5 >>> 32;
        System.out.println(x5);

        int x6 = 3;
        x6 = x6 >> 31;
        System.out.println(x6);

/*        byte x7 = -3 >>> 1;
        System.out.println(x7);*/
    }
}
