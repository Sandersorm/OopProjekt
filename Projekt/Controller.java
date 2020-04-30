package Projekt;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller extends Keegel {

    @FXML
    private Pane paneLoadLabel;

    @FXML
    private Label post;

    @FXML
    public void text() throws IOException {
        String key = "";
        try (BufferedReader failiLugeja = new BufferedReader(new InputStreamReader(new FileInputStream("Reeglid.txt"), "UTF-8"))) {
            String rida = failiLugeja.readLine();
            while (rida != null) {
                System.out.println(rida);
                key += rida;
                rida = failiLugeja.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Label label = new Label(key);
        label.setText(key);
    }


            Mängija mängija = new Mängija("mark", "tutt", 29);

    public void pressButton1(ActionEvent event) throws IOException {
        Parent uksMangijaParent = FXMLLoader.load(getClass().getResource("1Mangija.fxml"));
        Scene uksMangijaScene = new Scene(uksMangijaParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(uksMangijaScene);
        window.show();


    }

    public void pressButton2(ActionEvent event) throws IOException {
        Parent uksMangijaParent = FXMLLoader.load(getClass().getResource("2Mangija.fxml"));
        Scene uksMangijaScene = new Scene(uksMangijaParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(uksMangijaScene);
        window.show();
    }

    public void pressButton3(ActionEvent event) throws IOException {
        Parent uksMangijaParent = FXMLLoader.load(getClass().getResource("3Mangija.fxml"));
        Scene uksMangijaScene = new Scene(uksMangijaParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(uksMangijaScene);
        window.show();
    }

    public void pressButton4(ActionEvent event) throws IOException {
        Parent uksMangijaParent = FXMLLoader.load(getClass().getResource("4Mangija.fxml"));
        Scene uksMangijaScene = new Scene(uksMangijaParent);
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
        window.setScene(uksMangijaScene);
        window.show();
    }

    public void mängi(ActionEvent event) {
        System.out.println(mängija.toString());
    }
}
