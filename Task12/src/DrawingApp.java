import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DrawingApp extends JFrame {
    private DrawingCanvas canvas;
    private ShapeFactory shapeFactory;

    public DrawingApp() {
        setTitle("Simple Drawing Application");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        shapeFactory = new ShapeFactory();
        canvas = new DrawingCanvas(shapeFactory);

        JMenuBar menuBar = new JMenuBar();
        JMenu shapeMenu = new JMenu("Shape");

        JMenuItem rectangleItem = new JMenuItem("Rectangle");
        rectangleItem.addActionListener(new ShapeMenuActionListener(ShapeType.RECTANGLE));

        JMenuItem circleItem = new JMenuItem("Circle");
        circleItem.addActionListener(new ShapeMenuActionListener(ShapeType.CIRCLE));

        shapeMenu.add(rectangleItem);
        shapeMenu.add(circleItem);
        menuBar.add(shapeMenu);

        setJMenuBar(menuBar);
        add(canvas, BorderLayout.CENTER);
    }

    private class ShapeMenuActionListener implements ActionListener {
        private ShapeType shapeType;

        public ShapeMenuActionListener(ShapeType shapeType) {
            this.shapeType = shapeType;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            shapeFactory.setShapeType(shapeType);
        }
    }
}
