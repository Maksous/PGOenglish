import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Task 1
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2015));
        cars.add(new Car("Ford", 2014));
        cars.add(new Car("Kia", 2050));
        //add 7 more cars

        Collections.sort(cars);

        for (Car car : cars){
            System.out.println(car);
        }

        //Task 2
        //Add 3 more items and implement "Item" class
        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item(1,"Pen"));
        items.add(new Item(2,"Eraser"));

        //Show the information about each item
        //Your implementation goes here

        //HashMap
        HashMap<Integer, String> itemMap = new HashMap<>();
        for (Item item : items){
            itemMap.put(item.getId(), item.getName());
        }

        for (Map.Entry<Integer,String> entry : ItemMap.entrySet()){
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        //Task 3
        ArrayList<ItemTask3> items = new ArrayList<>();
        for (int i = 6; i <=15; i++){
            items.add(new ItemTask3(i,"Item" + i));
        }
        List<ItemTask3> sublist = items.subList((0,5));
        HashSet<ItemTask3> itemSet = new HashSet<>(sublist);

        for (ItemTask3 item : itemSet){
            System.out.println(item);
        }
        //Task 4
        Task4 task4 = new Task4();
        System.out.println("Enter 10 numbers");
        task4.fillArray();

        System.out.println("Contents of array: ");
        for (int number : task4.numbers){
            System.out.println(number);
        }
    }
}