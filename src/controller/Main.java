package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        xmlParser myParse = new xmlParser();
        myParse.titleParser();

        Parent root = FXMLLoader.load(getClass().getResource("../fxml/mainMenu.fxml"));
        primaryStage.setTitle("InfoPlant");
        primaryStage.setScene(new Scene(root));
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(640);
        primaryStage.show();
    }

    public static void main(String[] args) throws IOException, JAXBException {
        launch(args);
    }
}
