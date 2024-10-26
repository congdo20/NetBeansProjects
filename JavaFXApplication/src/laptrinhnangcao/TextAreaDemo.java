/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhnangcao;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author donct
 */
public class TextAreaDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Text Area Demo");
        TextArea textArea = new TextArea();
        textArea.setPrefColumnCount(20);
        textArea.setPrefRowCount(5);
        textArea.setWrapText(true);
        textArea.setStyle("-fx-text-fill: red");
        textArea.setFont(Font.font("Courier", 20));
        ScrollPane scrollBar = new ScrollPane(textArea);
        
        Button button = new Button("Click to get text");
        button.setMinWidth(50);
        button.setOnAction(action -> {
            System.out.println(textArea.getText());
            textArea.setText("Clicked!");
        });
        
        
        VBox vBox = new VBox(scrollBar, button);
        Scene scene = new Scene(vBox, 200, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
