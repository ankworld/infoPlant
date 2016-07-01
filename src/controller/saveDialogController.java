package controller;

import javafx.beans.DefaultProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by anukul on 12/18/15.
 */
@DefaultProperty(value="image")
public class saveDialogController{

    @FXML private Button clearButton;
    @FXML private ImageView img;
    @FXML private Button okButton;
    @FXML private TextField tfSaveName;

    @FXML
    private void initialize(){

        Image image = new Image("controller/Save-icon.png");
        img.setImage(image);
        img.setFitWidth(100);
        img.setPreserveRatio(true);
        img.setSmooth(true);
        img.setCache(true);

        /* OK Button */
        okButton.setOnAction(event -> {
            String fName = tfSaveName.getText().trim()+".xml";
            if(tfSaveName.getText() == null ||  tfSaveName.getText().trim().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText("Input File Name");
                String s ="กรุณาใส่ชื่อไฟล์";
                alert.setContentText(s);
                alert.show();
            } else {
                Path path = Paths.get(fName);
                mainMenuController.file = new File(fName);
                if(!mainMenuController.file.exists()) {
                    try {
                        Files.createFile(path);
                        Charset charset = Charset.forName("US-ASCII");
                        String s1 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>";
                        String s2 = "\n<userWrapper />";
                        try (BufferedWriter writer = Files.newBufferedWriter(path, charset)) {
                            writer.write(s1, 0, s1.length());
                            writer.write(s2, 0, s2.length());
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    Stage stage = (Stage) okButton.getScene().getWindow();
                    stage.close();

                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR,"มีไฟล์ชื่อนี้แล้ว\nกรุณาตั้งชื่อใหม่", ButtonType.CLOSE);
                    alert.show();
                }
            }

        });

        clearButton.setOnAction(event -> tfSaveName.clear());

    }

}
