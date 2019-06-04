package by.bntu.fitr.povt.alexeyd.lab07;

/**
 * Which of the following are legal loop statements?
 * Answer:
 * D
 * E
  */
public class Lab07Exercise5 {

    public static void main (String[] args) {
/*        int i = 0;
        for (int j = 1, i = 1; j + i != 5; j++, i++) {
            //Illegal - variable  i is already defined
        }*/

/*        while (int i = 1 < 7) {
            //Illegal
        }*/

/*        int i = 0;
        while (i) {
            //Illegal - incompatible type
        }*/

/*        int i = 0;
        for (int j = 0; j + i != 5; j = i++) {
            //It's Ok!
        }*/

        int i = 0;
        do {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("i = " + i);
            //It's Ok!
        } while (i < 5);

    }
}
