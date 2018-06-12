package main;

import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Main extends Application {
    @FXML
    public Button start;
    @FXML
    public TextField name;
    @FXML
    public MenuBar menuBar;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Markup.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setTitle("Panda's Tournament Thing");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void onAction(Event e) {
        if (e.getSource() == start)
            System.out.println(name.getText());
    }
}
