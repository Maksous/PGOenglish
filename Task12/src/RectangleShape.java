import java.awt.Graphics;
import java.awt.Color;

public class RectangleShape extends Shape {
    private int width, height;

    public RectangleShape(int x, int y, int width, int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
