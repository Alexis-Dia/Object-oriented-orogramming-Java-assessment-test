package by.bntu.fitr.povt.alexeyd.lab02;

/**
 * Which of the following lines compiles with error?
 * (Какие из следующих строк не скомпилируются?)
 *  A. byte maxByte = 255;
 *  B. char goto = 10;
 *  С. long creditCardNumber = 1_234_567_890;
 *  D. long myBankBalance = 2_000_000_000_000;
 *  E. long metalGroupValue = 0xAC_DC;
 *  F. long javaWords = 0xCAFE_BABE;
 *  G. long maxLong = 0xFF_FF_FF_FF_FF_FF_FF_FFL;
 * Answer:
 * A. byte maxByte = 255;
 * B. char goto = 10;
 * D. long myBankBalance = 2_000_000_000_000;
 */
public class Lab02Exercise12 {

    public static void main(String[] args) {
        //byte maxByte = 255;
        //char goto = 10;
        long creditCardNumber = 1_234_567_890;
        //long myBankBalance = 2_000_000_000_000;
        long metalGroupValue = 0xAC_DC;
        long javaWords = 0xCAFE_BABE;
        long maxLong = 0xFF_FF_FF_FF_FF_FF_FF_FFL;
    }
}