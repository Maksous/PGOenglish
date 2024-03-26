import java.util.ArrayList;
import java.util.List;

public class Student {
    public String fname;
    public String lname;
    public int indexNumber;
    public String email;
    public String address;
    public List<Double> grades = new ArrayList<>();

    public Student(String fname, String lname, int indexNumber, String email, String address, List<Double> grades) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = grades;
    }
    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }
    public double calculateAverageGrade(){
        if (grades.isEmpty()){
            throw new IllegalArgumentException("No grades for a student");
        }
        //implement calculation of the average
        double average = 0;
        return average;
    }


}
