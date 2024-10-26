/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhnangcao;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author donct
 */
public class ScrollBarDemo extends Application  {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text(20, 20, "JavaFX Programming");
        ScrollBar sbHorizontal = new ScrollBar();
        ScrollBar sbVertical = new ScrollBar();
        sbVertical.setOrientation(Orientation.VERTICAL);
        
        Pane paneForText = new Pane();
        paneForText.getChildren().addAll(text);
        
        BorderPane pane = new BorderPane();
        pane.setCenter(paneForText);
        pane.setBottom(sbHorizontal);
        pane.setRight(sbVertical);
                
        sbHorizontal.valueProperty().addListener(ov -> text.setX(sbHorizontal.getValue() * paneForText.getWidth() / sbHorizontal.getMax()));
        
        sbVertical.valueProperty().addListener(ov -> text.setY(sbVertical.getValue() * paneForText.getHeight() / sbVertical.getMax()));
        
        Scene scene = new Scene(pane, 450, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }   
    
    
    public static void main(String[] args) {
        launch(args);
    }
}
