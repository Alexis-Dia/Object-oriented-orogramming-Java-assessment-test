package by.bntu.fitr.povt.alexeyd.lab09;

/**
 * What is the output of this program?
 * o A. 4
 * o B. 4.459999999999999
 * o C. 4.4599
 * o D. 4.46
 * o E. 5
 * Answer: B. 4.459999999999999
 */
public class Lab09Exercise20 {

    public static void main(String[] args) {
        double numbers[] = {11.9, 2.3, 1.6, .8, 5.7};
        double sum = 0;
        for (int i = 0; i < numbers.length; ++i) {
            sum += numbers[i];
        }
        System.out.println(sum);
        System.out.print(sum / numbers.length);
    }
}
