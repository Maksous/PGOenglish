import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
	int b = a.nextInt();

	if(b>0){
	    System.out.println("Positive");
    }else if (b<0){
	    System.out.println("Negative");
    }else{
	    System.out.println("Zero");
    }

    }
}
