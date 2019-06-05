package by.bntu.fitr.povt.alexeyd.lab02;

/**
 * Which of the following statements are true?
 *  A. We can save the java-source file without any name (мы можем сохранить
 *      исходный файл на языке Java не используя никакого имени).
 *  B. We can have any numbers of classes with default modifier in java-source file
 *      (мы можем описать в одном исходном файле на языке Java любое
 * количество классов с модификатором доступа по умолчанию).
 *  C. Empty java-source file is valid file for java-compiler (пустой исходный файл
 *      на языке Java является валидным для Java-компилятора).
 *  D. We can have any numbers of public classes in java-source file (мы можем
 *      описать в одном исходном файле на языке Java любое количество
 * классов с открытым (публичным - public) модификатором доступа).
 *  E. The name of java-source file may differ from the name of the class described in
 *      it (имя исходного файла на языке Java и имя класса, описанного в нём,
 *      могут не совпадать).
 * Answer:
 *      A. We can save the java-source file without any name (мы можем сохранить
 * исходный файл на языке Java не используя никакого имени).
 *       B. We can have any numbers of classes with default modifier in java-source file
 * (мы можем описать в одном исходном файле на языке Java любое
 * количество классов с модификатором доступа по умолчанию).
 *      C. Empty java-source file is valid file for java-compiler (пустой исходный файл
 * на языке Java является валидным для Java-компилятора).
 *      E. The name of java-source file may differ from the name of the class described in
 * it (имя исходного файла на языке Java и имя класса, описанного в нём,
 * могут не совпадать)
 */
public class Lab02Exercise1 {
    public static void main(String[] args) {
        //X x = new X(); //X cannot run from another package because he isn't public
        Y y = new Y();
    }
}
