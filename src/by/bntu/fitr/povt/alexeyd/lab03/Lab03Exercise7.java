package by.bntu.fitr.povt.alexeyd.lab03;

/**
 * When a byte value is added to a char value, what is the type of the result?
 * (Каким будет тип результата сложения значения типа byte и значения?)
 * типа char ?)
 * o A. byte
 * o B. char
 * o C. int
 * o D. short
 * o E. you can’t add a byte to a char (невозможно добавить значение типа char к
 * значению типа char)
 * Answer:
 * C. int
 */
public class Lab03Exercise7 {

    public static void main(String[] args) {
        byte b = 3;
        char c = 'c';
        int i1 = c;
        int i2 = b;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(b + c);
    }
}
