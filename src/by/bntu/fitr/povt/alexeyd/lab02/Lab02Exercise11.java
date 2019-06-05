package by.bntu.fitr.povt.alexeyd.lab02;

/**
 * Which lines of comment are legal in Java?
 * (Выберите варианты комментариев в исходном файле Java, которые не приведут к ошибке?)
 * Answer:
 * A, C, E, F, G
 * (All answers exclude B, D, H)
 */
public class Lab02Exercise11 {

    public static void main(String[] args) {
        /* This is a valid comment in java. */
    //B    /* /* This is a valid comment in java. */ */
        // This is a valid comment in java
    //D    <!-- This is a valid comment in java -->
        /** This is a valid comment in java. */
        /* This is a valid comment in java. **/
        //! This is a valid comment in java
    //H    # This is a valid comment in java
    }
}
