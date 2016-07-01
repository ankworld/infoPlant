package controller;

import dataStruct.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.stream.Collectors;

import static controller.mainMenuController.loadedData;

/**
 * Created by anukul on 2/6/16.
 */

class resultPage3 {
    private final static String[] captions = new String[]{
            "ประวัติแปลงปลูก",
            "ข้อมูลพื้นฐานแปลงปลูก",
            "ข้อมูลด้านพันธุ์",
            "ข้อมูลการให้ผลผลิต",
            "สรุปข้อมูลการให้ผลผลิตรายเดือน",
            "ข้อมูลการใช้ปุ๋ย/สารบำรุงดิน",
            "ประวัติการใช้ปุ๋ย",
            "ข้อมูลการวิเคราะห์ตัวอย่างใบและคำแนะนำการใช้ปุ๋ย",
            "ข้อมูลการวิเคราะห์ตัวอย่างดิน",
            "อาการขาดธาตุอาหารและระดับความรุนแรงที่พบในแปลง",
            "ข้อมูลการใช้สารเคมีกำจัดศัตรูพืช",
            "ข้อมูลปริมาณน้ำฝน",
            "ประวัติการฝึกอบรม",
            "ประวัติการเข้าเยี่ยมแปลง",
            "บันทึกการจัดการสวนปาล์ม",
            "แบบประเมินสวนปาล์มน้ำมัน"
    };

//    private final static String[] captions = xmlParser.titleParser();

    resultPage3(Event event, int index, int tid) {
        //Stage stage = (Stage)  ((Node)event.getSource()).getScene().getWindow();
        Stage stage = new Stage();
        stage.setTitle(captions[tid] + loadedData.userArrayList.get(index).getListPlotInfo().getPlotName() + " - " + loadedData.userArrayList.get(index).getListPlotInfo().getPlotYear1());
        Scene scene = new Scene(new Group());

        VBox container = new VBox();
        switch (tid) {
            case 0:
                container = showPlotInfo(index);
                break;
            case 1:
                container = showPlotBG(index);
                break;
            case 2:
                container = showBreeding(index);
                break;
            case 3:
                container = showY(index);
                break;
            case 4:
                container = showMY(index);
                break;
            case 5:
                container = showFC(index);
                break;
            case 6:
                container = showFR(index);
                break;
            case 7:
                container = showSLA(index);
                break;
            case 8 :
                container = showSA(index);
                break;
            case 9:
                container = showND(index);
                break;
            case 10:
                container = showPA(index);
                break;
            case 11 :
                container = showPC(index);
                break;
            case 12:
                container = showTH(index);
                break;
            case 13:
                container = showGV(index);
                break;
            case 14:
                container = showMG(index);
                break;
            default:
                System.out.print("ComingSoon");
        }

        ScrollPane sp = new ScrollPane();
        sp.setContent(container);
        sp.setFitToHeight(true);
        sp.setFitToWidth(true);
        sp.setHbarPolicy(ScrollPane.ScrollBarPolicy.AS_NEEDED);
        scene.setRoot(sp);
        stage.setScene(scene);
        stage.show();

    }

    private VBox showPlotInfo(int i) {
        final VBox vbox = new VBox();
        final Label[] lbl = new Label[14];
        lbl[0] = new Label("ชื่อแปลง : " + loadedData.userArrayList.get(i).getListPlotInfo().getPlotName());
        lbl[1] = new Label("ที่อยู่ : " + loadedData.userArrayList.get(i).getListPlotInfo().getPlotAddr());
        lbl[2] = new Label("ประเภทของเอกสารสิทธิ์ : " + loadedData.userArrayList.get(i).getListPlotInfo().getPlotType());
        lbl[3] = new Label("ปีที่ปลูก : " + loadedData.userArrayList.get(i).getListPlotInfo().getPlotYear1());
        lbl[4] = new Label("ช่วงอายุ : " + loadedData.userArrayList.get(i).getListPlotInfo().getPlotYear2());
        lbl[5] = new Label("พื้นที่ปลูก : " + loadedData.userArrayList.get(i).getListPlotInfo().getPlotSize() + " ไร่");
        lbl[6] = new Label("จำนวนต้น : " + loadedData.userArrayList.get(i).getListPlotInfo().getPlotTreeAll() + "ต้น");
        lbl[7] = new Label("จำนวนต้นตาย : " + loadedData.userArrayList.get(i).getListPlotInfo().getPlotTreeDead() + "ต้น");
        lbl[8] = new Label("จำนวนต้นปลูกทดแทน : " + loadedData.userArrayList.get(i).getListPlotInfo().getPlotTreeRe() + "ต้น");
        lbl[9] = new Label("สาเหตุการตาย : " + loadedData.userArrayList.get(i).getListPlotInfo().getPlotHowtoDead());
        lbl[10] = new Label("ชื่อเจ้าของแปลง : " + loadedData.userArrayList.get(i).getListPlotInfo().getPlotOwnnerName());
        lbl[11] = new Label("ที่อยู่ : " + loadedData.userArrayList.get(i).getListPlotInfo().getPlotOwnnerAddr());
        lbl[12] = new Label("โทรศัพท์ : " + loadedData.userArrayList.get(i).getListPlotInfo().getPlotOwnnerTel());
        lbl[13] = new Label("หมายเหตุ : " + loadedData.userArrayList.get(i).getListPlotInfo().getPlotAnno());
        lbl[0].setFont(Font.font(16));
        lbl[1].setFont(Font.font(16));
        lbl[2].setFont(Font.font(16));
        lbl[3].setFont(Font.font(16));
        lbl[4].setFont(Font.font(16));
        lbl[5].setFont(Font.font(16));
        lbl[6].setFont(Font.font(16));
        lbl[7].setFont(Font.font(16));
        lbl[8].setFont(Font.font(16));
        lbl[9].setFont(Font.font(16));
        lbl[10].setFont(Font.font(16));
        lbl[11].setFont(Font.font(16));
        lbl[12].setFont(Font.font(16));
        lbl[13].setFont(Font.font(16));

        vbox.getChildren().addAll(lbl);
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(5);
        return vbox;
    }

