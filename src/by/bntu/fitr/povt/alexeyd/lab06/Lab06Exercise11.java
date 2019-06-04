package by.bntu.fitr.povt.alexeyd.lab06;

/**
 * Which statement is true about the following code fragment?
 * o A. the output: value is one
 * o B. the output: value is two
 * o C. the output: value is 3
 * o D. the output: value is undefined
 * o E. the output: value is one
 *      value is two
 * o F. the output: value is two
 *      value is three
 *      value is undefined
 * o G. the code is illegal because of the expression “2 + 1”
 * o H. the output: value is two
 *      value is undefined
 * o I. the output: value is two
 *      value is three
 *      value is undefined
 *      value is 3
 * o J. the output: value is two
 *      value is three
 *      value is 3
 *      value is undefined
 * Answer:
 *   H. the output:
 *          value is two
 *          value is undefined
 */
public class Lab06Exercise11 {

    public static void main(String[] args) {
        int num = 2;
        switch(num) {
            case 1:
                System.out.println("value is one");
            case 2:
                System.out.println("value is two");
            default:
                System.out.println("value is undefined");
                break;
            case 2 + 1:
                System.out.println("value is " + num);
        }
    }
}
