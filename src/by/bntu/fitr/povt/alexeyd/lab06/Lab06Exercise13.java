package by.bntu.fitr.povt.alexeyd.lab06;

/**
 * What is the output of this program?
 * o A. -1
 * o B. 0
 * o C. 1
 * o D. compilation error
 * o E. runtime error owing to division by zero
 * o F. unpredictable behavior
 * Answer:
 * E. runtime error owing to division by zero
 */
public class Lab06Exercise13 {

    public static void main(String[] args) {
        int a = 4, b = 1;
        //??? What is the difference between % and &&???
        if (a != 4 & a / 0 == 0) {
            System.out.println("*");
            System.out.println(--b);
        } else {
            System.out.println("**");
            System.out.println(b--);
        }
    }
}