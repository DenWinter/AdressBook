package ru.dwinter.javabegin.start;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent scene = FXMLLoader.load(getClass().getResource("../fxml/mainScreen.fxml"));
        primaryStage.setTitle("Адресная книга");
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(600);
        primaryStage.setScene(new Scene(scene, 600, 350));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
