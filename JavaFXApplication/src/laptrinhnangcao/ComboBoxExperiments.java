/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhnangcao;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author donct
 */
public class ComboBoxExperiments extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("ComboBox Experiments 1");
        
        ComboBox comboBox = new ComboBox();
        comboBox.getItems().add("Choice 1");
        comboBox.getItems().add("Choice 2");
        comboBox.getItems().add("Choice 3");
        
        comboBox.setOnAction((event) -> {
            int selectedIndex = comboBox.getSelectionModel().getSelectedIndex();
            Object selectedItem = comboBox.getSelectionModel().getSelectedItem();
            
            System.out.println("Selection made: [" + selectedIndex + "] " + selectedItem);
            System.out.println("ComboBox.getValue(): " + comboBox.getValue());
        });
        
        HBox hBox = new HBox(comboBox);
        Scene scene  = new Scene(hBox, 200, 120);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
}
