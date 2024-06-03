
public class Car implements Comparable<Car>{
    private String modelName;
    private int year;

    public Car(String modelName, int year) {
        this.modelName = modelName;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", year=" + year +
                '}';
    }
    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.year, o.year);
    }
}
