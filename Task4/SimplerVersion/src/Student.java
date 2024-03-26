import java.util.ArrayList;
import java.util.List;

public class Student {
    public String fname;
    public String lname;
    public String indexNumber;
    public String email;
    public String address;
    public List<Double> grades = new ArrayList<>();

    public Student(String fname, String lname, String indexNumber, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
    }

    public double calculateAverageGrade(){
        if (grades.isEmpty()){
            throw new IllegalArgumentException("Grades are missing");
        }
        //another one, limiting number of grades to 20
        else {
            double average = 0;
            //add to logic to sum the grades and divide by the number of grades
            return average;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", indexNumber='" + indexNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", grades=" + grades +
                '}';
    }

    public void addGrades(double grade) {
        this.grades.add(grade);
    }
}
