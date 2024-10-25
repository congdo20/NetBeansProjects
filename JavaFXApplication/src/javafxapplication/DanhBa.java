/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication1;
/**
 *
 * @author donct
 */
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DanhBa extends Application {

    private TableView<Contact> table;
    private ObservableList<Contact> contactList;
    private TextField nameInput;
    private TextField phoneInput;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ứng dụng Quản lý Danh bạ");

        // Khởi tạo bảng và danh sách liên hệ
        contactList = FXCollections.observableArrayList();
        table = new TableView<>();
        table.setItems(contactList);

        // Cột tên
        TableColumn<Contact, String> nameColumn = new TableColumn<>("Tên");
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());

        // Cột điện thoại
        TableColumn<Contact, String> phoneColumn = new TableColumn<>("Điện thoại");
        phoneColumn.setCellValueFactory(cellData -> cellData.getValue().phoneProperty());

        table.getColumns().add(nameColumn);
        table.getColumns().add(phoneColumn);

        // Tạo ô văn bản để nhập tên và số điện thoại
        nameInput = new TextField();
        nameInput.setPromptText("Nhập tên");

        phoneInput = new TextField();
        phoneInput.setPromptText("Nhập số điện thoại");

        // Tạo nút thêm
        Button addButton = new Button("Thêm");
        addButton.setOnAction(e -> addContact());

        // Tạo nút xóa
        Button deleteButton = new Button("Xóa");
        deleteButton.setOnAction(e -> deleteContact());

        // Bố trí giao diện
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(8);
        grid.setHgap(10);

        grid.add(new Label("Tên:"), 0, 0);
        grid.add(nameInput, 1, 0);
        grid.add(new Label("Điện thoại:"), 0, 1);
        grid.add(phoneInput, 1, 1);
        grid.add(addButton, 0, 2);
        grid.add(deleteButton, 1, 2);
        grid.add(table, 0, 3, 2, 1);

        VBox vbox = new VBox();
        vbox.getChildren().add(grid);

        // Tạo cảnh và thiết lập
        Scene scene = new Scene(vbox, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addContact() {
        String name = nameInput.getText();
        String phone = phoneInput.getText();

        if (!name.isEmpty() && !phone.isEmpty()) {
            contactList.add(new Contact(name, phone));
            nameInput.clear();
            phoneInput.clear();
        } else {
            showAlert("Vui lòng nhập cả tên và số điện thoại.");
        }
    }

    private void deleteContact() {
        Contact selectedContact = table.getSelectionModel().getSelectedItem();
        if (selectedContact != null) {
            contactList.remove(selectedContact);
        } else {
            showAlert("Vui lòng chọn một mục để xóa.");
        }
    }

    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Cảnh báo");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
