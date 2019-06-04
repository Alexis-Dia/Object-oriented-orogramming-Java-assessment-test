package by.bntu.fitr.povt.alexeyd.lab07;

/**
 * Сколько раз выполниться тело цикла в следующем коде?
 * o A. 0
 * o B. 1
 * o C. 2
 * o D. 3
 * o E. 4
 * o F. 5
 * o G. 6
 * o Your answer:
 * Answer:
 * Your answer: infinite
 */
public class Lab07Exercise9 {

    public static void main(String[] args) {
        double index = 5;
        while (index++ >= 5) {
            System.out.println("index = " + index);
        }
    }
}
