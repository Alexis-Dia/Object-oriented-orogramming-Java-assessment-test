package by.bntu.fitr.povt.alexeyd.lab06;

/**
 * Additional task from second presentation.
 */
public class Lab06Exercise16 {

    public static void main(String[] args) {

        int y = 2;
        //System.out.printf("%d", ++y + ++y + ++y + ++y);
        System.out.println(++y + ++y + ++y + ++y);

        int x = 2;
        //System.out.printf("%d", x++ + x++ + x++ +x++);
        System.out.println(x++ + x++ + x++ +x++);

        x = 4;
        y = 5;
        int z = 100 + 10 * -20 / ++x * (y - 1);
        System.out.println(z);
    }
}
