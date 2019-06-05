package by.bntu.fitr.povt.alexeyd.lab03;

/**
 * After execution of the following code fragment, what are the values of the variables a, b, and c ?
 * (Какие значения будут присвоены переменным a, b и c после выполнения нижеприведённого кода?
 * o A. c = 13, a = 7, b = 8
 * o B. c = 13, a = 6, b = 7
 * o C. c = 15, a = 7, b = 8
 * o D. c = 15, a = 6, b = 7
 * o E. there will be a compilation error (произойдёт ошибка компиляции)
 * Answer:
 * A. c = 13, a = 7, b = 8
 */
public class Lab03Exercise1 {

    public static void main(String[] args) {
        int a = 6;
        int b = 7;
        int c = a+++b++;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }

}
