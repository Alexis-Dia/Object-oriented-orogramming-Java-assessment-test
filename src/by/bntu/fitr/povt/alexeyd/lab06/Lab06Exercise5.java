package by.bntu.fitr.povt.alexeyd.lab06;

/**
 * What is the result of the following code compilation and execution?
 * o A. 1
 * o B. 2
 * o C. 4
 * o D. default
 * o E. code will display nothing
 * o F. there will be a compilation error
 * o G. there will be a runtime error
 * Answer:
 * F. there will be a compilation error
  */
public class Lab06Exercise5 {

    public static void main (String[] args) {
        int num = 4;
        switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 1 + 1:
                System.out.println("2");
                break;
            case 2 * 2:
                System.out.println("4");
                break;
            default:
                break;
                //Comiling error
                //System.out.println("default");
        }
    }
}
