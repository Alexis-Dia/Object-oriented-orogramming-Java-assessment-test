package by.bntu.fitr.povt.alexeyd.lab09;

/**
 * Given the following code, what is the expected outcome?
 * o A. [0, 1, 2, 3, 4, 5]
 * o B. [1, 2, 3, 4, 5, 6]
 * o C. [0, 1, 0, 3, 0, 5]
 * o D. [1, 0, 3, 0, 5, 0]
 * o E. [0, 0, 2, 0, 4, 0]
 * o F. [0, 2, 0, 4, 0, 6]
 * o G. a compiler error
 * o H. a runtime error
 * Answer: G. a compiler error
 */
public class Lab09Exercise18 {

    public static void main(String[] args) {
        String[][] heroes = {
                {"Axo", "Pudge ", "Sven", "Riki", "Lion"},
                {"Slardar", "Underlord", "Sniper", "Huskar", "Invoker"}};
        System.out.println(heroes[2][2]);
    }
}
