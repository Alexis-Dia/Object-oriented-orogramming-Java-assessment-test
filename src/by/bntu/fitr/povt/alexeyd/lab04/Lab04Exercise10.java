package by.bntu.fitr.povt.alexeyd.lab04;

/**
 * What does the following code print?
 * o A. 127
 * o B. -128
 * o C. 255
 * o D. 0
 * o E. -1
 * o F. 1
 * o G. a compiler error (произойдёт ошибка компиляции)
 * o H. a runtime exception (произойдёт ошибка выполнения)
 * Answer:
 * E. -1
 */
public class Lab04Exercise10 {

    public static void main(String[] args) {
        byte a = 127;
        byte b = -128;
        byte c = (byte) (a ^ b);
        System.out.println(c);
    }
}
