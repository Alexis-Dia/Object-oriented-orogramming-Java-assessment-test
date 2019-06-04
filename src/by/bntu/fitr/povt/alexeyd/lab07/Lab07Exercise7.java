package by.bntu.fitr.povt.alexeyd.lab07;

/**
 * 7) Consider the following code:
 * Answer:
 * B. i = 5; j = 1
 * D. i = 4; j = 2
 * I. i = 2; j = 4
 * L. i = 1; j = 5
 */
public class Lab07Exercise7 {

    public static void main(String[] args) {
        for (int i = 5, j = 0; j++ < 5; i--) {
            if (i == j ) continue;
            System.out.printf("i = %d; j = %d\n", i, j);
        }
    }
}
