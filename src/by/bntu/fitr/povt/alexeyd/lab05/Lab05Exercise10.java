package by.bntu.fitr.povt.alexeyd.lab05;

/**
 * Given that the Integer class is in the java.lang package, and given.
 * Which, inserted independently at line 1, compiles? (Что, будучи добавлено в первую строчку кода, заставит его скомпилироваться?)
 * □ A. import static java.lang;
 * □ B. import static java.lang.Integer;
 * □ C. import static java.lang.Integer.*;
 * □ D. static import java.lang.Integer.*;
 * □ E. import static java.lang.Integer.MAX_VALUE;
 * □ F. static import java.lang.Integer.MAX_VALUE;
 * □ G. The code will also compile with none of the imports (код может скомпилироваться и без секций импорта).
 * □ H. None of the above statements are valid import syntax (ни одна из конструкций не является синтаксически правильной).
 * Answer:
 * G. The code will also compile with none of the imports (код может скомпилироваться и без секций импорта).
 */
public class Lab05Exercise10 {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
}
