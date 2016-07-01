package controller;

import javafx.event.Event;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import static controller.mainMenuController.loadedData;

/**
 * Created by anukul on 2/6/16.
 */
class resultPage2 {

    xmlParser xP = new xmlParser();

    private final String[] captions = xP.titleParser();

//    private final static String[] captions = new String[]{
//            "ประวัติแปลงปลูก",
//            "ข้อมูลพื้นฐานแปลงปลูก",
//            "ข้อมูลด้านพันธุ์",
//            "ข้อมูลการให้ผลผลิต",
//            "สรุปข้อมูลการให้ผลผลิตรายเดือน",
//            "ข้อมูลการใช้ปุ๋ย/สารบำรุงดิน",
//            "ประวัติการใช้ปุ๋ย",
//            "ข้อมูลการวิเคราะห์ตัวอย่างใบและคำแนะนำการใช้ปุ๋ย",
//            "ข้อมูลการวิเคราะห์ตัวอย่างดิน",
//            "อาการขาดธาตุอาหารและระดับความรุนแรงที่พบในแปลง",
//            "ข้อมูลการใช้สารเคมีกำจัดศัตรูพืช",
//            "ข้อมูลปริมาณน้ำฝน",
//            "ประวัติการฝึกอบรม",
//            "ประวัติการเข้าเยี่ยมแปลง",
//            "บันทึกการจัดการสวนปาล์ม",
//            "แบบประเมินสวนปาล์มน้ำมัน"
//    };

    resultPage2(Event event, int index){
        //Call in old stage
        //Stage stage = (Stage)  ((Node)event.getSource()).getScene().getWindow();
        //Call in new stage
        Stage stage = new Stage();
        Scene scene = new Scene(new Group());
        stage.setTitle(loadedData.userArrayList.get(index).getListPlotInfo().getPlotName() + " - " + loadedData.userArrayList.get(index).getListPlotInfo().getPlotYear1());
        Hyperlink[] hpls = new Hyperlink[16];
        for(int i = 0; i < hpls.length; i++){
            final Hyperlink hpl = hpls[i] = new Hyperlink(captions[i]);
            hpl.setFont(Font.font(16));
            final int tid = i;
            hpl.setOnAction(e -> {
                System.out.println("TID = " + tid);
                linkToPage3(e,index,tid);
            });
        }

        Label lblName = new Label();
        lblName.setText(loadedData.userArrayList.get(index).getListPlotInfo().getPlotName() + " : ปี-" + loadedData.userArrayList.get(index).getListPlotInfo().getPlotYear1());
        lblName.setFont(Font.font(22));
        VBox container = new VBox();
        container.getChildren().addAll(lblName);
        container.getChildren().addAll(hpls);
        ((Group) scene.getRoot()).getChildren().addAll(container);
        stage.setScene(scene);
        stage.show();

    }

    private void linkToPage3(Event event, int i, int ti){
        new resultPage3(event,i,ti);
    }


}
