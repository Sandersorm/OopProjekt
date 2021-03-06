package Projekt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Kasutajaliides.fxml"));
        primaryStage.setTitle("Keegel");
        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();
    }
}
