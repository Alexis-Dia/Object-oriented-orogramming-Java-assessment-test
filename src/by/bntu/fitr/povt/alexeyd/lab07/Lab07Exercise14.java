package by.bntu.fitr.povt.alexeyd.lab07;

/**
 * Consider the following code
 *  A. 4
 *  B. 5
 *  C. 6
 *  D. 7
 *  E. 8
 *  F. 9
 *  G. 10
 *  H. a compiler error
 * !!!Answer: infinite 6 value(при условии что нет символа точки с запятой после (;) после условия). Если поставить символ
 * точки с запятой после (;), то ответ будет 11.
 */
public class Lab07Exercise14 {

    public static void main(String[] args) {
        int index = 5;
/*        while (index++ < 10) {
            System.out.println(index--);
        }*/
        while (index++ < 10)
            System.out.println(index--);

    }
}
