import java.util.Scanner;

public class Main {
    static double base_price = 40.0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the city");
        String city = scanner.nextLine();
        System.out.println("Enter the age");
        int age=scanner.nextInt();
        scanner.nextLine(); // for consuming the remaining newline
        System.out.println("Enter the day of the week");
        String dayOfWeek = scanner.nextLine();

        double finalPrice = calculatePrice(age, city, dayOfWeek);
        String discountMessage = getDiscountMessage(age, city, dayOfWeek);

        System.out.printf("Data: %s %d years old %s Ticket price: %.2f PLN\n", city, age, dayOfWeek,finalPrice);
        System.out.printf("Data: " + city + " " + age + " " + "years old" + " " + dayOfWeek + " " + "Ticket price: " + " " + finalPrice + " " + "PLN\n");
    }
    public static double calculatePrice(int age, String city, String dayOfWeek){
        double price = base_price;
        return price;
    }
    public static String getDiscountMessage(int age, String city, String dayOfWeek){
        return "No discount applied";
    }
}