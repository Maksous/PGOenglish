public class Ticket{
    double base_price = 40.0; // private static final double BASE_PRICE=40.0;
    String city;
    int age;
    String dayOfTheWeek;
    double finalPrice;
    String discountMessage;

    public Ticket(String city, int age, String dayOfTheWeek) {
        this.city = city;
        this.age = age;
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public double calculatePrice(){
        double price = base_price;
        if (dayOfTheWeek=="Thursday" || age <10){
            return 0;
        }
        if(age>=10 && age <= 18){
            price*=0.5; // price=price*0.5
        }
        if(city == "Warsaw"){
            price*=0.9;
        }
        return price;
    }
    public String getDiscountMessage(){
        //create if else statement with proper discount messages
        return "No discount applied";
    }


}
