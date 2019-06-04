package by.bntu.fitr.povt.alexeyd.lab07;

/**
 * Consider the following code.
 *  A. i = 0; j = 0
 *  B. i = 0; j = 1
 *  C. i = 0; j = 2
 *  D. i = 0; j = 3
 *  E. i = 0; j = 4
 *  F. i = 1; j = 0
 *  G. i = 1; j = 1
 *  H. i = 1; j = 2
 *  I. i = 1; j = 3
 *  J. i = 1; j = 4
 *  K. i = 2; j = 0
 *  L. i = 2; j = 1
 *  M. i = 2; j = 2
 *  N. i = 2; j = 3
 *  O. i = 2; j = 4
 *  P. i = 3; j = 0
 *  Q. i = 3; j = 1
 *  R. i = 3; j = 2
 *  S. i = 3; j = 3
 *  T. i = 3; j = 4
 *  V. i = 4; j = 0
 *  U. i = 4; j = 1
 *  W. i = 4; j = 2
 *  X. i = 4; j = 3
 *  Y. i = 4; j = 4
 * Answer:
 * F. i = 1; j = 0
 * K. i = 2; j = 0
 * L. i = 2; j = 1
 * P. i = 3; j = 0
 * Q. i = 3; j = 1
 * R. i = 3; j = 2
 * V. i = 4; j = 0
 * U. i = 4; j = 1
 * W. i = 4; j = 2
 * X. i = 4; j = 3
 */
public class Lab07Exercise16 {

    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    continue outer;
                }
                System.out.printf("i = %d; j = %d\n", i, j);
            }
        }
    }
}