    private VBox showPlotBG(int i) {
        final VBox vbox = new VBox();
        final Label[] lbl = new Label[13];

        lbl[0] = new Label("ชุดดินตามแผนที่ดิน : " + loadedData.userArrayList.get(i).getListPlotBG().getBgLand());
        lbl[1] = new Label("พิกัดภูมิศาสตร์ : " + loadedData.userArrayList.get(i).getListPlotBG().getBgGPS());
        lbl[2] = new Label("สภาพพื้นที่ : " + loadedData.userArrayList.get(i).getListPlotBG().getBgLandStatus());
        lbl[3] = new Label("ลักษณะของเนื้อดิน : " + loadedData.userArrayList.get(i).getListPlotBG().getBgSoilType());
        lbl[4] = new Label("การเตรียมพื้นที่ปลูก : " + loadedData.userArrayList.get(i).getListPlotBG().getBgPreType());
        lbl[5] = new Label("การอนุรักษ์ดิน : " + loadedData.userArrayList.get(i).getListPlotBG().getBgPreserve());
        lbl[6] = new Label("วิธีการให้น้ำ : " + loadedData.userArrayList.get(i).getListPlotBG().getBgWater());
        lbl[7] = new Label("แหล่งน้ำที่ใช้ : " + loadedData.userArrayList.get(i).getListPlotBG().getBgWaterWhere());
        lbl[8] = new Label("การใช้พื้นที่ก่อนปลูกปาล์มน้ำมัน : " + loadedData.userArrayList.get(i).getListPlotBG().getBgPreUse());
        lbl[9] = new Label("รูปแบบของการปลูก : " + loadedData.userArrayList.get(i).getListPlotBG().getBgLandSize() + "\t" + loadedData.userArrayList.get(i).getListPlotBG().getBgLandSize2());
        lbl[10] = new Label("การเก็บเกี่ยว : " + loadedData.userArrayList.get(i).getListPlotBG().getBgHarvest());
        lbl[11] = new Label("การกำจัดศัตรูพืชด้วยชีวะวิธี : " + loadedData.userArrayList.get(i).getListPlotBG().getBgKill());
        lbl[12] = new Label("หมายเหตุ : " + loadedData.userArrayList.get(i).getListPlotBG().getBgAnno());
        lbl[0].setFont(Font.font(16));
        lbl[1].setFont(Font.font(16));
        lbl[2].setFont(Font.font(16));
        lbl[3].setFont(Font.font(16));
        lbl[4].setFont(Font.font(16));
        lbl[5].setFont(Font.font(16));
        lbl[6].setFont(Font.font(16));
        lbl[7].setFont(Font.font(16));
        lbl[8].setFont(Font.font(16));
        lbl[9].setFont(Font.font(16));
        lbl[10].setFont(Font.font(16));
        lbl[11].setFont(Font.font(16));
        lbl[12].setFont(Font.font(16));

        vbox.getChildren().addAll(lbl);
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(5);
        return vbox;
    }

    private VBox showBreeding(int i) {
        final VBox vbox = new VBox();
        final Label[] lbl = new Label[5];

        String str1, str2;

        switch (loadedData.userArrayList.get(i).getListBleeding().getRb1()) {
            case "rbC14":
                str1 = "ซื้อเมล็ดงอกมาเพาะเอง";
                break;
            case "rbC15":
                str1 = "ซื้อจากแปลงเพาะกล้าของบริษัท";
                break;
            case "rbC16":
                str1 = "รับแจกจากหน่วยงานราชการ";
                break;
            case "rbC17":
                str1 = "";
                break;
            default:
                str1 = "";
        }

        switch (loadedData.userArrayList.get(i).getListBleeding().getRb2()) {
            case "rbC21":
                str2 = "ลูกผสม DxP";
                break;
            case "rbC22":
                str2 = "";
                break;
            default:
                str2 = "";
        }


        lbl[0] = new Label("ที่มาของต้นพันธุ์ : " + str1 + "  " + loadedData.userArrayList.get(i).getListBleeding().getBdHowTo());
        lbl[1] = new Label("ชนิดของต้นพันธุ์ : " + str2 + "  " + loadedData.userArrayList.get(i).getListBleeding().getBdType());
        lbl[2] = new Label("การคัดกล้า : " + loadedData.userArrayList.get(i).getListBleeding().getBdChoose());
        lbl[3] = new Label("อายุต้นกล้าที่ใช้ปลูก : " + loadedData.userArrayList.get(i).getListBleeding().getBdAge() + "ปี");
        lbl[4] = new Label("หมายเหตุ : " + loadedData.userArrayList.get(i).getListBleeding().getBdAnno());
        lbl[0].setFont(Font.font(16));
        lbl[1].setFont(Font.font(16));
        lbl[2].setFont(Font.font(16));
        lbl[3].setFont(Font.font(16));

        vbox.getChildren().addAll(lbl);
        vbox.setPadding(new Insets(10));
        vbox.setSpacing(5);
        return vbox;
    }

