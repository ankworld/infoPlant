package controller;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

import static controller.mainMenuController.file;
import static controller.mainMenuController.loadedData;

/**
 * Created by anukul on 2/4/16.
 */

class resultPage1 {

    resultPage1(Event event) {

        Hyperlink[] hpls = new Hyperlink[loadedData.userArrayList.size()];
        System.out.println("Create " + hpls.length + " link");

        final Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        VBox root = new VBox();
        VBox statusBar = new VBox();
        ScrollPane sp = new ScrollPane();
        VBox vbox = new VBox();
        Scene scene = new Scene(new Group(),Color.BLACK);
        stage.setTitle("รายชื่อแปลงทั้งหมด   " + loadedData.userArrayList.size() + "   รายการ");

        for (int i = 0; i < loadedData.userArrayList.size(); i++) {

            final Hyperlink hpl = hpls[i] = new Hyperlink(String.format("%-30s%5s",loadedData.userArrayList.get(i).getListPlotInfo().getPlotName(),
                    loadedData.userArrayList.get(i).getListPlotInfo().getPlotYear1()));
            final int index = i;
            hpl.setFont(Font.font(16));
            hpl.setOnAction(e -> {
                ArrayList<Integer> indexDuplicate = new ArrayList<>();
                for (int j = 0; j < loadedData.userArrayList.size(); j++) {
                    if (loadedData.userArrayList.get(j).getListPlotInfo().getPlotName().equals(loadedData.userArrayList.get(index).getListPlotInfo().getPlotName())){
                        indexDuplicate.add(j);
                    }
                }
                System.out.println("This Farm has " + indexDuplicate.size() + " plans.");

                if (indexDuplicate.size() > 1) {
                    System.out.print("Do in If\n" + indexDuplicate.size());
                    Stage newStage = new Stage();
                    newStage.setTitle(loadedData.userArrayList.get(index).getListPlotInfo().getPlotName() + " GROUP ~");
                    Scene newScene = new Scene(new Group());
                    final Hyperlink[] newHpls = new Hyperlink[indexDuplicate.size()];

                    for (int j = 0; j < indexDuplicate.size(); j++) {
                        final  Hyperlink newHpl = newHpls[j] = new Hyperlink(String.format("%-30s%5s",loadedData.userArrayList.get(indexDuplicate.get(j)).getListPlotInfo().getPlotName(),
                                loadedData.userArrayList.get(indexDuplicate.get(j)).getListPlotInfo().getPlotYear1()));
                        final int nIndex = j;
                        newHpl.setOnAction(f -> linkToPage2(f, indexDuplicate.get(nIndex)));
                    }

                    ScrollPane nsp = new ScrollPane();
                    VBox nvbox = new VBox();

                    nvbox.setSpacing(5);
                    nvbox.getChildren().addAll(newHpls);

                    nsp.setContent(nvbox);
                    nsp.setFitToWidth(true);
                    newScene.setRoot(nsp);
                    newStage.setScene(newScene);
                    newStage.show();

                }
                else{
                    System.out.print("Do in Else\n");
                    linkToPage2(e, index);
                }
            });
        }

        Button button = new Button("<-Back");

        button.setOnAction(e -> {
            file = null;
            try {
                Parent parent = FXMLLoader.load(getClass().getResource("../fxml/mainMenu.fxml"));
                Scene sceneMain = new Scene(parent);
                stage.setScene(sceneMain);
            } catch (IOException eio) {
                eio.printStackTrace();
            }
        });

        TextField tfName = new TextField();
        tfName.setPromptText("กรอกชื่อ");
        TextField tfYear = new TextField();
        tfYear.setPromptText("กรอกปี");

        tfName.setOnAction(e -> {
            vbox.getChildren().removeAll(hpls);
            if (tfName.getText().isEmpty() && tfYear.getText().isEmpty()) {
                vbox.getChildren().addAll(hpls);
            } else {
                for (int i = 0; i < hpls.length; i++) {
                    if ((!tfName.getText().isEmpty() && loadedData.userArrayList.get(i).getListPlotInfo().getPlotName().contains(tfName.getText()))
                            || loadedData.userArrayList.get(i).getListPlotInfo().getPlotYear1().equals(tfYear.getText())) {
                        vbox.getChildren().addAll(hpls[i]);
                    }
                }
            }
        });


        tfYear.setOnAction(e -> {
            vbox.getChildren().removeAll(hpls);
            if (tfName.getText().isEmpty() && tfYear.getText().isEmpty()) {
                vbox.getChildren().addAll(hpls);
            } else {
                for (int i = 0; i < hpls.length; i++) {
                    if ((!tfName.getText().isEmpty() && loadedData.userArrayList.get(i).getListPlotInfo().getPlotName().contains(tfName.getText()))
                            || loadedData.userArrayList.get(i).getListPlotInfo().getPlotYear1().equals(tfYear.getText())) {
                        vbox.getChildren().addAll(hpls[i]);
                    }
                }
            }
        });

        vbox.setSpacing(5);
        vbox.getChildren().addAll(hpls);
        statusBar.getChildren().add(button);
        VBox.setVgrow(sp,Priority.ALWAYS);
        sp.setContent(vbox);
        sp.setFitToWidth(true);
        stage.setMinHeight(100);
        root.getChildren().addAll(tfName,tfYear,sp,statusBar);
        scene.setRoot(root);
        stage.setScene(scene);
        stage.show();
    }
    private void linkToPage2(Event e, int i){
        new resultPage2(e,i);
    }

}
