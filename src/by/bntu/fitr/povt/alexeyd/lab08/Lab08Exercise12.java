package by.bntu.fitr.povt.alexeyd.lab08;

/**
 * What is used to describe object action (behavior) in Java (что
 * обычно используется для описания поведения объекта в Java)?
 * o A) fields
 * o B) functions
 * o C) events
 * o D) modules
 * o E) properties
 * o F) imports
 * o G) delegates
 * o H) futures
 * o I) methods
 * o J) packages
 * Answer:
 * B) ?functions
 * I) methods
 */
public class Lab08Exercise12 {

    public static void main(String[] args) {
        byte[] array = new byte[6];
        for (byte i = 0; i++ < array.length;) {
            array[i] = i;
            System.out.print(array[i] + " ");
            i++;
        }
    }
}