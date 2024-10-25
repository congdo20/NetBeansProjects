/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxapplication1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author donct
 */
public class ShowCircle extends Application{
    @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle();
        
        Pane pane = new Pane();
        pane.getChildren().add(circle);
        
        //rang buoc voi kich thuoc cua cua so
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.RED);
        circle.setFill(Color.GRAY);
        
        
        
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("Show Circle");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
 