package by.bntu.fitr.povt.alexeyd.lab06;

/**
 * What is the result of the following code compilation and execution (using JDK 7.0)?
 * A. default fruit
 * o B. banana fruit
 * o C. banana fruit
 *      grape fruit
 * o D. a runtime error
 * o E. banana fruit
 *      grape fruit
 *      default fruit
 * o F. the console will indicate nothing
 * o G. a compilation error because of broken sequence break
 * Answer:
 *   C. banana fruit
 *      grape fruit
 */
public class Lab06Exercise8 {

    public static void main(String[] args) {
        String fruit = "banana";
        switch (fruit) {
            case "apple":
                System.out.println("apple fruit");
                break;
            case "pear":
                System.out.println("pear fruit");
                break;
            case "ban" + "ana":
                System.out.println("banana fruit");
            case "grape":
                System.out.println("grape fruit");
                break;
            default:
                System.out.println("default fruit");
        }
    }
}
