import java.awt.Color;
import java.util.Random;

public class ShapeFactory {
    private ShapeType shapeType;
    private Random random;

    public ShapeFactory() {
        this.shapeType = ShapeType.RECTANGLE; // Default shape type
        this.random = new Random();
    }

    public void setShapeType(ShapeType shapeType) {
        this.shapeType = shapeType;
    }

    public Shape createShape(int x, int y) {
        Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

        // Create and return a new shape instance based on the current shapeType
        switch (shapeType) {
            case RECTANGLE:
                // Implement the logic to create a RectangleShape
                // Example:
                // return new RectangleShape(x, y, width, height, color);
            case CIRCLE:
                // Implement the logic to create a CircleShape
                // Example:
                // return new CircleShape(x, y, diameter, color);
            default:
                return null;
        }
    }
}
