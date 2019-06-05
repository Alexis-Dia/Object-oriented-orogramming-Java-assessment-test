package by.bntu.fitr.povt.alexeyd.lab04;

/**
 * What will be the result of the following code execution?
 * Answer:
 * 3
 */
public class Lab04Exercise11 {

    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        System.out.println(i += (++j < i++) ? 2 : 3.5);
    }
}
