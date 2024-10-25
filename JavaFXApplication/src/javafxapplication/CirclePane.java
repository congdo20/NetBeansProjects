package javafxapplication;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CirclePane extends Pane {
    private Circle circle = new Circle(50);
    
    public CirclePane() {
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        getChildren().add(circle);
    }
    
    public Circle getCircle() {
        return circle;
    }
    
    public void enlarge() {
        circle.setRadius(circle.getRadius() + 2);
    }
    
    public void shrink() {
        if (circle.getRadius() > 2) {
            circle.setRadius(circle.getRadius() - 2);
        }
    }
}
