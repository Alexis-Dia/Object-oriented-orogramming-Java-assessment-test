package by.bntu.fitr.povt.alexeyd.lab01;

/**
 * Rearrange the following steps in the correct order for successful
 * Java installation (переставьте следующие шаги в правильной последовательности для успешной установки Java):
 * A) set the PATH environment to variable (установить переменную среды окружения операционной системы PATH)
 * B) install the JDK (установить JDK)
 * C) test the installation while running javac from the command line(протестировать готовность платформы путём вызова
 *      Javaкомпилятора javac в консоли)
 * D) download the JDK from Oracle website (скачать JDK с официального сайта фирмы Oracle)
 * Answer:
 * D
 * B
 * A
 * C
 */
public class Lab01Exercise12 {

    public static void main(String[] args) {
        byte[] array = new byte[6];
        for (byte i = 0; i++ < array.length;) {
            array[i] = i;
            System.out.print(array[i] + " ");
            i++;
        }
    }
}