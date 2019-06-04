package by.bntu.fitr.povt.alexeyd.lab07;

/**
 * What is the output of this program?
 * o A. 0
 * o B. 5
 * o C. 6
 * o D. 14
 * o E. a compilation error
 * o F. a runtime error
 * Answer:
 * E. a compilation error
 */
public class Lab07Exercise11 {

    public static void main(String[] args) {
        for (int i = 0, j = 5, sum = 0; i < 5 && j > 0; i++, j--) {
            sum += i;
            j = i;
        }
        // compilation error while compiling
        //System.out.println(sum);
    }
}
