package by.bntu.fitr.povt.alexeyd.lab04;

/**
 * Which statement is true about the following code? (Какое из нижеперечисленных утверждений верно характеризует описанный ниже код?)
 * o A. It always returns 0 (всегда возвращает значение 0).
 * o B. It always returns 1 (всегда возвращает значение 1).
 * o C. It always an int where every bit is 1, that is -1 (всегда возвращает значение типа int, где каждый бит равен 1, т.е. -1).
 * o D. The returned value varies depending on the argument (возвращаемое
 * значение зависит от передаваемого параметра).
 * Answer:
 * A. It always returns 0 (всегда возвращает значение 0).
 */
public class Lab04Exercise2 {

    private static int method(int number) {
        return number ^ number;
    }

    public static void main(String[] args) {
        System.out.println(method(10));
    }
}
