import java.util.Scanner;

public class Task4 {
    private int[] numbers = new int[10];

    public int readNumber() throws NegativeNumberException{
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number < 0){
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return number;
    }

    //implementation of fillArray method
    //Create a
    //fillArray() method that dumps the values returned by the readNumber()
    //method into an array, if the readNumber() method throws an exception
    //during its operation, handle it by dumping a value of 0 into the array and
    //displaying an exception message on the console

}
