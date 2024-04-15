//ctrl + o - for override the methods
public class Tester extends Employee {

    public Tester(String name, String surname, String address, String email, String PESEL, int yearOfEmployment) {
        super(name, surname, address, email, PESEL, yearOfEmployment);
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary() + testType.size() * 300;
    }

    //method adding test type
}
