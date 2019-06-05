package by.bntu.fitr.povt.alexeyd.lab03;

/**
 * What will be the result of the following code execution?
 * o A. 11-1
 * o B. 12-2
 * o C. 22-2
 * o D. 23-3
 * o E. 23-1
 * o F. a compilation error
 * o G. a runtime error
 * Answer:
 * F. a compilation error
 */
public class Lab03Exercise14 {

    public static void main(String[] args) {
        byte a = 1;
        byte b = a++;
        //byte c = +b; - Compile err
        System.out.println(a--);
        System.out.println(b--);
        //System.out.println(c--);
    }
}
