package by.bntu.fitr.povt.alexeyd.lab06;

/**
 * What is the output of this program?
 * o A. 6
 * o B. 5
 * o C. 4
 * o D. 1
 * o E. there will be a compilation error
 * o F. there will be a runtime error
 * Answer:
 * B. 5
 */
public class Lab06Exercise9 {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        if ((a += 1) == b) {
            System.out.println("-" + b);
            System.out.println(b++);
        } else {
            System.out.println("+" + b);
            System.out.println(++b);
        }
    }
}
