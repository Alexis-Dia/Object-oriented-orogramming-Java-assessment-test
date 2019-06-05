package by.bntu.fitr.povt.alexeyd.lab03;

/**
 * What results from attempting to compile and run the following code?
 * (Каким будет результат компиляции и выполнения данного кода?)
 * o A. the output: value is 5.6
 * o B. the output: value is 7
 * o C. the output: value is 3
 * o D. a compiler error at line 4 (ошибка компиляции в строке 4)
 * o Your answer:
 * Answer:
 *  B. the output: value is 7
 */
public class Lab03Exercise10 {

    public static void main(String[] args) {
        int x = 3;
        System.out.println("value is " + (x > 4 ? 5.6 : 7));
    }
}
