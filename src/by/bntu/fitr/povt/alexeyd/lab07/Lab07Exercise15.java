package by.bntu.fitr.povt.alexeyd.lab07;

/**
 * Careful look at the following code.
 * o A. код находит среднее арифметическое N чисел
 * o B. код находит факториал числа N
 * o C. код находит последовательность первых N чисел ряда Фибоначчи
 * o D. код находит среднее геометрическое N чисел
 * o E. код считает сумму первых N натуральных чисел
 * o F. код считает квадрат числа N
 * o Your answer:
 * Answer:
 * E. код считает сумму первых N натуральных чисел
 */
public class Lab07Exercise15 {

    public static int method (int number) {
        int s = 0;
        for (int i = 0; i++ < number;) {
            s += i;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(method(10));
    }
}
