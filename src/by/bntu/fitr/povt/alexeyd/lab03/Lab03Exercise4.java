package by.bntu.fitr.povt.alexeyd.lab03;

/**
 * After execution of the following code fragment, what are the value of the variable a ? (Какое значение будет
 * присвоено переменной a после выполнения нижеприведённого кода?
 * o A. a = 2
 * o B. a = 3
 * o C. a = 4
 * o D. a = 5
 * Answer:
 *  D. a = 5
 */
public class Lab03Exercise4 {

    public static void main (String[] args) {
        int a = 2;
        a = a+++a++;
        System.out.println("a = " + a);
    }
}
