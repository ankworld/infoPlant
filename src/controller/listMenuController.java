package controller;

import dataStruct.stuctTable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.stream.Collectors;

import static controller.mainMenuController.file;
import static controller.mainMenuController.loadedData;

/**
 * Created by anukul on 12/17/15.
 */

public class listMenuController {

    @FXML
    private TableColumn<stuctTable, String> colD;
    @FXML
    private ChoiceBox<String> cbGroup;
    @FXML
    private TableView<stuctTable> tblist;
    @FXML
    private TableColumn<stuctTable, Integer> colA;
    @FXML
    private TableColumn<stuctTable, String> colB;
    @FXML
    private TableColumn<stuctTable, String> colC;
    @FXML
    private Button btnBack;
    @FXML
    private Button btnNext;
    @FXML
    private TextField tfID;

    static int indexId = 0;
    static String indexGroup = "";

    @FXML
    private void initialize() throws JAXBException {

        ObservableList<String> groupList = FXCollections.observableArrayList("หมู่ 1", "หมู่ 2 ", "หมู่ 5", "หมู่ 6", "หมู่ 7", "หมู่ 10", "หมู่ 11", "หมู่ 12", "หมู่ 15", "หมู่ 18");
        cbGroup.setItems(groupList);

        /* When XML Have been loaded */
        if (loadedData != null) {

            //Run serial Number
            for (int i = 0; i < loadedData.userArrayList.size(); i++) {
                loadedData.userArrayList.get(i).id = i;
            }

            //Set list to Table
            try {
                ObservableList<stuctTable> menuList = FXCollections.observableArrayList(
                        loadedData.userArrayList.stream().map(i -> new stuctTable(i.id, i.group, i.getListPlotInfo().getPlotName(), i.getListPlotInfo().getPlotYear1())).collect(Collectors.toList())
                );
                tblist.setItems(menuList);
            } catch (NullPointerException e) {
                ObservableList<stuctTable> items = FXCollections.observableArrayList(
                        new stuctTable(0, "", "Data Missing", "Data Missing")
                );
                tblist.setItems(items);
            }

        } else {
            ObservableList<stuctTable> items = FXCollections.observableArrayList(
                    new stuctTable(0, "", "", "")
            );
            tblist.setItems(items);

            /* Show Save Dialog if don't have select file at main menu */
            Parent dialog = null;
            Stage dialogStage = new Stage();
            try {
                dialog = FXMLLoader.load(getClass().getResource("../fxml/saveDialog.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            dialogStage.initStyle(StageStyle.UTILITY);
            assert dialog != null;
            dialogStage.setScene(new Scene(dialog));
            dialogStage.setAlwaysOnTop(true);
            dialogStage.show();
        }
        colA.setCellValueFactory(new PropertyValueFactory<>("sid"));
        colB.setCellValueFactory(new PropertyValueFactory<>("spname"));
        colC.setCellValueFactory(new PropertyValueFactory<>("soname"));
        colD.setCellValueFactory(new PropertyValueFactory<>("sgroup"));

        btnBack.setOnAction(event -> {
            file = null;
            loadedData = null;
            try {
                Parent parent = FXMLLoader.load(getClass().getResource("../fxml/mainMenu.fxml"));
                Scene scene = new Scene(parent);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setMinWidth(640);
                stage.setMinHeight(400);
                stage.setWidth(640);
                stage.setHeight(400);
                stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        btnNext.setOnAction(event -> {
            if (file == null) {
                /* Show Save Dialog if don't have select file at main menu */
                Parent dialog = null;
                Stage dialogStage = new Stage();
                try {
                    dialog = FXMLLoader.load(getClass().getResource("../fxml/saveDialog.fxml"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                dialogStage.initStyle(StageStyle.UTILITY);
                assert dialog != null;
                dialogStage.setScene(new Scene(dialog));
                dialogStage.setAlwaysOnTop(true);
                dialogStage.show();
            } else {
                if (tfID.getText() != null && !tfID.getText().trim().isEmpty()) {
                    indexId = Integer.parseInt(tfID.getText());
                    indexGroup = cbGroup.getValue();
                    try {
                        Parent parent = FXMLLoader.load(getClass().getResource("../fxml/allForm.fxml"));
                        Scene scene = new Scene(parent);
                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(scene);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


            }


        });
    }
}





