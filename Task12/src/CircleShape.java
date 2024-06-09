import java.awt.*;

public class CircleShape extends Shape {
    private int diameter;

    public CircleShape(int x, int y, int diameter, Color color) {
        super(x, y, color);
        this.diameter = diameter;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, diameter, diameter);
    }
}
