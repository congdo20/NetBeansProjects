/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhnangcao;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author donct
 */
public class ListViewExperiments extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("TextView Experiments 1");
        ListView listView = new ListView();
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        listView.getItems().add("Item 1");
        listView.getItems().add("Item 2");
        listView.getItems().add("Item 3");
        
        Button button = new Button("Read Selected value");
        button.setOnAction((event) -> {
            ObservableList selectedIndices = listView.getSelectionModel().getSelectedIndices();
            
            for(Object o : selectedIndices) {
                System.out.println("o = " + o + " (" + o.getClass() + ")");
            }
        });
        
        VBox vBox = new VBox(listView,button);
        Scene scene = new Scene(vBox, 300, 120);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
}
