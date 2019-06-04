package by.bntu.fitr.povt.alexeyd.lab08;

/**
 * There is some Student class. What will the following code print?
 * Answer: Kate Kate Kate
 */
public class Lab08Exercise16 {

    public static void main(String[] args) {
        Student alex = new Student();
        alex.name = "Alex";

        Student vladislav = new Student();
        vladislav.name = "Vladislav";

        Student kate = new Student();
        kate.name = "Kate";

        alex = kate;
        vladislav = alex;

        System.out.printf("%s %s %s", alex.name, vladislav.name, kate.name);

    }
}