    private VBox showY(int i) {
        VBox vbox = new VBox();
        TableView<tbYield> table = new TableView<>();

        TableColumn<tbYield, String> dateCol = new TableColumn<>("วัน/เดือน/ปี");
        TableColumn mainCol1 = new TableColumn("ทะลาย");
        TableColumn<tbYield, String> w1Col = new TableColumn<>("น้ำหนัก (กก.)");
        TableColumn<tbYield, String> c1Col = new TableColumn<>("ราคา");
        mainCol1.getColumns().addAll(w1Col, c1Col);
        TableColumn<tbYield, String> s1Col = new TableColumn<>("รวมเงินทะลาย(บาท)");
        TableColumn mainCol2 = new TableColumn("ลูกร่วง");
        TableColumn<tbYield, String> w2Col = new TableColumn<>("น้ำหนัก (กก.)");
        TableColumn<tbYield, String> c2Col = new TableColumn<>("ราคา");
        mainCol2.getColumns().addAll(w2Col, c2Col);
        TableColumn<tbYield, String> s2Col = new TableColumn<>("รวมเงินลูกร่วง(บาท)");
        TableColumn<tbYield, String> swCol = new TableColumn<>("น้ำหนักรวม(กก.)");
        TableColumn<tbYield, String> scCol = new TableColumn<>("รวมเงิน(บาท)");

        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        w1Col.setCellValueFactory(new PropertyValueFactory<>("bunchWeight"));
        c1Col.setCellValueFactory(new PropertyValueFactory<>("bunchCost"));
        s1Col.setCellValueFactory(new PropertyValueFactory<>("bunchSum"));
        w2Col.setCellValueFactory(new PropertyValueFactory<>("productWeight"));
        c2Col.setCellValueFactory(new PropertyValueFactory<>("productCost"));
        s2Col.setCellValueFactory(new PropertyValueFactory<>("productSum"));
        swCol.setCellValueFactory(new PropertyValueFactory<>("sumWeight"));
        scCol.setCellValueFactory(new PropertyValueFactory<>("sumCost"));

        ObservableList ListY = FXCollections.observableArrayList(
                loadedData.userArrayList.get(i).getListY().stream().map(s -> new tbYield(s.getDate(), s.getBunchWeight(),
                        s.getBunchCost(), s.getBunchSum(), s.getProductWeight(), s.getProductCost(), s.getProductSum(), s.getSumWeight(), s.getSumCost())).collect(Collectors.toList())
        );

        table.setItems(ListY);
        table.getColumns().addAll(dateCol, mainCol1,s1Col, mainCol2,s2Col, swCol, scCol);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        vbox.setFillWidth(true);
        vbox.getChildren().addAll(table);
        VBox.setVgrow(table, Priority.ALWAYS);

        return vbox;
    }

    private VBox showMY(int i) {
        VBox vbox = new VBox();
        TableView<tbMYield> table = new TableView<>();

        TableColumn<tbMYield, String> monthCol = new TableColumn<>("เดือน");
        TableColumn main57Col = new TableColumn("ปี2557");
        TableColumn<tbMYield, String> w57Col = new TableColumn<>("น้ำหนักทะลายและลูกร่วง");
        TableColumn<tbMYield, String> c57Col = new TableColumn<>("รวมเงิน");
        TableColumn<tbMYield, String> a57Col = new TableColumn<>("ราคาเฉลี่ย");
        main57Col.getColumns().addAll(w57Col, c57Col, a57Col);
        TableColumn main58Col = new TableColumn("ปี2558");
        TableColumn<tbMYield, String> w58Col = new TableColumn<>("น้ำหนักทะลายและลูกร่วง");
        TableColumn<tbMYield, String> c58Col = new TableColumn<>("รวมเงิน");
        TableColumn<tbMYield, String> a58Col = new TableColumn<>("ราคาเฉลี่ย");
        main58Col.getColumns().addAll(w58Col, c58Col, a58Col);
        TableColumn main59Col = new TableColumn("ปี2559");
        TableColumn<tbMYield, String> w59Col = new TableColumn<>("น้ำหนักทะลายและลูกร่วง");
        TableColumn<tbMYield, String> c59Col = new TableColumn<>("รวมเงิน");
        TableColumn<tbMYield, String> a59Col = new TableColumn<>("ราคาเฉลี่ย");
        main59Col.getColumns().addAll(w59Col, c59Col, a59Col);
        TableColumn main60Col = new TableColumn("ปี2560");
        TableColumn<tbMYield, String> w60Col = new TableColumn<>("น้ำหนักทะลายและลูกร่วง");
        TableColumn<tbMYield, String> c60Col = new TableColumn<>("รวมเงิน");
        TableColumn<tbMYield, String> a60Col = new TableColumn<>("ราคาเฉลี่ย");
        main60Col.getColumns().addAll(w60Col, c60Col, a60Col);
        TableColumn main61Col = new TableColumn("ปี2561");
        TableColumn<tbMYield, String> w61Col = new TableColumn<>("น้ำหนักทะลายและลูกร่วง");
        TableColumn<tbMYield, String> c61Col = new TableColumn<>("รวมเงิน");
        TableColumn<tbMYield, String> a61Col = new TableColumn<>("ราคาเฉลี่ย");
        main61Col.getColumns().addAll(w61Col, c61Col, a61Col);

        monthCol.setCellValueFactory(new PropertyValueFactory<>("month"));
        w57Col.setCellValueFactory(new PropertyValueFactory<>("sumWeight2557"));
        c57Col.setCellValueFactory(new PropertyValueFactory<>("sumCost2557"));
        a57Col.setCellValueFactory(new PropertyValueFactory<>("avg2557"));
        w58Col.setCellValueFactory(new PropertyValueFactory<>("sumWeight2558"));
        c58Col.setCellValueFactory(new PropertyValueFactory<>("sumCost2558"));
        a58Col.setCellValueFactory(new PropertyValueFactory<>("avg2558"));
        w59Col.setCellValueFactory(new PropertyValueFactory<>("sumWeight2559"));
        c59Col.setCellValueFactory(new PropertyValueFactory<>("sumCost2559"));
        a59Col.setCellValueFactory(new PropertyValueFactory<>("avg2559"));
        w60Col.setCellValueFactory(new PropertyValueFactory<>("sumWeight2560"));
        c60Col.setCellValueFactory(new PropertyValueFactory<>("sumCost2560"));
        a60Col.setCellValueFactory(new PropertyValueFactory<>("avg2560"));
        w61Col.setCellValueFactory(new PropertyValueFactory<>("sumWeight2561"));
        c61Col.setCellValueFactory(new PropertyValueFactory<>("sumCost2561"));
        a61Col.setCellValueFactory(new PropertyValueFactory<>("avg2561"));

        ObservableList<tbMYield> ListMY = FXCollections.observableArrayList(
                loadedData.userArrayList.get(i).getListMY().stream().map(s -> new tbMYield(s.getMonth(),
                        s.getSumWeight2557(), s.getSumCost2557(), s.getAvg2557(),
                        s.getSumWeight2558(), s.getSumCost2558(), s.getAvg2558(),
                        s.getSumWeight2559(), s.getSumCost2559(), s.getAvg2559(),
                        s.getSumWeight2560(), s.getSumCost2560(), s.getAvg2560(),
                        s.getSumWeight2561(), s.getSumCost2561(), s.getAvg2561())).collect(Collectors.toList())
        );

        table.setItems(ListMY);
        table.getColumns().addAll(monthCol, main57Col, main58Col, main59Col, main60Col, main61Col);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        vbox.setFillWidth(true);
        vbox.getChildren().addAll(table);
        VBox.setVgrow(table, Priority.ALWAYS);

        return vbox;
    }

