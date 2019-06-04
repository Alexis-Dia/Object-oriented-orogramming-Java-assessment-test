package by.bntu.fitr.povt.alexeyd.lab06;

/**
 * What is the output of this program?
 * o A. -1
 * o B. 0
 * o C. 1
 * o D. compilation error (ошибка компиляции)
 * o E. runtime error owing to division by zero(ошибка выполнения из-за деления на ноль)
 * o F. unpredictable behavior (непредсказуемое поведение)
 * Answer:
 * C. 1
 */
public class Lab06Exercise10 {

    public static void main(String[] args) {
        int a = 4, b = 1;
        if (a != 4 && a / 0 == 0) {
            System.out.println("*");
            System.out.println(--b);
        } else {
            System.out.println("**");
            System.out.println(b--);
        }
    }
}
