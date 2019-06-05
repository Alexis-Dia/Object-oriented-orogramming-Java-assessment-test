package by.bntu.fitr.povt.alexeyd.lab04;

/**
 * What is the result of the following code compilation and execution? (Каков будет результат компиляции и запуска данного кода?)
 * o A. 2, 2
 * o B. 2, 2.0
 * o C. a compilation error
 * o D. a runtime error
 * o E. 1, 1
 * o F. 0, 0
 * Answer:
 * C. a compilation error
 */
public class Lab04Exercise9 {

    public static void main(String[] args) {
        int a = 4;
        double b = 4.0;
        a <<= 1;
        //Compilation error
        //b <<= 2;
        //System.out.println(a + ", " + b);
    }
}
