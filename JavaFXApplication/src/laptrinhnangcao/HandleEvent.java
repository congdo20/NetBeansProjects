/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhnangcao;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author donct
 */
public class HandleEvent extends Application {
    @Override
    public void start(Stage primaryStage) {
        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btnOk = new Button("OK");
        Button btnCancel = new Button("Cancel");
        OKHandlerClass handler1 = new OKHandlerClass();
        btnOk.setOnAction(handler1);
        CancelHandlerClass handler2 = new CancelHandlerClass();
        btnCancel.setOnAction(handler2);
        pane.getChildren().addAll(btnOk, btnCancel);
        
        Scene scene = new Scene(pane, 200, 250);
        primaryStage.setTitle("HandlerEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    class OKHandlerClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            System.out.println("OK button clicked");
        }
    }
    
    class CancelHandlerClass implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent e) {
            System.out.println("Cancel button clicked");
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
