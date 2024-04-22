import java.util.Date;
import java.util.List;
//information about the students and the methods:
// - registering for students programme
// - adding grades
// - promotion to a new semester
// - showing the information about each student
public class Student {
    private static int nextIndexNumber = 1;
    private String indexNumber;
    private Date birthDate;
    private List<Grade> grades;

    public Student(String indexNumber, Date birthDate, List<Grade> grades) {
        this.indexNumber = "s" + nextIndexNumber++;
        //several other attributes in here
    }
}
