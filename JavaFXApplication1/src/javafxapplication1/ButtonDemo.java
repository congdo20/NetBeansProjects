package javafxapplication1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ButtonDemo extends Application {
    protected Text text = new Text(50, 50, "JavaFX Programming");

    protected BorderPane getPane() throws FileNotFoundException {
        HBox paneForButtons = new HBox(20);

        // Load hình ảnh từ đường dẫn
        ImageView imgLeft = new ImageView(new Image(new FileInputStream("C:\\Users\\donct\\Pictures\\anh1.png")));
        ImageView imgRight = new ImageView(new Image(new FileInputStream("C:\\Users\\donct\\Pictures\\anh1.png")));
        
        // Tạo các nút với hình ảnh
        Button btLeft = new Button("Left", imgLeft);
        Button btRight = new Button("Right", imgRight);

        paneForButtons.getChildren().addAll(btLeft, btRight);
        paneForButtons.setAlignment(Pos.CENTER);
        paneForButtons.setStyle("-fx-border-color: green");

        BorderPane pane = new BorderPane();
        pane.setBottom(paneForButtons);

        // Thêm text vào paneForText
        Pane paneForText = new Pane();
        paneForText.getChildren().add(text); // Bổ sung text vào Pane
        pane.setCenter(paneForText);

        // Thiết lập sự kiện cho nút
        btLeft.setOnAction(e -> text.setX(text.getX() - 10));
        btRight.setOnAction(e -> text.setX(text.getX() + 10));

        return pane;
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Scene scene = new Scene(getPane(), 450, 200);
            primaryStage.setTitle("ButtonDemo");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
