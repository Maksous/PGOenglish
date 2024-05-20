public class Cat extends Animal implements Moveable {

    public Cat(String name) {
        super(name);
    }

    @Override
    String getType() {
        return "Cat";
    }

    @Override
    public void start() {
        System.out.print("Cat starts");
    }

    @Override
    public void stop() {
        System.out.print("Cat stops");
    }
}
