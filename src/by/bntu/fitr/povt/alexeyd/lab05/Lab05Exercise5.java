package by.bntu.fitr.povt.alexeyd.lab05;

/**
 * Consider the following code.
 * o A. the code prints out: null
 * o B. the code prints out: active
 * o C. the code prints out: life
 * o D. the code prints out: I don't know
 * o E. compilation fails
 * Answer:
 * D. the code prints out: I don't know
  */
public class Lab05Exercise5 {

    public static void main (String[] args) {
        int age = 25;
        String string = (age > 35) ?
                "active"
                :
                (age < 24) ?
                        "life"
                        :
                        "I don't know";
        System.out.println(string);
    }
}