    private VBox showFC(int i) {
        final VBox vbox = new VBox();
        final TableView<tbFertilizerCond> table = new TableView<>();

        TableColumn<tbFertilizerCond, String> dateCol = new TableColumn<>("วันที่");
        TableColumn<tbFertilizerCond, String> soilCol = new TableColumn<>("ชนิดปุ๋ย/วัสดุบำรุงดิน/อื่นๆ");
        TableColumn<tbFertilizerCond, String> rateCol = new TableColumn<>("อัตราที่ใช้ (กิโลกรัม/ต้น)");
        TableColumn<tbFertilizerCond, String> costCol = new TableColumn<>("ราคา/กิโลกรัม");
        TableColumn<tbFertilizerCond, String> sumCol = new TableColumn<>("รวมเงิน(บาท)");
        TableColumn<tbFertilizerCond, String> annoCol = new TableColumn<>("หมายเหตุ");

        dateCol.setCellValueFactory(new PropertyValueFactory<>("day"));
        soilCol.setCellValueFactory(new PropertyValueFactory<>("soil"));
        rateCol.setCellValueFactory(new PropertyValueFactory<>("rate"));
        costCol.setCellValueFactory(new PropertyValueFactory<>("cost"));
        sumCol.setCellValueFactory(new PropertyValueFactory<>("sum"));
        annoCol.setCellValueFactory(new PropertyValueFactory<>("Anno"));

        ObservableList<tbFertilizerCond> ListFC = FXCollections.observableArrayList(
                loadedData.userArrayList.get(i).getListFC().stream().map(s -> new tbFertilizerCond(s.getDay(), s.getSoil(), s.getRate(), s.getCost(), s.getSum(), s.getAnno())).collect(Collectors.toList())
        );

        table.setItems(ListFC);
        table.getColumns().addAll(dateCol, soilCol, rateCol, costCol, sumCol, annoCol);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        vbox.setFillWidth(true);
        vbox.getChildren().addAll(table);
        VBox.setVgrow(table, Priority.ALWAYS);

        return vbox;
    }

    private VBox showFR(int i) {
        final VBox vbox = new VBox();
        final TableView[] table = new TableView[5];
        final Label[] lbl = new Label[5];
        ObservableList<tbFertilizerRec> ListFR = FXCollections.observableArrayList(
                loadedData.userArrayList.get(i).getListFR().stream().map(s -> new tbFertilizerRec(s.getYear(), s.getFertType(),
                        s.getM1(), s.getM2(), s.getM3(), s.getM4(),
                        s.getA1(), s.getA2(), s.getA3(), s.getA4(), s.getSum())).collect(Collectors.toList())
        );

        ObservableList<tbFertilizerRec>[] temp = new ObservableList[5];

        for (int j = 0, year = 2557; j < 5; j++, year++) {
            table[j] = new TableView<tbFertilizerRec>();
            lbl[j] = new Label(String.valueOf(year));
            TableColumn<tbFertilizerRec, String> FertTypeCol = new TableColumn<>("ชนิดปุ๋ย");
            TableColumn<tbFertilizerRec, String> main1Col = new TableColumn<>("ครั้งที่ 1");
            TableColumn<tbFertilizerRec, String> main2Col = new TableColumn<>("ครั้งที่ 2");
            TableColumn<tbFertilizerRec, String> main3Col = new TableColumn<>("ครั้งที่ 3");
            TableColumn<tbFertilizerRec, String> main4Col = new TableColumn<>("ครั้งที่ 4");
            TableColumn<tbFertilizerRec, String> m1Col = new TableColumn<>("เดือน");
            TableColumn<tbFertilizerRec, String> m2Col = new TableColumn<>("เดือน");
            TableColumn<tbFertilizerRec, String> m3Col = new TableColumn<>("เดือน");
            TableColumn<tbFertilizerRec, String> m4Col = new TableColumn<>("เดือน");
            TableColumn<tbFertilizerRec, String> a1Col = new TableColumn<>("จำนวน(ตัน)");
            TableColumn<tbFertilizerRec, String> a2Col = new TableColumn<>("จำนวน(ตัน)");
            TableColumn<tbFertilizerRec, String> a3Col = new TableColumn<>("จำนวน(ตัน)");
            TableColumn<tbFertilizerRec, String> a4Col = new TableColumn<>("จำนวน(ตัน)");
            TableColumn<tbFertilizerRec, String> sumCol = new TableColumn<>("รวม(กก.)");
            main1Col.getColumns().addAll(m1Col, a1Col);
            main2Col.getColumns().addAll(m2Col, a2Col);
            main3Col.getColumns().addAll(m3Col, a3Col);
            main4Col.getColumns().addAll(m4Col, a4Col);

            FertTypeCol.setCellValueFactory(new PropertyValueFactory<>("FertType"));
            m1Col.setCellValueFactory(new PropertyValueFactory<>("M1"));
            m2Col.setCellValueFactory(new PropertyValueFactory<>("M2"));
            m3Col.setCellValueFactory(new PropertyValueFactory<>("M3"));
            m4Col.setCellValueFactory(new PropertyValueFactory<>("M4"));
            a1Col.setCellValueFactory(new PropertyValueFactory<>("A1"));
            a2Col.setCellValueFactory(new PropertyValueFactory<>("A2"));
            a3Col.setCellValueFactory(new PropertyValueFactory<>("A3"));
            a4Col.setCellValueFactory(new PropertyValueFactory<>("A4"));
            sumCol.setCellValueFactory(new PropertyValueFactory<>("sum"));

            final int finalYear = year;
            temp[j] = FXCollections.observableArrayList(
                    loadedData.userArrayList.get(i).getListFR().stream().filter(s -> s.getYear().equals(String.valueOf(finalYear))).collect(Collectors.toList())
            );

            table[j].setItems(temp[j]);
            table[j].getColumns().addAll(FertTypeCol, main1Col, main2Col, main3Col, main4Col, sumCol);
            table[j].setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);


        }

