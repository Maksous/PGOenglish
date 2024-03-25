public class Teacher {
    public String fname;
    public String lname;
    public String email;
    // list of Subjects

    public Teacher(String fname, String lname, String email) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
    }

    // method for assigning Teacher to the class

    //method for calculating the Teacher's Salary
    public double calculateSalary(Subject subject){
        double salary = 0;
        for (Subject subject : subjects){ //implement list of subjects first
            double rateForSubject = this.rate;
        }
    }

}
