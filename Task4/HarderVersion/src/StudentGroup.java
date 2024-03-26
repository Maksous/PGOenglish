import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    public String name;
    public List<Student> students = new ArrayList<>();

    public StudentGroup(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        //Implement method for adding students
        if (students.size() >=15 ){
            throw new IllegalArgumentException("The group is full");
        }
        //other if statement if the group is full
        //otherwise add student to the group [students.add(student);]
    }
}
