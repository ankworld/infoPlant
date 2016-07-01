package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;

import static javafx.application.Platform.exit;

public class mainMenuController {

    @FXML
    private Button btnMerge;
    @FXML
    private Button btnView;
    @FXML
    private Button btnExit;
    @FXML
    private Button btnChoose;
    @FXML
    private Button btnAdd;

    @FXML
    private Label lbText;

    public static File file;
    static UserWrapper loadedData = new UserWrapper();

    @FXML
    private void initialize() {

        System.out.println("Program Started...");
        //----------File Choose-----------//
        btnChoose.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open SAV File");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("XML Files", "*.xml"),
                    new FileChooser.ExtensionFilter("All File", "*.*")
            );
            file = fileChooser.showOpenDialog(new Stage());
            if (file != null) {
                JAXBContext jc = null;
                try {
                    jc = JAXBContext.newInstance(UserWrapper.class);
                    Unmarshaller unmarshaller = jc.createUnmarshaller();
                    StreamSource xml = new StreamSource(file);
                    loadedData = (UserWrapper) unmarshaller.unmarshal(xml);
                    lbText.setText(file.getName());
                    lbText.setFont(Font.font(16));

                    System.out.println("Import File OK\n" + "loaded file : " + file.length() / 1000 + " KB");

                } catch (JAXBException e) {
                    e.printStackTrace();
                    Alert alert = new Alert(Alert.AlertType.ERROR, "You can't use this file\nPlease try again", ButtonType.CLOSE);
                    alert.show();
                }

            }
        });

        //------------Merge---------------//
        btnMerge.setOnAction(event -> {
            mergeData md = new mergeData();
            md.mergeFile();
        });

        //----------ADD/EDIT--------------//
        btnAdd.setOnAction(event -> {
            try {
                Parent parent = FXMLLoader.load(getClass().getResource("../fxml/listMenu.fxml"));
                Scene scene = new Scene(parent);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setMinHeight(680);
                stage.setMinWidth(490);
                stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        //-----------ViewData-------------//

        btnView.setOnAction((event) -> {
            if (file != null) new resultPage1(event);
            else {
                Alert alert = new Alert(Alert.AlertType.ERROR, "Choose File!!!", ButtonType.CLOSE);
                alert.show();
            }
        });


        //-----------EXIT-----------------//
        btnExit.setOnAction(event -> {
            exit();
            System.out.print("End Program");
        });
    }

}
