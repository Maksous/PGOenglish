import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Andrew", "Koluszko", "s10000", "s10000@pjwstk.edu.pl","Koszykowa 56");
        s1.addGrades(4);
        s1.addGrades(4.5);
        //StudentGroup g1 = new StudentGroup("14c");
        //g1.add(s1);
        System.out.println(s1.toString());
    }
}