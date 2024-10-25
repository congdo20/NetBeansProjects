package javafxapplication;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Text text = new Text(50, 20, "Programming is fun");
        pane.getChildren().add(text);
        
        text.setOnMouseDragged(e -> {
            text.setX(e.getX());
            text.setY(e.getY());
        });

        Text text1 = new Text(100, 100, "A");
        pane.getChildren().add(text1);
        
        pane.setOnKeyPressed(e -> {
            switch (e.getCode()) {
                case DOWN:
                    text1.setY(text1.getY() + 10);
                    break;
                case UP:
                    text1.setY(text1.getY() - 10);
                    break;
                case RIGHT:
                    text1.setX(text1.getX() + 10);
                    break;
                case LEFT:
                    text1.setX(text1.getX() - 10);
                    break;
                default:
                    if (Character.isLetterOrDigit(e.getText().charAt(0))) {
                        text1.setText(e.getText());
                    }
                    break;
            }
        });

        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setTitle("MouseEventDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        pane.requestFocus();  // Đảm bảo Pane có tiêu điểm ngay sau khi hiển thị
    }

    public static void main(String[] args) {
        launch(args);
    }
}
