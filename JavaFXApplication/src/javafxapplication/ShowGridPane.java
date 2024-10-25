package javafxapplication;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ShowGridPane extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        
        TextField firstName = new TextField();
        TextField mi = new TextField();
        TextField lastName = new TextField();
        
        pane.add(new Label("First Name: "), 0, 0);
        pane.add(firstName, 1, 0);
        pane.add(new Label("MI: "), 0, 1);
        pane.add(mi, 1, 1);
        pane.add(new Label("Last Name: "), 0, 2);
        pane.add(lastName, 1, 2);
        
        Button btAdd = new Button("Add Name");
        pane.add(btAdd, 1, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);

        btAdd.setOnAction(e -> {
            String firstNameText = firstName.getText();
            String miText = mi.getText();
            String lastNameText = lastName.getText();
            
            System.out.println("First Name: " + firstNameText);
            System.out.println("MI: " + miText);
            System.out.println("Last Name: " + lastNameText);
        });
        
        Scene scene = new Scene(pane);
        primaryStage.setTitle("GridPane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
