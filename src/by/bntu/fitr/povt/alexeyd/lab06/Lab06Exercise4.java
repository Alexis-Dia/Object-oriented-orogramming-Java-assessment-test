package by.bntu.fitr.povt.alexeyd.lab06;

/**
 * Consider the following code:
 * Answer:
 * 3
 */
public class Lab06Exercise4 {

    public static void main (String[] args) {
        boolean a = true;
        boolean b = false;
        byte num = 1;

        if (a && b) {
            num +=1;
        }

        if (b || a) {
            num += 2;
        }

        System.out.println(num++);
    }
}
