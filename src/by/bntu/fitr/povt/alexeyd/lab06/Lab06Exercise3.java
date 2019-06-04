package by.bntu.fitr.povt.alexeyd.lab06;

/**
 * What will happen when you attempt to compile and run the following code?
 * o A. Compilation error, attempting to perform binary comparison on logical data type.
 * o B. Compilation and output of "Not equal! - 4".
 * o C. Compilation and output of "Not equal! - 8".
 * o D. Compilation and output of "We are equal! - 4".
 * o E. Compilation and output of "We are equal! - 8".
 * Answer:
 * C. Compilation and output of "Not equal! - 8".
 */
public class Lab06Exercise3 {

    public static void main (String[] args) {
        int number = 4;
        boolean bool = false;
        if (bool & (number *= 2) == 8) {
            System.out.println("We are equal! - " + number);
        } else {
            System.out.println("Not equal! - "+ number);
        }
    }
}