        vbox.setFillWidth(true);
        for (int j = 0; j < 5; j++) {
            vbox.getChildren().addAll(lbl[j], table[j]);
            vbox.setVgrow(table[j], Priority.ALWAYS);
        }

        return vbox;
    }

    private VBox showSLA(int i){
        final VBox vbox = new VBox();
        Label lblDay = new Label("วันที่ : " + loadedData.userArrayList.get(i).getListSALMeta().getDate());
        Label lblOrg = new Label("หน่วยงานที่ตรวจวิเคราะห์ : " + loadedData.userArrayList.get(i).getListSALMeta().getOrg());
        Label[] lblElement = new Label[8];

        String[] strElement = new String[]{
            "ไนโตรเจน N" + loadedData.userArrayList.get(i).getListSLA1().get(0).getN() + " %",
                "ฟอสฟอรัส P" +loadedData.userArrayList.get(i).getListSLA1().get(0).getP() + " %",
                "โพแทสเซียม K" +loadedData.userArrayList.get(i).getListSLA1().get(0).getK() + " %",
                "แมกนีเซียม Mg" +loadedData.userArrayList.get(i).getListSLA1().get(0).getMg() + " %",
                "แคลเซียม Ca" +loadedData.userArrayList.get(i).getListSLA1().get(0).getCa() + " %",
                "กำมะถัน S" +loadedData.userArrayList.get(i).getListSLA1().get(0).getS() + " %",
                "โบรอน B" +loadedData.userArrayList.get(i).getListSLA1().get(0).getB() + " ppm",
                "แมงกานีส Mn" +loadedData.userArrayList.get(i).getListSLA1().get(0).getMn() + " %"
        };

        for (int j = 0; j < 8 ; j++) {
            lblElement[j] = new Label(strElement[j]);
        }

        TableView<tbSoilAndLeaves2> table1 = new TableView<>();
        TableColumn<tbSoilAndLeaves2,String> elementCol1 = new TableColumn<>("ธาตุอาหาร");
        TableColumn<tbSoilAndLeaves2,String> stdCol1 = new TableColumn<>("ค่ามาตรฐาน");
        TableColumn<tbSoilAndLeaves2,String> calCol1 = new TableColumn<>("ค่าวิเคราะห์");
        TableColumn<tbSoilAndLeaves2,String> careCol1 = new TableColumn<>("การแก้ไข");
        elementCol1.setCellValueFactory(new PropertyValueFactory<>("element"));
        stdCol1.setCellValueFactory(new PropertyValueFactory<>("std"));
        calCol1.setCellValueFactory(new PropertyValueFactory<>("cal"));
        careCol1.setCellValueFactory(new PropertyValueFactory<>("care"));

        ObservableList<tbSoilAndLeaves2> ListSla2 = FXCollections.observableArrayList(
                loadedData.userArrayList.get(i).getListSLA2()
        );

        table1.setItems(ListSla2);
        table1.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        table1.getColumns().addAll(elementCol1,stdCol1,calCol1,careCol1);

        TableView<tbSoilAndLeaves3> table2 = new TableView<>();
        TableColumn<tbSoilAndLeaves3,String> typeCol2 = new TableColumn<>("ชนิดปุ๋ย");
        TableColumn<tbSoilAndLeaves3,String> rateCol2 = new TableColumn<>("อัตรา(กก./ตัน/ปี)");
        TableColumn main1 = new TableColumn("อัตราการใส่(กก./ตัน)");
        TableColumn<tbSoilAndLeaves3,String> round1Col = new TableColumn<>("ครั้งที่ 1");
        TableColumn<tbSoilAndLeaves3,String> round2Col = new TableColumn<>("ครั้งที่ 2");
        TableColumn<tbSoilAndLeaves3,String> round3Col = new TableColumn<>("ครั้งที่ 3");
        main1.getColumns().addAll(round1Col,round2Col,round3Col);
        TableColumn<tbSoilAndLeaves3,String> AnnoCol = new TableColumn<>("หมายเหตุ");

        typeCol2.setCellValueFactory(new PropertyValueFactory<>("type"));
        rateCol2.setCellValueFactory(new PropertyValueFactory<>("rate"));
        round1Col.setCellValueFactory(new PropertyValueFactory<>("round1"));
        round2Col.setCellValueFactory(new PropertyValueFactory<>("round2"));
        round3Col.setCellValueFactory(new PropertyValueFactory<>("round3"));
        AnnoCol.setCellValueFactory(new PropertyValueFactory<>("Anno"));

        ObservableList<tbSoilAndLeaves3> ListSla3 = FXCollections.observableArrayList(
                loadedData.userArrayList.get(i).getListSLA3()
        );

        table2.setItems(ListSla3);
        table2.getColumns().addAll(typeCol2,rateCol2,main1,AnnoCol);
        table2.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        vbox.getChildren().addAll(lblDay,lblOrg,
                lblElement[0],lblElement[1],lblElement[2],lblElement[3],lblElement[4],lblElement[5],lblElement[6],lblElement[7],
                table1,table2);

        return vbox;
    }

    private VBox showSA(int i){
        VBox vbox = new VBox();
        TableView<tbSoilAnalysis> table = new TableView<>();
        TableColumn main1 = new TableColumn("เปอร์เซ็น");
        TableColumn main2 = new TableColumn("มก./กก.");
        TableColumn main3 = new TableColumn("Meq/100g");
        TableColumn main4 = new TableColumn("มก./กก.");
        TableColumn main5 = new TableColumn("Meq/100g");
        TableColumn main6 = new TableColumn("1 : 5 H2O");
        TableColumn<tbSoilAnalysis,String> col1 = new TableColumn<>("วันที่");
        TableColumn<tbSoilAnalysis,String> col2 = new TableColumn<>("หน่วยงาน");
        TableColumn<tbSoilAnalysis,String> col3 = new TableColumn<>("ความลึก");
        TableColumn<tbSoilAnalysis,String> col4 = new TableColumn<>("ไนโตรเจนมั้งหมด");
        TableColumn<tbSoilAnalysis,String> col5 = new TableColumn<>("อินทรีวัตถุ");
        TableColumn<tbSoilAnalysis,String> col6 = new TableColumn<>("ฟอสฟอรัสที่นำไปใช้ได้");
        TableColumn<tbSoilAnalysis,String> col7 = new TableColumn<>("โพแทสเซียม");
        TableColumn<tbSoilAnalysis,String> col8 = new TableColumn<>("แคลเซียม");
        TableColumn<tbSoilAnalysis,String> col9 = new TableColumn<>("แมกนีเซียม");
        TableColumn<tbSoilAnalysis,String> col10 = new TableColumn<>("โซเดียม");
        TableColumn<tbSoilAnalysis,String> col11 = new TableColumn<>("กำมะถันที่นำไปใช้ได้");
        TableColumn<tbSoilAnalysis,String> col12 = new TableColumn<>("ค่าความเป็นกรด");
        TableColumn<tbSoilAnalysis,String> col13 = new TableColumn<>("ค่าอัลคาไลน์");
        TableColumn<tbSoilAnalysis,String> col14 = new TableColumn<>("pH");
        TableColumn<tbSoilAnalysis,String> col15 = new TableColumn<>("Ec(uS/cm)");
        main1.getColumns().addAll(col4,col5);
        main2.getColumns().addAll(col6);
        main3.getColumns().addAll(col7,col8,col9,col10);
        main4.getColumns().addAll(col11);
        main5.getColumns().addAll(col12,col13);
        main6.getColumns().addAll(col14,col15);

        col1.setCellValueFactory(new PropertyValueFactory<>("col1"));
        col2.setCellValueFactory(new PropertyValueFactory<>("col2"));
        col3.setCellValueFactory(new PropertyValueFactory<>("col3"));
        col4.setCellValueFactory(new PropertyValueFactory<>("col4"));
        col5.setCellValueFactory(new PropertyValueFactory<>("col5"));
        col6.setCellValueFactory(new PropertyValueFactory<>("col6"));
        col7.setCellValueFactory(new PropertyValueFactory<>("col7"));
        col8.setCellValueFactory(new PropertyValueFactory<>("col8"));
        col9.setCellValueFactory(new PropertyValueFactory<>("col9"));
        col10.setCellValueFactory(new PropertyValueFactory<>("col10"));
        col11.setCellValueFactory(new PropertyValueFactory<>("col11"));
        col12.setCellValueFactory(new PropertyValueFactory<>("col12"));
        col13.setCellValueFactory(new PropertyValueFactory<>("col13"));
        col14.setCellValueFactory(new PropertyValueFactory<>("col14"));
        col15.setCellValueFactory(new PropertyValueFactory<>("col15"));

        ObservableList<tbSoilAnalysis> ListSA = FXCollections.observableArrayList(
                loadedData.userArrayList.get(i).getListSA()
        );

        table.setItems(ListSA);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        table.getColumns().addAll(col1,col2,col3,main1,main2,main3,main4,main5,main6);

        vbox.setFillWidth(true);
        vbox.getChildren().addAll(table);

        return vbox;
    }

    private VBox showND(int i) {
        final VBox vbox = new VBox();
        final TableView<tbNutrientDeficiency> table = new TableView<>();

        TableColumn<tbNutrientDeficiency, String> dateCol = new TableColumn<>("วันที่");
        TableColumn<tbNutrientDeficiency, String> symptomCol = new TableColumn<>("อาการขาดสารอาหารที่พบ");
        TableColumn<tbNutrientDeficiency, String> rateCol = new TableColumn<>("ระดับความรุนแรง");
        TableColumn<tbNutrientDeficiency, String> annoCol = new TableColumn<>("หมายเหตุ");

        dateCol.setCellValueFactory(new PropertyValueFactory<>("day"));
        symptomCol.setCellValueFactory(new PropertyValueFactory<>("symptom"));
        rateCol.setCellValueFactory(new PropertyValueFactory<>("rate"));
        annoCol.setCellValueFactory(new PropertyValueFactory<>("annotation"));

        ObservableList<tbNutrientDeficiency> ListND = FXCollections.observableArrayList(
                loadedData.userArrayList.get(i).getListND().stream().map(s -> new tbNutrientDeficiency(s.getDay(), s.getSymptom(), s.getRate(), s.getAnnotation())).collect(Collectors.toList())
        );

        table.setItems(ListND);
        table.getColumns().addAll(dateCol, symptomCol, rateCol, annoCol);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        vbox.setFillWidth(true);
        vbox.getChildren().addAll(table);
        vbox.setVgrow(table, Priority.ALWAYS);

        return vbox;
    }

    private VBox showPA(int i) {
        final VBox vbox = new VBox();
        final TableView<tbPerticideApplication> table = new TableView<>();

        TableColumn<tbPerticideApplication, String> dateCol = new TableColumn<>("วันที่");
        TableColumn<tbPerticideApplication, String> perticideCol = new TableColumn<>("ชนิดศัตรูพืช");
        TableColumn<tbPerticideApplication, String> chemCol = new TableColumn<>("ชื่อสารเคมี");
        TableColumn<tbPerticideApplication, String> rateCol = new TableColumn<>("อัตราที่ใช้");
        TableColumn<tbPerticideApplication, String> annoCol = new TableColumn<>("หมายเหตุ");

        dateCol.setCellValueFactory(new PropertyValueFactory<>("day"));
        perticideCol.setCellValueFactory(new PropertyValueFactory<>("perticide"));
        chemCol.setCellValueFactory(new PropertyValueFactory<>("chem"));
        rateCol.setCellValueFactory(new PropertyValueFactory<>("rate"));
        annoCol.setCellValueFactory(new PropertyValueFactory<>("anno"));

        ObservableList<tbPerticideApplication> ListPA = FXCollections.observableArrayList(
                loadedData.userArrayList.get(i).getListPA().stream().map(s -> new tbPerticideApplication(s.getDay(), s.getPerticide(), s.getChem(), s.getRate(), s.getAnno())).collect(Collectors.toList())
        );

        table.setItems(ListPA);
        table.getColumns().addAll(dateCol, perticideCol, chemCol, rateCol, annoCol);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        vbox.setFillWidth(true);
        vbox.getChildren().addAll(table);
        vbox.setVgrow(table, Priority.ALWAYS);

        return vbox;
    }

    private VBox showPC(int i){
        VBox vbox = new VBox();
        TableView<tbPrecipitation> table = new TableView<>();
        TableColumn<tbPrecipitation,String> monthCol = new TableColumn<>("เดือน");
        TableColumn main57 = new TableColumn("พ.ศ.2557");
        TableColumn main58 = new TableColumn("พ.ศ.2558");
        TableColumn main59 = new TableColumn("พ.ศ.2559");
        TableColumn main60 = new TableColumn("พ.ศ.2560");
        TableColumn main61 = new TableColumn("พ.ศ.2561");
        TableColumn<tbPrecipitation,String> volume57Col = new TableColumn<>("ปริมาณน้ำฝน (มม.)");
        TableColumn<tbPrecipitation,String> aday57Col = new TableColumn<>("จำนวนวันฝนตก");
        TableColumn<tbPrecipitation,String> volume58Col = new TableColumn<>("ปริมาณน้ำฝน (มม.)");
        TableColumn<tbPrecipitation,String> aday58Col = new TableColumn<>("จำนวนวันฝนตก");
        TableColumn<tbPrecipitation,String> volume59Col = new TableColumn<>("ปริมาณน้ำฝน (มม.)");
        TableColumn<tbPrecipitation,String> aday59Col = new TableColumn<>("จำนวนวันฝนตก");
        TableColumn<tbPrecipitation,String> volume60Col = new TableColumn<>("ปริมาณน้ำฝน (มม.)");
        TableColumn<tbPrecipitation,String> aday60Col = new TableColumn<>("จำนวนวันฝนตก");
        TableColumn<tbPrecipitation,String> volume61Col = new TableColumn<>("ปริมาณน้ำฝน (มม.)");
        TableColumn<tbPrecipitation,String> aday61Col = new TableColumn<>("จำนวนวันฝนตก");
        main57.getColumns().addAll(volume57Col,aday57Col);
        main58.getColumns().addAll(volume58Col,aday58Col);
        main59.getColumns().addAll(volume59Col,aday59Col);
        main60.getColumns().addAll(volume60Col,aday60Col);
        main61.getColumns().addAll(volume61Col,aday61Col);
        monthCol.setCellValueFactory(new PropertyValueFactory<>("month"));
        volume57Col.setCellValueFactory(new PropertyValueFactory<>("volume57"));
        aday57Col.setCellValueFactory(new PropertyValueFactory<>("aday57"));
        volume58Col.setCellValueFactory(new PropertyValueFactory<>("volume58"));
        aday58Col.setCellValueFactory(new PropertyValueFactory<>("aday58"));
        volume59Col.setCellValueFactory(new PropertyValueFactory<>("volume59"));
        aday59Col.setCellValueFactory(new PropertyValueFactory<>("aday59"));
        volume60Col.setCellValueFactory(new PropertyValueFactory<>("volume60"));
        aday60Col.setCellValueFactory(new PropertyValueFactory<>("aday60"));
        volume61Col.setCellValueFactory(new PropertyValueFactory<>("volume61"));
        aday61Col.setCellValueFactory(new PropertyValueFactory<>("aday61"));

        ObservableList<tbPrecipitation> ListPC = FXCollections.observableArrayList(
                loadedData.userArrayList.get(i).getListPC()
        );

        table.getColumns().addAll(monthCol,main57,main58,main59,main60,main61);
        table.setItems(ListPC);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        vbox.getChildren().addAll(table);

        Label[] lbl = new Label[10];

        lbl[0] = new Label("ปี 2557 ข้อมูลจาก : " + loadedData.userArrayList.get(i).getListPC2().getData57());
        lbl[1] = new Label("ปี 2557 ข้อมูลเมื่อ : " + loadedData.userArrayList.get(i).getListPC2().getDday57());
        lbl[2] = new Label("ปี 2558 ข้อมูลจาก : " + loadedData.userArrayList.get(i).getListPC2().getData58());
        lbl[3] = new Label("ปี 2558 ข้อมูลเมื่อ : " + loadedData.userArrayList.get(i).getListPC2().getDday58());
        lbl[4] = new Label("ปี 2559 ข้อมูลจาก : " + loadedData.userArrayList.get(i).getListPC2().getData59());
        lbl[5] = new Label("ปี 2559 ข้อมูลเมื่อ : " + loadedData.userArrayList.get(i).getListPC2().getDday59());
        lbl[6] = new Label("ปี 2560 ข้อมูลจาก : " + loadedData.userArrayList.get(i).getListPC2().getData60());
        lbl[7] = new Label("ปี 2560 ข้อมูลเมื่อ : " + loadedData.userArrayList.get(i).getListPC2().getDday60());
        lbl[8] = new Label("ปี 2561 ข้อมูลจาก : " + loadedData.userArrayList.get(i).getListPC2().getData61());
        lbl[9] = new Label("ปี 2561 ข้อมูลเมื่อ : " + loadedData.userArrayList.get(i).getListPC2().getDday61());

        vbox.getChildren().addAll(lbl);
        vbox.setSpacing(10);

        return vbox;
    }

    private VBox showTH(int i) {
        final VBox vbox = new VBox();
        final TableView<tbTrainingHistory> table = new TableView<>();

        TableColumn<tbTrainingHistory, String> dateCol = new TableColumn<>("วันที่");
        TableColumn<tbTrainingHistory, String> whatCol = new TableColumn<>("เรื่อง");
        TableColumn<tbTrainingHistory, String> whereCol = new TableColumn<>("สถานที่");
        TableColumn<tbTrainingHistory, String> whoCol = new TableColumn<>("วิทยากร");

        dateCol.setCellValueFactory(new PropertyValueFactory<>("day"));
        whatCol.setCellValueFactory(new PropertyValueFactory<>("what"));
        whereCol.setCellValueFactory(new PropertyValueFactory<>("where"));
        whoCol.setCellValueFactory(new PropertyValueFactory<>("who"));

        ObservableList<tbTrainingHistory> ListTH = FXCollections.observableArrayList(
                loadedData.userArrayList.get(i).getListTH().stream().map(s -> new tbTrainingHistory(s.getDay(), s.getWhat(), s.getWhere(), s.getWho())).collect(Collectors.toList())
        );

        table.setItems(ListTH);
        table.getColumns().addAll(dateCol, whatCol, whereCol, whoCol);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        vbox.setFillWidth(true);
        vbox.getChildren().addAll(table);
        VBox.setVgrow(table, Priority.ALWAYS);

        return vbox;
    }

    private VBox showGV(int i) {
        final VBox vbox = new VBox();
        final TableView<tbGuestVisit> table = new TableView<>();

        TableColumn<tbGuestVisit, String> dateCol = new TableColumn<>("วันที่");
        TableColumn<tbGuestVisit, String> detailCol = new TableColumn<>("รายละเอียด");
        TableColumn<tbGuestVisit, String> sigCol = new TableColumn<>("ลายมือชื่อผู้ตรวจเยี่ยม");

        dateCol.setCellValueFactory(new PropertyValueFactory<>("day"));
        detailCol.setCellValueFactory(new PropertyValueFactory<>("detail"));
        sigCol.setCellValueFactory(new PropertyValueFactory<>("sig"));

        ObservableList<tbGuestVisit> ListGV = FXCollections.observableArrayList(
                loadedData.userArrayList.get(i).getListGV().stream().map(s -> new tbGuestVisit(s.getDay(), s.getDetail(), s.getSig())).collect(Collectors.toList())
        );

        table.setItems(ListGV);
        table.getColumns().addAll(dateCol, detailCol, sigCol);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        vbox.setFillWidth(true);
        vbox.getChildren().addAll(table);
        VBox.setVgrow(table, Priority.ALWAYS);

        return vbox;
    }

    private VBox showMG(int i) {
        final VBox vbox = new VBox();
        final TableView<tbManagement> table = new TableView<>();

        TableColumn<tbManagement, String> listCol = new TableColumn<>("รายการ");
        TableColumn<tbManagement, String> y57Col = new TableColumn<>("ปี 2557");
        TableColumn<tbManagement, String> y58Col = new TableColumn<>("ปี 2558");
        TableColumn<tbManagement, String> y59Col = new TableColumn<>("ปี 2559");
        TableColumn<tbManagement, String> y60Col = new TableColumn<>("ปี 2560");
        TableColumn<tbManagement, String> y61Col = new TableColumn<>("ปี 2561");

        listCol.setCellValueFactory(new PropertyValueFactory<>("C1"));
        y57Col.setCellValueFactory(new PropertyValueFactory<>("C57"));
        y58Col.setCellValueFactory(new PropertyValueFactory<>("C58"));
        y59Col.setCellValueFactory(new PropertyValueFactory<>("C59"));
        y60Col.setCellValueFactory(new PropertyValueFactory<>("C60"));
        y61Col.setCellValueFactory(new PropertyValueFactory<>("C61"));

        ObservableList<tbManagement> ListMG = FXCollections.observableArrayList(
                loadedData.userArrayList.get(i).getListMG().stream().map(s -> new tbManagement(s.getC1(), s.getC57(), s.getC58(), s.getC59(), s.getC60(), s.getC61())).collect(Collectors.toList())
        );

        table.setItems(ListMG);
        table.getColumns().addAll(listCol, y57Col, y58Col, y59Col, y60Col, y61Col);
        table.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        vbox.setFillWidth(true);
        vbox.getChildren().addAll(table);
        VBox.setVgrow(table, Priority.ALWAYS);
        return vbox;
    }
}
