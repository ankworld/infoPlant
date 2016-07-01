/**
 * Created by anukul on 12/6/15.
 * So tried
 */
package controller;

import dataStruct.*;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.control.cell.TextFieldTreeTableCell;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.StringConverter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.EnumSet;
import java.util.Optional;
import java.util.stream.Collectors;

import static controller.mainMenuController.file;
import static controller.mainMenuController.loadedData;
import static dataStruct.tbNutrientDeficiency.Rate;

public class allFormController {

    private plotInfo plotInfoList = new plotInfo();
    private plotBG plotBGList = new plotBG();
    private bleeding bleedingList = new bleeding();
    private Precipitation2 pc2 = new Precipitation2();
    private Manage2 mg2list = new Manage2();
    private SoilAndLeavesMeta slaMeta = new SoilAndLeavesMeta();
    private User user = new User();

    //--------Create Object---------//

    @FXML
    private Button toolBtnSave;
    @FXML
    private Button btnBack;


    @FXML
    private Button btnCopyPC;
    @FXML
    private Button btnExcelMY;
    @FXML
    private Button btnExcelY;
    @FXML
    private TableView<tbSoilAnalysis> SoilAnalysis;
    @FXML
    private TableColumn<tbSoilAnalysis, String> SAC1;
    @FXML
    private TableColumn<tbSoilAnalysis, String> SAC2;
    @FXML
    private TableColumn<tbSoilAnalysis, String> SAC3;
    @FXML
    private TableColumn<tbSoilAnalysis, String> SAC4;
    @FXML
    private TableColumn<tbSoilAnalysis, String> SAC5;
    @FXML
    private TableColumn<tbSoilAnalysis, String> SAC6;
    @FXML
    private TableColumn<tbSoilAnalysis, String> SAC7;
    @FXML
    private TableColumn<tbSoilAnalysis, String> SAC8;
    @FXML
    private TableColumn<tbSoilAnalysis, String> SAC9;
    @FXML
    private TableColumn<tbSoilAnalysis, String> SAC10;
    @FXML
    private TableColumn<tbSoilAnalysis, String> SAC11;
    @FXML
    private TableColumn<tbSoilAnalysis, String> SAC12;
    @FXML
    private TableColumn<tbSoilAnalysis, String> SAC13;
    @FXML
    private TableColumn<tbSoilAnalysis, String> SAC14;
    @FXML
    private TableColumn<tbSoilAnalysis, String> SAC15;
    @FXML
    private TextField SATF1;
    @FXML
    private TextField SATF2;
    @FXML
    private TextField SATF3;
    @FXML
    private TextField SATF4;
    @FXML
    private TextField SATF5;
    @FXML
    private TextField SATF6;
    @FXML
    private TextField SATF7;
    @FXML
    private TextField SATF8;
    @FXML
    private TextField SATF9;
    @FXML
    private TextField SATF10;
    @FXML
    private TextField SATF11;
    @FXML
    private TextField SATF12;
    @FXML
    private TextField SATF13;
    @FXML
    private TextField SATF14;
    @FXML
    private TextField SATF15;
    @FXML
    private Button SABT1;

    @FXML
    private TreeTableView<tbManagement> Management;
    @FXML
    private TreeTableColumn<tbManagement, String> MGC1;
    @FXML
    private TreeTableColumn<tbManagement, String> MGC2;
    @FXML
    private TreeTableColumn<tbManagement, String> MGC3;
    @FXML
    private TreeTableColumn<tbManagement, String> MGC4;
    @FXML
    private TreeTableColumn<tbManagement, String> MGC5;
    @FXML
    private TreeTableColumn<tbManagement, String> MGC6;
    @FXML
    private TreeTableColumn<tbManagement, String> MGC7;
    @FXML
    private ChoiceBox<String> MGCB1;
    @FXML
    private ChoiceBox<String> MGCB2;
    @FXML
    private ChoiceBox<String> MGCB3;
    @FXML
    private ChoiceBox<String> MGCB4;
    @FXML
    private ChoiceBox<String> MGCB5;
    @FXML
    private TableView<tbPrecipitation> Precipitation;
    @FXML
    private TableColumn<tbPrecipitation, String> PCC1;
    @FXML
    private TableColumn<tbPrecipitation, String> PCC2;
    @FXML
    private TableColumn<tbPrecipitation, String> PCC3;
    @FXML
    private TableColumn<tbPrecipitation, String> PCC4;
    @FXML
    private TableColumn<tbPrecipitation, String> PCC5;
    @FXML
    private TableColumn<tbPrecipitation, String> PCC6;
    @FXML
    private TableColumn<tbPrecipitation, String> PCC7;
    @FXML
    private TableColumn<tbPrecipitation, String> PCC8;
    @FXML
    private TableColumn<tbPrecipitation, String> PCC9;
    @FXML
    private TableColumn<tbPrecipitation, String> PCC10;
    @FXML
    private TableColumn<tbPrecipitation, String> PCC11;
    @FXML
    private ChoiceBox<String> PCCB1;
    @FXML
    private TextField PCTFDate1;
    @FXML
    private TextField PCTFOT1;
    @FXML
    private ChoiceBox<String> PCCB2;
    @FXML
    private TextField PCTFDate2;
    @FXML
    private TextField PCTFOT2;
    @FXML
    private ChoiceBox<String> PCCB3;
    @FXML
    private TextField PCTFDate3;
    @FXML
    private TextField PCTFOT3;
    @FXML
    private ChoiceBox<String> PCCB4;
    @FXML
    private TextField PCTFDate4;
    @FXML
    private TextField PCTFOT4;
    @FXML
    private ChoiceBox<String> PCCB5;
    @FXML
    private TextField PCTFDate5;
    @FXML
    private TextField PCTFOT5;

    @FXML
    private TextField tfPlotName;
    @FXML
    private TextField tfPlotAddr;
    @FXML
    private ChoiceBox<String> cbPlotType;
    @FXML
    private TextField tfYear;
    @FXML
    private ToggleGroup A;
    @FXML
    private RadioButton rbFourEight;
    @FXML
    private RadioButton rbEightSixT;
    @FXML
    private RadioButton rbSixTeenUp;
    @FXML
    private TextField tfPlotSize;
    @FXML
    private TextField tfPlotTreeAll;
    @FXML
    private TextField tfPlotTreeDead;
    @FXML
    private TextField tfPlotTreeRe;
    @FXML
    private TextField tfPlotHowToDead;
    @FXML
    private TextField tfPlotOwnerName;
    @FXML
    private TextField tfPlotOwnerAddr;
    @FXML
    private TextField tfPlotOwnerTel;
    @FXML
    private TextField tfPlotAnno;
    @FXML
    private Button btnPlotPic;
    @FXML
    private Label lbPicName;

    @FXML
    private TextField tfSoilType;
    @FXML
    private TextField tfGPS;
    @FXML
    private RadioButton rbGive;
    @FXML
    private RadioButton rbNGive;
    @FXML
    private RadioButton rbRain;
    @FXML
    private RadioButton rbRiver;
    @FXML
    private RadioButton rbPool;
    @FXML
    private TextField tfBeforePalm;
    @FXML
    private RadioButton rbTri;
    @FXML
    private RadioButton rbSqur;
    @FXML
    private RadioButton rbKillBug;
    @FXML
    private RadioButton rbNKillBug;
    @FXML
    private TextField tfKillBug;
    @FXML
    private TextField tfBackAnno;
    @FXML
    private ChoiceBox<String> landStatus;
    @FXML
    private ChoiceBox<String> soilType;
    @FXML
    private ChoiceBox<String> preType;
    @FXML
    private ChoiceBox<String> soilPreserve;
    @FXML
    private ChoiceBox<String> harvestType;
    @FXML
    private TextField tfOTLandTatus;
    @FXML
    private TextField tfOTsoilType;
    @FXML
    private TextField tfOTpreType;
    @FXML
    private TextField tfOTsoilPreserve;
    @FXML
    private ChoiceBox<String> cbTriSize;
    @FXML
    private TextField tfSqurSize;
    @FXML
    private TextField tfOTHarvest;
    @FXML
    private ToggleGroup B13;
    @FXML
    private ToggleGroup B11;
    @FXML
    private ToggleGroup B9;
    @FXML
    private ToggleGroup B8;

    @FXML
    private RadioButton rbC11;
    @FXML
    private RadioButton rbC12;
    @FXML
    private RadioButton rbC13;
    @FXML
    private RadioButton rbC14;
    @FXML
    private RadioButton rbC15;
    @FXML
    private RadioButton rbC16;
    @FXML
    private RadioButton rbC17;
    @FXML
    private RadioButton rbC21;
    @FXML
    private RadioButton rbC22;
    @FXML
    private RadioButton rbC31;
    @FXML
    private RadioButton rbC32;
    @FXML
    private ToggleGroup C2;
    @FXML
    private ToggleGroup C7;
    @FXML
    private ToggleGroup C9;
    @FXML
    private TextField tfC14;
    @FXML
    private TextField tfC15;
    @FXML
    private TextField tfC16;
    @FXML
    private TextField tfC17;
    @FXML
    private TextField tfC21;
    @FXML
    private TextField tfC41;
    @FXML
    private TextField tfBDAnno;

    @FXML
    private TableView<tbGuestVisit> GuestVisit;
    @FXML
    private TableColumn<tbGuestVisit, String> colDayGV;
    @FXML
    private TableColumn<tbGuestVisit, String> colDetailGV;
    @FXML
    private TableColumn<tbGuestVisit, String> colSigGV;

    @FXML
    private TableView<tbTrainingHistory> TrainingHistory;
    @FXML
    private TableColumn<tbTrainingHistory, String> colDayTH;
    @FXML
    private TableColumn<tbTrainingHistory, String> colWhatTH;
    @FXML
    private TableColumn<tbTrainingHistory, String> colWhereTH;
    @FXML
    private TableColumn<tbTrainingHistory, String> colWhoTH;
    @FXML
    private TextField addColDayTH;
    @FXML
    private TextField addColWhatTH;
    @FXML
    private TextField addColWhereTH;
    @FXML
    private TextField addColWhoTH;
    @FXML
    private Button btnTH1;

    @FXML
    private TableView<tbPerticideApplication> PerticideApplication;
    @FXML
    private TableColumn<tbPerticideApplication, String> colDayPA;
    @FXML
    private TableColumn<tbPerticideApplication, String> colPerticidePA;
    @FXML
    private TableColumn<tbPerticideApplication, String> colChemPA;
    @FXML
    private TableColumn<tbPerticideApplication, String> colRatePA;
    @FXML
    private TableColumn<tbPerticideApplication, String> colAnnotationPA;
    @FXML
    private TextField addColDayPA;
    @FXML
    private TextField addColPerticidePA;
    @FXML
    private TextField addColChemPA;
    @FXML
    private TextField addColRatePA;
    @FXML
    private TextField addColAnnoPA;
    @FXML
    private Button btnPA1;

    @FXML
    public TableView<tbNutrientDeficiency> NutrientDeficiency;
    @FXML
    public TableColumn<tbNutrientDeficiency, String> colDayND;
    @FXML
    public TableColumn<tbNutrientDeficiency, String> colSymptomND;
    @FXML
    public TableColumn<tbNutrientDeficiency, Rate> colRateND;
    @FXML
    public TableColumn<tbNutrientDeficiency, String> colAnnotationND;
    @FXML
    private TextField addColDayND;
    @FXML
    private TextField addColSymptomND;
    @FXML
    private TextField addColAnnotationND;
    @FXML
    private ToggleGroup ND;
    @FXML
    private RadioButton rb1;
    @FXML
    private RadioButton rb2;
    @FXML
    private RadioButton rb3;
    @FXML
    private Button btnND1;

    @FXML
    private TableView<tbFertilizerCond> FertilizerCond;
    @FXML
    private TableColumn<tbFertilizerCond, String> colDayFC;
    @FXML
    private TableColumn<tbFertilizerCond, String> colSoilFC;
    @FXML
    private TableColumn<tbFertilizerCond, Double> colRateFC;
    @FXML
    private TableColumn<tbFertilizerCond, Double> colCostFC;
    @FXML
    private TableColumn<tbFertilizerCond, Double> colSumFC;
    @FXML
    private TableColumn<tbFertilizerCond, String> colAnnoFC;

    @FXML
    private TextField slaDate;
    @FXML
    private TextField slaOrg;
    @FXML
    private TableColumn<tbSoilAndLeaves, String> slaC1;
    @FXML
    private TableColumn<tbSoilAndLeaves, String> slaC2;
    @FXML
    private TableColumn<tbSoilAndLeaves, String> slaC3;
    @FXML
    private TableColumn<tbSoilAndLeaves, String> slaC4;
    @FXML
    private TableColumn<tbSoilAndLeaves, String> slaC5;
    @FXML
    private TableColumn<tbSoilAndLeaves, String> slaC6;
    @FXML
    private TableColumn<tbSoilAndLeaves, String> slaC7;
    @FXML
    private TableColumn<tbSoilAndLeaves, String> slaC8;
    @FXML
    private TableColumn<tbSoilAndLeaves2, String> sla2C1;
    @FXML
    private TableColumn<tbSoilAndLeaves2, String> sla2C2;
    @FXML
    private TableColumn<tbSoilAndLeaves2, String> sla2C3;
    @FXML
    private TableColumn<tbSoilAndLeaves2, String> sla2C4;
    @FXML
    private TableColumn<tbSoilAndLeaves3, String> sla3C1;
    @FXML
    private TableColumn<tbSoilAndLeaves3, String> sla3C2;
    @FXML
    private TableColumn<tbSoilAndLeaves3, String> sla3C3;
    @FXML
    private TableColumn<tbSoilAndLeaves3, String> sla3C4;
    @FXML
    private TableColumn<tbSoilAndLeaves3, String> sla3C5;
    @FXML
    private TableColumn<tbSoilAndLeaves3, String> sla3C6;
    @FXML
    private TableView<tbSoilAndLeaves> slaR;
    @FXML
    private TableView<tbSoilAndLeaves2> sla2R;
    @FXML
    private TableView<tbSoilAndLeaves3> sla3R;

    @FXML
    private TableView<tbYield> Yield;
    @FXML
    private TableColumn<tbYield, String> colDayY;
    @FXML
    private TableColumn<tbYield, String> colWeightTY;
    @FXML
    private TableColumn<tbYield, String> colCostTY;
    @FXML
    private TableColumn<tbYield, String> colSumTY;
    @FXML
    private TableColumn<tbYield, String> colWeightRY;
    @FXML
    private TableColumn<tbYield, String> colCostRY;
    @FXML
    private TableColumn<tbYield, String> colSumRY;
    @FXML
    private TableColumn<tbYield, String> colSumWeightY;
    @FXML
    private TableColumn<tbYield, String> colSumCostY;
    @FXML
    private TextField tfMY;
    @FXML
    private TextField tfBunchWeight;
    @FXML
    private TextField tfBunchCost;
    @FXML
    private TextField tfBunchSum;
    @FXML
    private TextField tfProductWeight;
    @FXML
    private TextField tfProductCost;
    @FXML
    private TextField tfProductSum;
    @FXML
    private TextField tfSumWeight;
    @FXML
    private TextField tfSumCost;
    @FXML
    private Button btnAddY;

    @FXML
    private TableView<tbMYield> MYield;
    @FXML
    private TableColumn<tbMYield, String> colMMY;
    @FXML
    private TableColumn<tbMYield, String> colW57;
    @FXML
    private TableColumn<tbMYield, String> colC57;
    @FXML
    private TableColumn<tbMYield, String> colA57;
    @FXML
    private TableColumn<tbMYield, String> colW58;
    @FXML
    private TableColumn<tbMYield, String> colC58;
    @FXML
    private TableColumn<tbMYield, String> colA58;
    @FXML
    private TableColumn<tbMYield, String> colW59;
    @FXML
    private TableColumn<tbMYield, String> colC59;
    @FXML
    private TableColumn<tbMYield, String> colA59;
    @FXML
    private TableColumn<tbMYield, String> colW60;
    @FXML
    private TableColumn<tbMYield, String> colC60;
    @FXML
    private TableColumn<tbMYield, String> colA60;
    @FXML
    private TableColumn<tbMYield, String> colW61;
    @FXML
    private TableColumn<tbMYield, String> colC61;
    @FXML
    private TableColumn<tbMYield, String> colA61;
    @FXML
    private TextField tfMMY;
    @FXML
    private TextField tfW57;
    @FXML
    private TextField tfC57;
    @FXML
    private TextField tfA57;
    @FXML
    private TextField tfW58;
    @FXML
    private TextField tfC58;
    @FXML
    private TextField tfA58;
    @FXML
    private TextField tfW59;
    @FXML
    private TextField tfC59;
    @FXML
    private TextField tfA59;
    @FXML
    private TextField tfW60;
    @FXML
    private TextField tfC60;
    @FXML
    private TextField tfA60;
    @FXML
    private TextField tfW61;
    @FXML
    private TextField tfC61;
    @FXML
    private TextField tfA61;
    @FXML
    private Button btnAddMY;

    @FXML
    private TextField tfYearChooser;
    @FXML
    private Label lbYearChoose;
    @FXML
    private TableView<tbFertilizerRec> FertilizerRec;
    @FXML
    private TableColumn<tbFertilizerRec, String> FRC1;
    @FXML
    private TableColumn<tbFertilizerRec, String> FRC2;
    @FXML
    private TableColumn<tbFertilizerRec, Double> FRC3;
    @FXML
    private TableColumn<tbFertilizerRec, String> FRC4;
    @FXML
    private TableColumn<tbFertilizerRec, Double> FRC5;
    @FXML
    private TableColumn<tbFertilizerRec, String> FRC6;
    @FXML
    private TableColumn<tbFertilizerRec, Double> FRC7;
    @FXML
    private TableColumn<tbFertilizerRec, String> FRC8;
    @FXML
    private TableColumn<tbFertilizerRec, Double> FRC9;
    @FXML
    private TableColumn<tbFertilizerRec, Double> FRC10;
    @FXML
    private TextField FRTF1;
    @FXML
    private TextField FRTF2;
    @FXML
    private TextField FRTF3;
    @FXML
    private TextField FRTF4;
    @FXML
    private TextField FRTF5;
    @FXML
    private TextField FRTF6;
    @FXML
    private TextField FRTF7;
    @FXML
    private TextField FRTF8;
    @FXML
    private TextField FRTF9;
    @FXML
    private Button FRB1;

    @FXML
    private TextField addColDayGV;
    @FXML
    private TextField addColDetailGV;
    @FXML
    private TextField addColSigGV;
    @FXML
    private Button btnSubmitGV;

    @FXML
    private TextField tfFC1;
    @FXML
    private TextField tfFC2;
    @FXML
    private TextField tfFC3;
    @FXML
    private TextField tfFC4;
    @FXML
    private Button btnFC1;
    @FXML
    private TextField tfFC5;

    //-------------LIST--------------//
    private ObservableList<String> manageList = FXCollections.observableArrayList("ครบถ้วน", "บางส่วน", "ไม่มี");
    private ObservableList<String> plotTriList = FXCollections.observableArrayList("8x8x8 เมตร", "9x9x9 เมตร", "10x10x10 เมตร");
    private ObservableList<String> plotTypeList = FXCollections.observableArrayList("โฉนด", "นส.3", "สปก.", "ไม่มีเอกสารสิทธิ");
    private ObservableList<String> landStatusList = FXCollections.observableArrayList("ที่ราบ", "ที่ราบลอนคลื่น", "ที่ลุ่ม", "ที่ลาดชัน", "อื่นๆ");
    private ObservableList<String> soilTypeList = FXCollections.observableArrayList("เหนียว", "ร่วน", "ทราย", "ลูกรัง", "ร่วนปนทราย", "เหนียวปนทราย", "อื่นๆ");
    private ObservableList<String> preTypeList = FXCollections.observableArrayList("ไถพรวน", "ร่วน", "ทราย", "ทำขั้นบันได", "อื่นๆ");
    private ObservableList<String> soilPreserveList = FXCollections.observableArrayList("ขั้นบันได", "กองทางใบ", "พื้นตระกูลถั่วคลุมดิน", "ใช้ทำลายปาล์มเปล่าคลุม", "อื่นๆ");
    private ObservableList<String> harvestTypeList = FXCollections.observableArrayList("เก็บเอง", "จ้างผู้เหมา", "อื่นๆ");
    private ObservableList<String> pcList = FXCollections.observableArrayList("สถานีอุตุนิยมวิทยา จ.ชุมพร", "อื่นๆ");
    private ObservableList<tbGuestVisit> tbGuestVisitList = FXCollections.observableArrayList();
    private ObservableList<tbTrainingHistory> tbTrainingHistoryList = FXCollections.observableArrayList();
    private ObservableList<tbPerticideApplication> tbPerticicideApplicationList = FXCollections.observableArrayList();
    private ObservableList<tbNutrientDeficiency> tbNutrientDeficiencyList = FXCollections.observableArrayList();
    private ObservableList<tbFertilizerCond> tbFertilizerCondList = FXCollections.observableArrayList();
    private ObservableList<tbFertilizerRec> tbFertilizerRecList = FXCollections.observableArrayList();
    private ObservableList<tbFertilizerRec> tbFertilizerRecListTemp = FXCollections.observableArrayList();
    private ObservableList<tbPrecipitation> tbPrecipitationList = FXCollections.observableArrayList(
            new tbPrecipitation("ม.ค", "", "", "", "", "", "", "", "", "", ""),
            new tbPrecipitation("ก.พ.", "", "", "", "", "", "", "", "", "", ""),
            new tbPrecipitation("มี.ค.", "", "", "", "", "", "", "", "", "", ""),
            new tbPrecipitation("เม.ย.", "", "", "", "", "", "", "", "", "", ""),
            new tbPrecipitation("พ.ค.", "", "", "", "", "", "", "", "", "", ""),
            new tbPrecipitation("มิ.ย.", "", "", "", "", "", "", "", "", "", ""),
            new tbPrecipitation("ก.ค.", "", "", "", "", "", "", "", "", "", ""),
            new tbPrecipitation("ส.ค.", "", "", "", "", "", "", "", "", "", ""),
            new tbPrecipitation("ก.ย.", "", "", "", "", "", "", "", "", "", ""),
            new tbPrecipitation("ต.ค.", "", "", "", "", "", "", "", "", "", ""),
            new tbPrecipitation("พ.ย.", "", "", "", "", "", "", "", "", "", ""),
            new tbPrecipitation("ธ.ค.", "", "", "", "", "", "", "", "", "", "")
    );
    private ObservableList<tbSoilAndLeaves> tbSoilAndLeavesList = FXCollections.observableArrayList(
            new tbSoilAndLeaves("", "", "", "", "", "", "", "", "")
    );
    private ObservableList<tbSoilAndLeaves2> tbSoilAndLeaves2List = FXCollections.observableArrayList(
            new tbSoilAndLeaves2("N(%)", "", "", ""),
            new tbSoilAndLeaves2("P(%)", "", "", ""),
            new tbSoilAndLeaves2("K(%)", "", "", ""),
            new tbSoilAndLeaves2("Mg(%)", "", "", ""),
            new tbSoilAndLeaves2("Ca(%)", "", "", ""),
            new tbSoilAndLeaves2("S(%)", "", "", ""),
            new tbSoilAndLeaves2("B(%)", "", "", "")
    );
    private ObservableList<tbSoilAndLeaves3> tbSoilAndLeaves3List = FXCollections.observableArrayList(
            new tbSoilAndLeaves3("ไนโตรเจน : 21-0-0", "", "", "", "", ""),
            new tbSoilAndLeaves3("ไนโตรเจน : 46-0-0", "", "", "", "", ""),
            new tbSoilAndLeaves3("ฟอสฟอรัส  : DAP", "", "", "", "", ""),
            new tbSoilAndLeaves3("ฟอสฟอรัส  : Rock PO4", "", "", "", "", ""),
            new tbSoilAndLeaves3("โพแทสเซียม: 0-0-60", "", "", "", "", ""),
            new tbSoilAndLeaves3("แมกนีเซียม : คีเซอร์ไรต์", "", "", "", "", ""),
            new tbSoilAndLeaves3("แมกนีเซียม : โดโลไมท์", "", "", "", "", ""),
            new tbSoilAndLeaves3("แคลเซียม ", "", "", "", "", ""),
            new tbSoilAndLeaves3("กำมะถัน ", "", "", "", "", ""),
            new tbSoilAndLeaves3("โบรอน ", "", "", "", "", "")
    );
    private ObservableList<tbSoilAnalysis> tbSoilAnalysisList = FXCollections.observableArrayList();
    private ObservableList<tbManagement> tbManagementList = FXCollections.observableArrayList(
            new tbManagement("ยอดขายผลผลิต(สุทธิ)", "", "", "", "", ""), //รายได้
            new tbManagement("ค่าปุ๋ยเคมี", "", "", "", "", ""),         //วัตถุดิบ
            new tbManagement("ค่าปุ๋ยอินทรีย์", "", "", "", "", ""),
            new tbManagement("ค่าสารปรับสภาพดิน", "", "", "", "", ""),
            new tbManagement("ค่าใช้จ่ายอื่น", "", "", "", "", ""),
            new tbManagement("ค่าจ้างใส่ปุ๋ย", "", "", "", "", ""), //ค่าแรง
            new tbManagement("ค่ากำจัดวัชพืช", "", "", "", "", ""),
            new tbManagement("ค่าตัดแต่งทางใบ", "", "", "", "", ""),
            new tbManagement("ค่าจ้างเก็บเกี่ยว", "", "", "", "", ""),
            new tbManagement("ค่ากำจัดศัตรูพืช", "", "", "", "", ""),
            new tbManagement("ค่ากำจัดด้วยวิธีธรรมชาติ", "", "", "", "", ""),
            new tbManagement("ค่าจ้างใส่ปุ๋ย", "", "", "", "", ""),//ค่าแรงครัวเรือน
            new tbManagement("ค่ากำจัดวัชพืช", "", "", "", "", ""),
            new tbManagement("ค่าตัดแต่งทางใบ", "", "", "", "", ""),
            new tbManagement("ค่าจ้างเก็บเกี่ยว", "", "", "", "", ""),
            new tbManagement("ค่ากำจัดศัตรูพืช", "", "", "", "", ""),
            new tbManagement("ค่ากำจัดด้วยวิธีธรรมชาติ", "", "", "", "", ""),
            new tbManagement("ค่าอุปกรณ์", "", "", "", "", ""),//ค่าใช้จ่ายในการผลิต
            new tbManagement("ค่ายาฆ่าแมลง", "", "", "", "", ""),
            new tbManagement("ค่าน้ำมัน", "", "", "", "", ""),
            new tbManagement("ค่าวิเคราะห์ดินใบ", "", "", "", "", ""),
            new tbManagement("ค่าตัดต้นไม้", "", "", "", "", ""),
            new tbManagement("ค่าฮอร์โมน", "", "", "", "", ""),
            new tbManagement("ค่าเสียโอกาส", "", "", "", "", ""),
            new tbManagement("ดอกเบี้ยธนาคาร", "", "", "", "", ""),
            new tbManagement("ต้นทุน", "", "", "", "", ""),
            new tbManagement("กำไร", "", "", "", "", "")
    );

    private ObservableList<tbYield> tbYields = FXCollections.observableArrayList();
    private ObservableList<tbMYield> tbMYields = FXCollections.observableArrayList();

    @FXML
    private void initialize() throws Exception {

        cbTriSize.setValue("8x8x8 เมตร");
        cbTriSize.setItems(plotTriList);
        cbPlotType.setValue("โฉนด");
        cbPlotType.setItems(plotTypeList);
        landStatus.setValue("ที่ราบ");
        landStatus.setItems(landStatusList);
        soilType.setValue("เหนียว");
        soilType.setItems(soilTypeList);
        preType.setValue("ไถพรวน");
        preType.setItems(preTypeList);
        soilPreserve.setValue("ขั้นบันได");
        soilPreserve.setItems(soilPreserveList);
        harvestType.setValue("เก็บเอง");
        harvestType.setItems(harvestTypeList);
        PCCB1.setItems(pcList);
        PCCB2.setItems(pcList);
        PCCB3.setItems(pcList);
        PCCB4.setItems(pcList);
        PCCB5.setItems(pcList);
        MGCB1.setItems(manageList);
        MGCB2.setItems(manageList);
        MGCB3.setItems(manageList);
        MGCB4.setItems(manageList);
        MGCB5.setItems(manageList);


        if (loadedData != null) {

            if (!loadedData.userArrayList.isEmpty() && listMenuController.indexId < loadedData.userArrayList.size()) {
                user = loadedData.userArrayList.get(listMenuController.indexId);
                //----------------------------LOAD-------------------------------------//
                tfPlotName.setText(user.getListPlotInfo().getPlotName());
                tfPlotAddr.setText(user.getListPlotInfo().getPlotAddr());
                tfYear.setText(user.getListPlotInfo().getPlotYear1());
                if (user.getListPlotInfo().getPlotYear2().equals(rbFourEight.getText()))
                    rbFourEight.setSelected(true);
                else if (user.getListPlotInfo().getPlotYear2().equals(rbEightSixT.getText()))
                    rbEightSixT.setSelected(true);
                else
                    rbSixTeenUp.setSelected(true);
                tfPlotSize.setText(user.getListPlotInfo().getPlotSize());
                tfPlotTreeAll.setText(user.getListPlotInfo().getPlotTreeAll());
                tfPlotTreeDead.setText(user.getListPlotInfo().getPlotTreeDead());
                tfPlotTreeRe.setText(user.getListPlotInfo().getPlotTreeRe());
                tfPlotHowToDead.setText(user.getListPlotInfo().getPlotHowtoDead());
                tfPlotOwnerName.setText(user.getListPlotInfo().getPlotOwnnerName());
                tfPlotOwnerAddr.setText(user.getListPlotInfo().getPlotOwnnerAddr());
                tfPlotOwnerTel.setText(user.getListPlotInfo().getPlotOwnnerTel());
                cbPlotType.setValue(user.getListPlotInfo().getPlotType());
                tfPlotAnno.setText(user.getListPlotInfo().getPlotAnno());

                //"ที่ราบ","ที่ราบลอนคลื่น","ที่ลุ่ม","ที่ลาดชัน","อื่นๆ"
                tfSoilType.setText(user.getListPlotBG().getBgLand());
                tfGPS.setText(user.getListPlotBG().getBgGPS());
                if (user.getListPlotBG().getBgLandStatus().equals("ที่ราบ") || (user.getListPlotBG().getBgLandStatus().equals("ที่ราบลอนคลื่น")) ||
                        (user.getListPlotBG().getBgLandStatus().equals("ที่ลุ่ม")) || user.getListPlotBG().getBgLandStatus().equals("ที่ลาดชัน"))
                    landStatus.setValue(user.getListPlotBG().getBgLandStatus());
                else {
                    landStatus.setValue("อื่นๆ");
                    tfOTLandTatus.setText(user.getListPlotBG().getBgLandStatus());
                }
                //"เหนียว","ร่วน","ทราย","ลูกรัง","ร่วนปนทราย","เหนียวปนทราย","อื่นๆ"
                if (user.getListPlotBG().getBgSoilType().equals("เหนียว") || user.getListPlotBG().getBgSoilType().equals("ร่วน") || user.getListPlotBG().getBgSoilType().equals("ทราย") ||
                        user.getListPlotBG().getBgSoilType().equals("ลูกรัง") || user.getListPlotBG().getBgSoilType().equals("ร่วนปนทราย") || user.getListPlotBG().getBgSoilType().equals("เหนียวปนทราย"))
                    soilType.setValue(user.getListPlotBG().getBgSoilType());
                else {
                    soilType.setValue("อื่นๆ");
                    tfOTsoilType.setText(user.getListPlotBG().getBgSoilType());
                }
                //"ไถพรวน","ร่วน","ทราย","ทำขั้นบันได","อื่นๆ"
                if (user.getListPlotBG().getBgPreType().equals("ไถพรวน") || user.getListPlotBG().getBgPreType().equals("ร่วน") || user.getListPlotBG().getBgPreType().equals("ทราย") ||
                        user.getListPlotBG().getBgPreType().equals("ทำขั้นบันได"))
                    preType.setValue(user.getListPlotBG().getBgPreType());
                else {
                    preType.setValue("อื่นๆ");
                    tfOTpreType.setText(user.getListPlotBG().getBgPreType());
                }
                //"ขั้นบันได","กองทางใบ","พื้นตระกูลถั่วคลุมดิน","ใช้ทำลายปาล์มเปล่าคลุม","อื่นๆ"
                if (user.getListPlotBG().getBgPreserve().equals("ขั้นบันได") || user.getListPlotBG().getBgPreserve().equals("กองทางใบ") || user.getListPlotBG().getBgPreserve().equals("พื้นตระกูลถั่วคลุมดิน") ||
                        user.getListPlotBG().getBgPreserve().equals("ใช้ทำลายปาล์มเปล่าคลุม"))
                    soilPreserve.setValue(user.getListPlotBG().getBgPreserve());
                else {
                    soilPreserve.setValue("อื่นๆ");
                    tfOTsoilPreserve.setText(user.getListPlotBG().getBgPreserve());
                }
                if (user.getListPlotBG().getBgWater().equals("มี"))
                    rbGive.setSelected(true);
                else
                    rbNGive.setSelected(true);
                switch (user.getListPlotBG().getBgWaterWhere()) {
                    case "น้ำฝน":
                        rbRain.setSelected(true);
                        break;
                    case "คลอง ห้วย บึง":
                        rbRiver.setSelected(true);
                        break;
                    case "สระเก็บน้ำใน":
                        rbPool.setSelected(true);
                        break;
                }
                tfBeforePalm.setText(user.getListPlotBG().getBgPreUse());
                if (user.getListPlotBG().getBgLandSize().equals("แบบสามเหลี่ยมด้านเท่า")) {
                    rbTri.setSelected(true);
                    cbTriSize.setValue(user.getListPlotBG().getBgLandSize2());
                } else if (user.getListPlotBG().getBgLandSize().equals("แบบสี่เหลี่ยม")) {
                    rbSqur.setSelected(true);
                    tfSqurSize.setText(user.getListPlotBG().getBgLandSize2());
                }
                //"เก็บเอง","จ้างผู้เหมา","อื่นๆ")
                if (user.getListPlotBG().getBgHarvest().equals("เก็บเอง") || user.getListPlotBG().getBgHarvest().equals("จ้างผู้เหมา"))
                    harvestType.setValue(user.getListPlotBG().getBgHarvest());
                else {
                    harvestType.setValue("อื่นๆ");
                    tfOTHarvest.setText(user.getListPlotBG().getBgHarvest());
                }
                if (user.getListPlotBG().getBgKill().equals("ไม่มี"))
                    rbNKillBug.setSelected(true);
                else {
                    rbKillBug.setSelected(true);
                    tfKillBug.setText(user.getListPlotBG().getBgKill());
                }
                tfBackAnno.setText(user.getListPlotBG().getBgAnno());

                if (user.getListBleeding().getRb1().equals(rbC11.getId()))
                    rbC11.setSelected(true);
                else if (user.getListBleeding().getRb1().equals(rbC12.getId()))
                    rbC12.setSelected(true);
                else if (user.getListBleeding().getRb1().equals(rbC13.getId()))
                    rbC13.setSelected(true);
                else if (user.getListBleeding().getRb1().equals(rbC14.getId())) {
                    rbC14.setSelected(true);
                    tfC14.setText(user.getListBleeding().getBdHowTo());
                } else if (user.getListBleeding().getRb1().equals(rbC15.getId())) {
                    rbC15.setSelected(true);
                    tfC15.setText(user.getListBleeding().getBdHowTo());
                } else if (user.getListBleeding().getRb1().equals(rbC16.getId())) {
                    rbC16.setSelected(true);
                    tfC16.setText(user.getListBleeding().getBdHowTo());
                } else if (user.getListBleeding().getRb1().equals(rbC17.getId())) {
                    rbC17.setSelected(true);
                    tfC17.setText(user.getListBleeding().getBdHowTo());
                }

                if (user.getListBleeding().getRb2().equals(rbC21.getId())) {
                    rbC21.setSelected(true);
                    tfC21.setText(user.getListBleeding().getBdType());
                } else {
                    rbC22.setSelected(true);
                }

                if (user.getListBleeding().getRb3().equals(rbC31.getId()))
                    rbC31.setSelected(true);
                else if (user.getListBleeding().getRb3().equals(rbC32.getId()))
                    rbC32.setSelected(true);
                tfC41.setText(user.getListBleeding().getBdAge());
                tfBDAnno.setText(user.getListBleeding().getBdAnno());

                slaDate.setText(user.getListSALMeta().getDate());
                slaOrg.setText(user.getListSALMeta().getOrg());

                if (user.getListPC2().getData57().equals("สถานีอุตุนิยมวิทยา จ.ชุมพร"))
                    PCCB1.setValue("สถานีอุตุนิยมวิทยา จ.ชุมพร");
                else if (!user.getListPC2().getData57().equals("")) {
                    PCCB1.setValue("อื่นๆ");
                    PCTFOT1.setText(user.getListPC2().getData57());
                } else {
                    PCCB1.setValue("");
                }
                if (user.getListPC2().getData58().equals("สถานีอุตุนิยมวิทยา จ.ชุมพร"))
                    PCCB2.setValue("สถานีอุตุนิยมวิทยา จ.ชุมพร");
                else if (!user.getListPC2().getData58().equals("")) {
                    PCCB2.setValue("อื่นๆ");
                    PCTFOT2.setText(user.getListPC2().getData58());
                } else {
                    PCCB2.setValue("");
                }
                if (user.getListPC2().getData59().equals("สถานีอุตุนิยมวิทยา จ.ชุมพร"))
                    PCCB3.setValue("สถานีอุตุนิยมวิทยา จ.ชุมพร");
                else if (!user.getListPC2().getData59().equals("")) {
                    PCCB3.setValue("อื่นๆ");
                    PCTFOT3.setText(user.getListPC2().getData59());
                } else {
                    PCCB3.setValue("");
                }

                if (user.getListPC2().getData60().equals("สถานีอุตุนิยมวิทยา จ.ชุมพร"))
                    PCCB4.setValue("สถานีอุตุนิยมวิทยา จ.ชุมพร");
                else if (!user.getListPC2().getData60().equals("")) {
                    PCCB4.setValue("อื่นๆ");
                    PCTFOT4.setText(user.getListPC2().getData60());
                } else {
                    PCCB4.setValue("");
                }
                if (user.getListPC2().getData61().equals("สถานีอุตุนิยมวิทยา จ.ชุมพร"))
                    PCCB5.setValue("สถานีอุตุนิยมวิทยา จ.ชุมพร");
                else if (!user.getListPC2().getData61().equals("")) {
                    PCCB5.setValue("อื่นๆ");
                    PCTFOT5.setText(user.getListPC2().getData61());
                } else {
                    PCCB5.setValue("");
                }
                PCTFDate1.setText(user.getListPC2().getDday57());
                PCTFDate2.setText(user.getListPC2().getDday58());
                PCTFDate3.setText(user.getListPC2().getDday59());
                PCTFDate4.setText(user.getListPC2().getDday60());
                PCTFDate5.setText(user.getListPC2().getDday61());

                MGCB1.setValue(user.getListMG2().getSheet57());
                MGCB2.setValue(user.getListMG2().getSheet58());
                MGCB3.setValue(user.getListMG2().getSheet59());
                MGCB4.setValue(user.getListMG2().getSheet60());
                MGCB5.setValue(user.getListMG2().getSheet61());

                if (user.getListY() != null)
                    tbYields.setAll(user.getListY());

                if (user.getListMY() != null)
                    tbMYields.setAll(user.getListMY());

                tbFertilizerCondList.setAll(user.getListFC());
                tbFertilizerRecList.setAll(user.getListFR());
                tbSoilAndLeavesList.setAll(user.getListSLA1());
                tbSoilAndLeaves2List.setAll(user.getListSLA2());
                tbSoilAndLeaves3List.setAll(user.getListSLA3());
                tbSoilAnalysisList.setAll(user.getListSA());
                tbNutrientDeficiencyList.setAll(user.getListND());
                tbPerticicideApplicationList.setAll(user.getListPA());
                tbPrecipitationList.setAll(user.getListPC());
                tbGuestVisitList.setAll(user.getListGV());
                tbTrainingHistoryList.setAll(user.getListTH());
                tbManagementList.setAll(user.getListMG());

            }
        }

        btnBack.setOnAction(event -> {
            try {
                Parent parent = FXMLLoader.load(getClass().getResource("../fxml/listMenu.fxml"));
                Scene scene = new Scene(parent);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        //SaveFile
        toolBtnSave.setOnAction(event -> {

            //Save PlotInfo//
            RadioButton temp = new RadioButton();
            plotInfoList.setPlotName(tfPlotName.getText());
            plotInfoList.setPlotAddr(tfPlotAddr.getText());
            plotInfoList.setPlotType(cbPlotType.getValue());
            plotInfoList.setPlotYear1(tfYear.getText());
            temp = (RadioButton) A.getSelectedToggle();
            plotInfoList.setPlotYear2(temp.getText());
            plotInfoList.setPlotSize(tfPlotSize.getText());
            plotInfoList.setPlotTreeAll(tfPlotTreeAll.getText());
            plotInfoList.setPlotTreeDead(tfPlotTreeDead.getText());
            plotInfoList.setPlotTreeRe(tfPlotTreeRe.getText());
            plotInfoList.setPlotHowtoDead(tfPlotHowToDead.getText());
            plotInfoList.setPlotOwnnerName(tfPlotOwnerName.getText());
            plotInfoList.setPlotOwnnerAddr(tfPlotOwnerAddr.getText());
            plotInfoList.setPlotOwnnerTel(tfPlotOwnerTel.getText());
            plotInfoList.setPlotAnno(tfPlotAnno.getText());

            //Save PlotBackGround//
            plotBGList.setBgLand(tfSoilType.getText());
            plotBGList.setBgGPS(tfGPS.getText());
            if (!landStatus.getValue().equals("อื่นๆ"))
                plotBGList.setBgLandStatus(landStatus.getValue());
            else
                plotBGList.setBgLandStatus(tfOTLandTatus.getText());
            if (!soilType.getValue().equals("อื่นๆ"))
                plotBGList.setBgSoilType(soilType.getValue());
            else
                plotBGList.setBgSoilType(tfOTsoilType.getText());
            if (!preType.getValue().equals("อื่นๆ"))
                plotBGList.setBgPreType(preType.getValue());
            else
                plotBGList.setBgPreType(tfOTpreType.getText());
            if (!soilPreserve.getValue().equals("อื่นๆ"))
                plotBGList.setBgPreserve(soilPreserve.getValue());
            else
                plotBGList.setBgPreserve(tfOTsoilPreserve.getText());
            temp = (RadioButton) B8.getSelectedToggle();
            plotBGList.setBgWater(temp.getText());
            temp = (RadioButton) B9.getSelectedToggle();
            plotBGList.setBgWaterWhere(temp.getText());
            plotBGList.setBgPreUse(tfBeforePalm.getText());
            temp = (RadioButton) B11.getSelectedToggle();
            if (B11.getSelectedToggle().equals(rbTri)) {
                plotBGList.setBgLandSize(temp.getText());
                plotBGList.setBgLandSize2(cbTriSize.getValue());
            } else if (B11.getSelectedToggle().equals(rbSqur)) {
                plotBGList.setBgLandSize(temp.getText());
                plotBGList.setBgLandSize2(tfSqurSize.getText());
            }
            if (!harvestType.getValue().equals("อื่นๆ"))
                plotBGList.setBgHarvest(harvestType.getValue());
            else
                plotBGList.setBgHarvest(tfOTHarvest.getText());
            temp = (RadioButton) B13.getSelectedToggle();
            if (B13.getSelectedToggle().equals(rbKillBug)) {
                plotBGList.setBgKill(tfKillBug.getText());
            } else {
                plotBGList.setBgKill(temp.getText());
            }
            plotBGList.setBgAnno(tfBackAnno.getText());

            //Save Bleeding
            temp = (RadioButton) C2.getSelectedToggle();
            if (temp.getId().equals("rbC14")) {
                bleedingList.setBdHowto(tfC14.getText());
                bleedingList.setRb1("rbC14");
            } else if (temp.getId().equals("rbC15")) {
                bleedingList.setBdHowto(tfC15.getText());
                bleedingList.setRb1("rbC15");
            } else if (temp.getId().equals("rbC16")) {
                bleedingList.setBdHowto(tfC16.getText());
                bleedingList.setRb1("rbC16");
            } else if (temp.getId().equals("rbC17")) {
                bleedingList.setBdHowto(tfC17.getText());
                bleedingList.setRb1("rbC17");
            } else {
                bleedingList.setBdHowto(temp.getText());
                bleedingList.setRb1(temp.getId());
            }
            temp = (RadioButton) C7.getSelectedToggle();
            if (temp.getId().equals("rbC21")) {
                bleedingList.setBdType(tfC21.getText());
                bleedingList.setRb2("rbC21");
            } else {
                bleedingList.setBdType(temp.getText());
                bleedingList.setRb2(temp.getId());
            }
            temp = (RadioButton) C9.getSelectedToggle();
            bleedingList.setBdChoose(temp.getText());
            bleedingList.setRb3(temp.getId());
            bleedingList.setBdAge(tfC41.getText());
            bleedingList.setBdAnno(tfBDAnno.getText());
            ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //Save Precipition
            pc2.setDday57(PCTFDate1.getText());
            pc2.setDday58(PCTFDate2.getText());
            pc2.setDday59(PCTFDate3.getText());
            pc2.setDday60(PCTFDate4.getText());
            pc2.setDday61(PCTFDate5.getText());
            if (pc2.getDday57() != null && !pc2.getDday57().trim().isEmpty())
                if (PCCB1.getValue().equals("อื่นๆ"))
                    pc2.setData57(PCTFOT1.getText());
                else
                    pc2.setData57(PCCB1.getValue());

            if (pc2.getDday58() != null && !pc2.getDday58().trim().isEmpty())
                if (PCCB2.getValue().equals("อื่นๆ"))
                    pc2.setData58(PCTFOT2.getText());
                else
                    pc2.setData58(PCCB2.getValue());

            if (pc2.getDday59() != null && !pc2.getDday59().trim().isEmpty())
                if (PCCB3.getValue().equals("อื่นๆ"))
                    pc2.setData59(PCTFOT3.getText());
                else
                    pc2.setData59(PCCB3.getValue());

            if (pc2.getDday60() != null && !pc2.getDday60().trim().isEmpty())
                if (PCCB4.getValue().equals("อื่นๆ"))
                    pc2.setData60(PCTFOT4.getText());
                else
                    pc2.setData60(PCCB4.getValue());

            if (pc2.getDday61() != null && !pc2.getDday61().trim().isEmpty())
                if (PCCB5.getValue().equals("อื่นๆ"))
                    pc2.setData61(PCTFOT5.getText());
                else
                    pc2.setData61(PCCB5.getValue());

            //Save Manage
            mg2list.setSheet57(MGCB1.getValue());
            mg2list.setSheet58(MGCB2.getValue());
            mg2list.setSheet59(MGCB3.getValue());
            mg2list.setSheet60(MGCB4.getValue());
            mg2list.setSheet61(MGCB5.getValue());
            slaMeta.setDate(slaDate.getText());
            slaMeta.setOrg(slaOrg.getText());

            if (listMenuController.indexGroup != null)
                user.group = listMenuController.indexGroup;
            user.id = listMenuController.indexId;
            System.out.println("id" + user.id);
            System.out.println("index" + listMenuController.indexId);

            //Save All Table
            user.setListPlotInfo(plotInfoList);
            user.setListPlotBG(plotBGList);
            user.setListBleeding(bleedingList);
            user.setListPC2(pc2);
            user.setListMG2(mg2list);
            user.setListPA(tbPerticicideApplicationList);
            user.setListTH(tbTrainingHistoryList);
            user.setListGV(tbGuestVisitList);
            user.setListFC(tbFertilizerCondList);
            user.setListND(tbNutrientDeficiencyList);
            user.setListFR(tbFertilizerRecList);
            user.setListPC(tbPrecipitationList);
            user.setListSALMeta(slaMeta);
            user.setListSLA1(tbSoilAndLeavesList);
            user.setListSLA2(tbSoilAndLeaves2List);
            user.setListSLA3(tbSoilAndLeaves3List);
            user.setListSA(tbSoilAnalysisList);
            user.setListMG(tbManagementList);
            user.setListY(tbYields);
            user.setListMY(tbMYields);

            if (loadedData != null) {
                if (loadedData.userArrayList.size() > listMenuController.indexId)
                    loadedData.userArrayList.set(listMenuController.indexId, user);
                else if (listMenuController.indexId == loadedData.userArrayList.size())
                    loadedData.userArrayList.add(user);
                else {
                    user.id = listMenuController.indexId = loadedData.userArrayList.size();
                    loadedData.userArrayList.add(user);
                }
            } else {
                loadedData.userArrayList.add(user);
            }
            //Marshaller
            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(UserWrapper.class);
                Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

                jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                jaxbMarshaller.marshal(loadedData, file);
                jaxbMarshaller.marshal(loadedData, System.out);

            } catch (JAXBException e) {
                e.printStackTrace();
            }

            popup_sav();

        });

        //---------------Table Behavior--------------------//

        //-----------------------Yield------------------------//
        Yield.setEditable(true);
        colDayY.setCellValueFactory(new PropertyValueFactory<>("date"));
        colWeightTY.setCellValueFactory(new PropertyValueFactory<>("bunchWeight"));
        colCostTY.setCellValueFactory(new PropertyValueFactory<>("bunchCost"));
        colSumTY.setCellValueFactory(new PropertyValueFactory<>("bunchSum"));
        colWeightRY.setCellValueFactory(new PropertyValueFactory<>("productWeight"));
        colCostRY.setCellValueFactory(new PropertyValueFactory<>("productCost"));
        colSumRY.setCellValueFactory(new PropertyValueFactory<>("productSum"));
        colSumWeightY.setCellValueFactory(new PropertyValueFactory<>("sumWeight"));
        colSumCostY.setCellValueFactory(new PropertyValueFactory<>("sumCost"));
        colDayY.setCellFactory(TextFieldTableCell.forTableColumn());
        colWeightTY.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostTY.setCellFactory(TextFieldTableCell.forTableColumn());
        colSumTY.setCellFactory(TextFieldTableCell.forTableColumn());
        colWeightRY.setCellFactory(TextFieldTableCell.forTableColumn());
        colCostRY.setCellFactory(TextFieldTableCell.forTableColumn());
        colSumRY.setCellFactory(TextFieldTableCell.forTableColumn());
        colSumWeightY.setCellFactory(TextFieldTableCell.forTableColumn());
        colSumCostY.setCellFactory(TextFieldTableCell.forTableColumn());
        colDayY.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setDate(t.getNewValue()));
        colWeightTY.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setBunchWeight(t.getNewValue()));
        colCostTY.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setBunchCost(t.getNewValue()));
        colSumTY.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setBunchSum(t.getNewValue()));
        colWeightRY.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setProductWeight(t.getNewValue()));
        colCostRY.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setProductCost(t.getNewValue()));
        colSumRY.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setProductSum(t.getNewValue()));
        colSumWeightY.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setSumWeight(t.getNewValue()));
        colSumCostY.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setSumCost(t.getNewValue()));
        btnAddY.setOnAction(e -> {
            tbYields.add(
                    new tbYield(
                            tfMY.getText(),
                            tfBunchWeight.getText(),
                            tfBunchCost.getText(),
                            tfBunchSum.getText(),
                            tfProductWeight.getText(),
                            tfProductCost.getText(),
                            tfProductSum.getText(),
                            tfSumWeight.getText(),
                            tfSumCost.getText()
                    )
            );

            tfMY.clear();
            tfBunchWeight.clear();
            tfBunchCost.clear();
            tfBunchSum.clear();
            tfProductWeight.clear();
            tfProductCost.clear();
            tfProductSum.clear();
            tfSumWeight.clear();
            tfSumCost.clear();
        });
        Yield.setItems(tbYields);
        btnExcelY.setOnAction(event -> {
            Stage stage = new Stage();
            final FileChooser fileChooser = new FileChooser();
            File XlsxFile = fileChooser.showOpenDialog(stage);
            ReaderXlsx reader = new ReaderXlsx();
            try {
                tbYields = reader.readToYield(XlsxFile);
                Yield.setItems(tbYields);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        //-------------------------MYield----------------------//
        MYield.setEditable(true);
        colMMY.setCellValueFactory(new PropertyValueFactory<>("month"));
        colW57.setCellValueFactory(new PropertyValueFactory<>("sumWeight2557"));
        colC57.setCellValueFactory(new PropertyValueFactory<>("sumCost2557"));
        colA57.setCellValueFactory(new PropertyValueFactory<>("avg2557"));
        colW58.setCellValueFactory(new PropertyValueFactory<>("sumWeight2558"));
        colC58.setCellValueFactory(new PropertyValueFactory<>("sumCost2558"));
        colA58.setCellValueFactory(new PropertyValueFactory<>("avg2558"));
        colW59.setCellValueFactory(new PropertyValueFactory<>("sumWeight2559"));
        colC59.setCellValueFactory(new PropertyValueFactory<>("sumCost2559"));
        colA59.setCellValueFactory(new PropertyValueFactory<>("avg2559"));
        colW60.setCellValueFactory(new PropertyValueFactory<>("sumWeight2560"));
        colC60.setCellValueFactory(new PropertyValueFactory<>("sumCost2560"));
        colA60.setCellValueFactory(new PropertyValueFactory<>("avg2560"));
        colW61.setCellValueFactory(new PropertyValueFactory<>("sumWeight2561"));
        colC61.setCellValueFactory(new PropertyValueFactory<>("sumCost2561"));
        colA61.setCellValueFactory(new PropertyValueFactory<>("avg2561"));
        colMMY.setCellFactory(TextFieldTableCell.forTableColumn());
        colW57.setCellFactory(TextFieldTableCell.forTableColumn());
        colC57.setCellFactory(TextFieldTableCell.forTableColumn());
        colA57.setCellFactory(TextFieldTableCell.forTableColumn());
        colW58.setCellFactory(TextFieldTableCell.forTableColumn());
        colC58.setCellFactory(TextFieldTableCell.forTableColumn());
        colA58.setCellFactory(TextFieldTableCell.forTableColumn());
        colW59.setCellFactory(TextFieldTableCell.forTableColumn());
        colC59.setCellFactory(TextFieldTableCell.forTableColumn());
        colA59.setCellFactory(TextFieldTableCell.forTableColumn());
        colW60.setCellFactory(TextFieldTableCell.forTableColumn());
        colC60.setCellFactory(TextFieldTableCell.forTableColumn());
        colA60.setCellFactory(TextFieldTableCell.forTableColumn());
        colW61.setCellFactory(TextFieldTableCell.forTableColumn());
        colC61.setCellFactory(TextFieldTableCell.forTableColumn());
        colA61.setCellFactory(TextFieldTableCell.forTableColumn());
        colMMY.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setMonth(t.getNewValue()));
        colW57.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setSumWeight2557(t.getNewValue()));
        colW58.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setSumWeight2558(t.getNewValue()));
        colW59.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setSumWeight2559(t.getNewValue()));
        colW60.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setSumWeight2560(t.getNewValue()));
        colW61.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setSumWeight2561(t.getNewValue()));
        colC57.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setSumCost2557(t.getNewValue()));
        colC57.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setSumCost2558(t.getNewValue()));
        colC57.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setSumCost2559(t.getNewValue()));
        colC57.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setSumCost2560(t.getNewValue()));
        colC57.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setSumCost2561(t.getNewValue()));
        colA57.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setAvg2557(t.getNewValue()));
        colA58.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setAvg2558(t.getNewValue()));
        colA59.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setAvg2559(t.getNewValue()));
        colA60.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setAvg2560(t.getNewValue()));
        colA61.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setAvg2561(t.getNewValue()));
        btnAddMY.setOnAction(e -> {
            tbMYields.addAll(
                    new tbMYield(
                            tfMMY.getText(),
                            tfW57.getText(),
                            tfC57.getText(),
                            tfA57.getText(),
                            tfW58.getText(),
                            tfC58.getText(),
                            tfA58.getText(),
                            tfW59.getText(),
                            tfC59.getText(),
                            tfA59.getText(),
                            tfW60.getText(),
                            tfC60.getText(),
                            tfA60.getText(),
                            tfW61.getText(),
                            tfC61.getText(),
                            tfA61.getText()
                    )
            );
            tfMMY.clear();
            tfW57.clear();
            tfW58.clear();
            tfW59.clear();
            tfW60.clear();
            tfW61.clear();
            tfC57.clear();
            tfC58.clear();
            tfC59.clear();
            tfC60.clear();
            tfC61.clear();
            tfA57.clear();
            tfA58.clear();
            tfA59.clear();
            tfA60.clear();
            tfA61.clear();
        });
        btnExcelMY.setOnAction(event -> {
            Stage stage = new Stage();
            final FileChooser fileChooser = new FileChooser();
            File XlsxFile = fileChooser.showOpenDialog(stage);
            TextInputDialog dialog = new TextInputDialog("0");
            dialog.setTitle("เลือกชีท");
            dialog.setContentText("ใส่หมายเลขชีท : ");
            Optional<String> result = dialog.showAndWait();
            int iSheet = 0;
            if (result.isPresent()) {
                iSheet = Integer.parseInt(result.get());
            }
            ReaderXlsx reader = new ReaderXlsx();
            try {
                tbMYields.addAll(reader.readToMYield(XlsxFile, iSheet));
                MYield.setItems(tbMYields);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        MYield.setItems(tbMYields);

        //-------------------------SA-------------------------//
        SoilAnalysis.setEditable(true);
        SAC1.setCellValueFactory(new PropertyValueFactory<>("col1"));
        SAC2.setCellValueFactory(new PropertyValueFactory<>("col2"));
        SAC3.setCellValueFactory(new PropertyValueFactory<>("col3"));
        SAC4.setCellValueFactory(new PropertyValueFactory<>("col4"));
        SAC5.setCellValueFactory(new PropertyValueFactory<>("col5"));
        SAC6.setCellValueFactory(new PropertyValueFactory<>("col6"));
        SAC7.setCellValueFactory(new PropertyValueFactory<>("col7"));
        SAC8.setCellValueFactory(new PropertyValueFactory<>("col8"));
        SAC9.setCellValueFactory(new PropertyValueFactory<>("col9"));
        SAC10.setCellValueFactory(new PropertyValueFactory<>("col10"));
        SAC11.setCellValueFactory(new PropertyValueFactory<>("col11"));
        SAC12.setCellValueFactory(new PropertyValueFactory<>("col12"));
        SAC13.setCellValueFactory(new PropertyValueFactory<>("col13"));
        SAC14.setCellValueFactory(new PropertyValueFactory<>("col14"));
        SAC15.setCellValueFactory(new PropertyValueFactory<>("col15"));
        SAC1.setCellFactory(TextFieldTableCell.forTableColumn());
        SAC2.setCellFactory(TextFieldTableCell.forTableColumn());
        SAC3.setCellFactory(TextFieldTableCell.forTableColumn());
        SAC4.setCellFactory(TextFieldTableCell.forTableColumn());
        SAC5.setCellFactory(TextFieldTableCell.forTableColumn());
        SAC6.setCellFactory(TextFieldTableCell.forTableColumn());
        SAC7.setCellFactory(TextFieldTableCell.forTableColumn());
        SAC8.setCellFactory(TextFieldTableCell.forTableColumn());
        SAC9.setCellFactory(TextFieldTableCell.forTableColumn());
        SAC10.setCellFactory(TextFieldTableCell.forTableColumn());
        SAC11.setCellFactory(TextFieldTableCell.forTableColumn());
        SAC12.setCellFactory(TextFieldTableCell.forTableColumn());
        SAC13.setCellFactory(TextFieldTableCell.forTableColumn());
        SAC14.setCellFactory(TextFieldTableCell.forTableColumn());
        SAC15.setCellFactory(TextFieldTableCell.forTableColumn());
        SAC1.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCol1(t.getNewValue()));
        SAC2.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCol2(t.getNewValue()));
        SAC3.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCol3(t.getNewValue()));
        SAC4.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCol4(t.getNewValue()));
        SAC5.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCol5(t.getNewValue()));
        SAC6.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCol6(t.getNewValue()));
        SAC7.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCol7(t.getNewValue()));
        SAC8.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCol8(t.getNewValue()));
        SAC9.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCol9(t.getNewValue()));
        SAC10.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCol10(t.getNewValue()));
        SAC11.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCol11(t.getNewValue()));
        SAC12.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCol12(t.getNewValue()));
        SAC13.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCol13(t.getNewValue()));
        SAC14.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCol14(t.getNewValue()));
        SAC15.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCol15(t.getNewValue()));
        SABT1.setOnAction(event2 -> {
            tbSoilAnalysisList.add(
                    new tbSoilAnalysis(
                            SATF1.getText(),
                            SATF2.getText(),
                            SATF3.getText(),
                            SATF4.getText(),
                            SATF5.getText(),
                            SATF6.getText(),
                            SATF7.getText(),
                            SATF8.getText(),
                            SATF9.getText(),
                            SATF10.getText(),
                            SATF11.getText(),
                            SATF12.getText(),
                            SATF13.getText(),
                            SATF14.getText(),
                            SATF15.getText()

                    )
            );
            SATF1.clear();
            SATF2.clear();
            SATF3.clear();
            SATF4.clear();
            SATF5.clear();
            SATF6.clear();
            SATF7.clear();
            SATF8.clear();
            SATF9.clear();
            SATF10.clear();
            SATF11.clear();
            SATF12.clear();
            SATF13.clear();
            SATF14.clear();
            SATF15.clear();
        });
        SoilAnalysis.setItems(tbSoilAnalysisList);


        //=============Sla====================================
        slaR.setEditable(true);
        slaC1.setCellValueFactory(new PropertyValueFactory<>("N"));
        slaC1.setCellFactory(TextFieldTableCell.forTableColumn());
        slaC1.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setN(t.getNewValue()));
        slaC2.setCellValueFactory(new PropertyValueFactory<>("P"));
        slaC2.setCellFactory(TextFieldTableCell.forTableColumn());
        slaC2.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setP(t.getNewValue()));
        slaC3.setCellValueFactory(new PropertyValueFactory<>("K"));
        slaC3.setCellFactory(TextFieldTableCell.forTableColumn());
        slaC3.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setK(t.getNewValue()));
        slaC4.setCellValueFactory(new PropertyValueFactory<>("Mg"));
        slaC4.setCellFactory(TextFieldTableCell.forTableColumn());
        slaC4.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setMg(t.getNewValue()));
        slaC5.setCellValueFactory(new PropertyValueFactory<>("Ca"));
        slaC5.setCellFactory(TextFieldTableCell.forTableColumn());
        slaC5.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCa(t.getNewValue()));
        slaC6.setCellValueFactory(new PropertyValueFactory<>("S"));
        slaC6.setCellFactory(TextFieldTableCell.forTableColumn());
        slaC6.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setS(t.getNewValue()));
        slaC7.setCellValueFactory(new PropertyValueFactory<>("B"));
        slaC7.setCellFactory(TextFieldTableCell.forTableColumn());
        slaC7.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setB(t.getNewValue()));
        slaC8.setCellValueFactory(new PropertyValueFactory<>("Mn"));
        slaC8.setCellFactory(TextFieldTableCell.forTableColumn());
        slaC8.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setMn(t.getNewValue()));
        slaR.setItems(tbSoilAndLeavesList);

        sla2R.setEditable(true);
        sla2C1.setCellValueFactory(new PropertyValueFactory<>("element"));
        sla2C1.setCellFactory(TextFieldTableCell.forTableColumn());
        sla2C1.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setElement(t.getNewValue()));
        sla2C2.setCellValueFactory(new PropertyValueFactory<>("std"));
        sla2C2.setCellFactory(TextFieldTableCell.forTableColumn());
        sla2C2.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setStd(t.getNewValue()));
        sla2C3.setCellValueFactory(new PropertyValueFactory<>("cal"));
        sla2C3.setCellFactory(TextFieldTableCell.forTableColumn());
        sla2C3.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCal(t.getNewValue()));
        sla2C4.setCellValueFactory(new PropertyValueFactory<>("care"));
        sla2C4.setCellFactory(TextFieldTableCell.forTableColumn());
        sla2C4.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCare(t.getNewValue()));
        sla2R.setItems(tbSoilAndLeaves2List);
        sla3R.setEditable(true);
        sla3C1.setCellValueFactory(new PropertyValueFactory<>("type"));
        sla3C1.setCellFactory(TextFieldTableCell.forTableColumn());
        sla3C1.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setType(t.getNewValue()));
        sla3C2.setCellValueFactory(new PropertyValueFactory<>("rate"));
        sla3C2.setCellFactory(TextFieldTableCell.forTableColumn());
        sla3C2.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setRate(t.getNewValue()));
        sla3C3.setCellValueFactory(new PropertyValueFactory<>("round"));
        sla3C3.setCellFactory(TextFieldTableCell.forTableColumn());
        sla3C3.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setRound1(t.getNewValue()));
        sla3C4.setCellValueFactory(new PropertyValueFactory<>("round"));
        sla3C4.setCellFactory(TextFieldTableCell.forTableColumn());
        sla3C4.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setRound2(t.getNewValue()));
        sla3C5.setCellValueFactory(new PropertyValueFactory<>("round"));
        sla3C5.setCellFactory(TextFieldTableCell.forTableColumn());
        sla3C5.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setRound3(t.getNewValue()));
        sla3C6.setCellValueFactory(new PropertyValueFactory<>("anno"));
        sla3C6.setCellFactory(TextFieldTableCell.forTableColumn());
        sla3C6.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setAnno(t.getNewValue()));
        sla3R.setItems(tbSoilAndLeaves3List);
        //-----------------Precipitation----------------------//
        Precipitation.setEditable(true);
        PCC1.setCellValueFactory(new PropertyValueFactory<>("month"));
//        PCC1.setCellFactory(TextFieldTableCell.forTableColumn());
//        PCC1.setOnEditCommit(t -> t.getTableView().getItems().get(
//                t.getTablePosition().getRow()).setMonth(t.getNewValue()));

        PCC2.setCellValueFactory(new PropertyValueFactory<>("volume57"));
        PCC2.setCellFactory(TextFieldTableCell.forTableColumn());
        PCC2.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setVolume57(t.getNewValue()));

        PCC3.setCellValueFactory(new PropertyValueFactory<>("aday57"));
        PCC3.setCellFactory(TextFieldTableCell.forTableColumn());
        PCC3.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setAday57(t.getNewValue()));

        PCC4.setCellValueFactory(new PropertyValueFactory<>("volume58"));
        PCC4.setCellFactory(TextFieldTableCell.forTableColumn());
        PCC4.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setVolume58(t.getNewValue()));

        PCC5.setCellValueFactory(new PropertyValueFactory<>("aday58"));
        PCC5.setCellFactory(TextFieldTableCell.forTableColumn());
        PCC5.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setAday58(t.getNewValue()));

        PCC6.setCellValueFactory(new PropertyValueFactory<>("volume59"));
        PCC6.setCellFactory(TextFieldTableCell.forTableColumn());
        PCC6.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setVolume59(t.getNewValue()));

        PCC7.setCellValueFactory(new PropertyValueFactory<>("aday59"));
        PCC7.setCellFactory(TextFieldTableCell.forTableColumn());
        PCC7.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setAday59(t.getNewValue()));
        PCC8.setCellValueFactory(new PropertyValueFactory<>("volume60"));

        PCC8.setCellFactory(TextFieldTableCell.forTableColumn());
        PCC8.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setVolume60(t.getNewValue()));

        PCC9.setCellValueFactory(new PropertyValueFactory<>("aday60"));
        PCC9.setCellFactory(TextFieldTableCell.forTableColumn());
        PCC9.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setAday60(t.getNewValue()));

        PCC10.setCellValueFactory(new PropertyValueFactory<>("volume61"));
        PCC10.setCellFactory(TextFieldTableCell.forTableColumn());
        PCC10.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setVolume61(t.getNewValue()));

        PCC11.setCellValueFactory(new PropertyValueFactory<>("aday61"));
        PCC11.setCellFactory(TextFieldTableCell.forTableColumn());
        PCC11.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setAday61(t.getNewValue()));
        btnCopyPC.setOnAction(event2 -> {
            Stage stage = new Stage();
            final FileChooser fileChooser = new FileChooser();
            File xmlfile = fileChooser.showOpenDialog(stage);
            Copy copy = new Copy();
            tbPrecipitationList = copy.CopyPC(xmlfile);
            Precipitation.setItems(tbPrecipitationList);

            Precipitation2 temp = copy.CopyPC2(xmlfile);

            if (temp.getData57().equals("สถานีอุตุนิยมวิทยา จ.ชุมพร"))
                PCCB1.setValue("สถานีอุตุนิยมวิทยา จ.ชุมพร");
            else if (!temp.getData57().equals("")) {
                PCCB1.setValue("อื่นๆ");
                PCTFOT1.setText(temp.getData57());
            } else {
                PCCB1.setValue("");
            }
            if (temp.getData58().equals("สถานีอุตุนิยมวิทยา จ.ชุมพร"))
                PCCB2.setValue("สถานีอุตุนิยมวิทยา จ.ชุมพร");
            else if (!temp.getData58().equals("")) {
                PCCB2.setValue("อื่นๆ");
                PCTFOT2.setText(temp.getData58());
            } else {
                PCCB2.setValue("");
            }
            if (temp.getData59().equals("สถานีอุตุนิยมวิทยา จ.ชุมพร"))
                PCCB3.setValue("สถานีอุตุนิยมวิทยา จ.ชุมพร");
            else if (!temp.getData59().equals("")) {
                PCCB3.setValue("อื่นๆ");
                PCTFOT3.setText(temp.getData59());
            } else {
                PCCB3.setValue("");
            }

            if (temp.getData60().equals("สถานีอุตุนิยมวิทยา จ.ชุมพร"))
                PCCB4.setValue("สถานีอุตุนิยมวิทยา จ.ชุมพร");
            else if (!temp.getData60().equals("")) {
                PCCB4.setValue("อื่นๆ");
                PCTFOT4.setText(temp.getData60());
            } else {
                PCCB4.setValue("");
            }
            if (temp.getData61().equals("สถานีอุตุนิยมวิทยา จ.ชุมพร"))
                PCCB5.setValue("สถานีอุตุนิยมวิทยา จ.ชุมพร");
            else if (!temp.getData61().equals("")) {
                PCCB5.setValue("อื่นๆ");
                PCTFOT5.setText(temp.getData61());
            } else {
                PCCB5.setValue("");
            }
            PCTFDate1.setText(temp.getDday57());
            PCTFDate2.setText(temp.getDday58());
            PCTFDate3.setText(temp.getDday59());
            PCTFDate4.setText(temp.getDday60());
            PCTFDate5.setText(temp.getDday61());
        });
        Precipitation.setItems(tbPrecipitationList);

        //------------------Fertilizing Record----------------//

        FertilizerRec.setEditable(true);
        FRC1.setCellValueFactory(new PropertyValueFactory<>("FertType"));
        FRC1.setCellFactory(TextFieldTableCell.forTableColumn());
        FRC1.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setFertType(t.getNewValue()));
        FRC2.setCellValueFactory(new PropertyValueFactory<>("M1"));
        FRC2.setCellFactory(TextFieldTableCell.forTableColumn());
        FRC2.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setM1(t.getNewValue()));
        FRC3.setCellValueFactory(new PropertyValueFactory<>("A1"));
        FRC3.setCellFactory(TextFieldTableCell.forTableColumn(new StringConverter<Double>() {
            @Override
            public String toString(Double object) {
                return object.toString();
            }

            @Override
            public Double fromString(String string) {
                return Double.parseDouble(string);
            }
        }));
        FRC3.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setA1(t.getNewValue()));
        FRC4.setCellValueFactory(new PropertyValueFactory<>("M2"));
        FRC4.setCellFactory(TextFieldTableCell.forTableColumn());
        FRC4.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setM2(t.getNewValue()));
        FRC5.setCellValueFactory(new PropertyValueFactory<>("A2"));
        FRC5.setCellFactory(TextFieldTableCell.forTableColumn(new StringConverter<Double>() {
            @Override
            public String toString(Double object) {
                return object.toString();
            }

            @Override
            public Double fromString(String string) {
                return Double.parseDouble(string);
            }
        }));
        FRC5.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setA2(t.getNewValue()));
        FRC6.setCellValueFactory(new PropertyValueFactory<>("M3"));
        FRC6.setCellFactory(TextFieldTableCell.forTableColumn());
        FRC6.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setM3(t.getNewValue()));
        FRC7.setCellValueFactory(new PropertyValueFactory<>("A3"));
        FRC7.setCellFactory(TextFieldTableCell.forTableColumn(new StringConverter<Double>() {
            @Override
            public String toString(Double object) {
                return object.toString();
            }

            @Override
            public Double fromString(String string) {
                return Double.parseDouble(string);
            }
        }));
        FRC7.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setA3(t.getNewValue()));
        FRC8.setCellValueFactory(new PropertyValueFactory<>("M4"));
        FRC8.setCellFactory(TextFieldTableCell.forTableColumn());
        FRC8.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setM4(t.getNewValue()));
        FRC9.setCellValueFactory(new PropertyValueFactory<>("A4"));
        FRC9.setCellFactory(TextFieldTableCell.forTableColumn(new StringConverter<Double>() {
            @Override
            public String toString(Double object) {
                return object.toString();
            }

            @Override
            public Double fromString(String string) {
                return Double.parseDouble(string);
            }
        }));
        FRC9.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setA4(t.getNewValue()));
        FRC10.setCellValueFactory(new PropertyValueFactory<>("sum"));
        FRC10.setCellFactory(TextFieldTableCell.forTableColumn(new StringConverter<Double>() {
            @Override
            public String toString(Double object) {
                return object.toString();
            }

            @Override
            public Double fromString(String string) {
                return Double.parseDouble(string);
            }
        }));
        FRC10.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setSum(t.getNewValue()));
        FRB1.setOnAction(event -> {
            double a, b, c, d;
            if (FRTF3.getText() != null && !FRTF3.getText().trim().isEmpty()) {
                a = Double.parseDouble(FRTF3.getText());
            } else a = 0;
            if (FRTF5.getText() != null && !FRTF5.getText().trim().isEmpty()) {
                b = Double.parseDouble(FRTF5.getText());
            } else b = 0;
            if (FRTF7.getText() != null && !FRTF7.getText().trim().isEmpty()) {
                c = Double.parseDouble(FRTF7.getText());
            } else c = 0;
            if (FRTF9.getText() != null && !FRTF9.getText().trim().isEmpty()) {
                d = Double.parseDouble(FRTF9.getText());
            } else d = 0;
            double sum = a + b + c + d;
            System.out.print(sum);
            tbFertilizerRecList.add(
                    new tbFertilizerRec(
                            tfYearChooser.getText(),
                            FRTF1.getText(),
                            FRTF2.getText(),
                            FRTF4.getText(),
                            FRTF6.getText(),
                            FRTF8.getText(),
                            a,
                            b,
                            c,
                            d,
                            sum
                    )
            );
            tbFertilizerRecListTemp.add(
                    new tbFertilizerRec(
                            tfYearChooser.getText(),
                            FRTF1.getText(),
                            FRTF2.getText(),
                            FRTF4.getText(),
                            FRTF6.getText(),
                            FRTF8.getText(),
                            a,
                            b,
                            c,
                            d,
                            sum
                    )
            );
            FRTF1.clear();
            FRTF2.clear();
            FRTF3.clear();
            FRTF4.clear();
            FRTF5.clear();
            FRTF6.clear();
            FRTF7.clear();
            FRTF8.clear();
            FRTF9.clear();
        });
        tfYearChooser.setOnAction(event1 -> {
            lbYearChoose.setText(tfYearChooser.getText());
            tbFertilizerRecListTemp.clear();
            tbFertilizerRecListTemp.addAll(tbFertilizerRecList.stream().filter(i -> i.getYear().equals(tfYearChooser.getText())).collect(Collectors.toList()));
        });
        FertilizerRec.setItems(tbFertilizerRecListTemp);

        //------------------Guest Visit-----------------------//
        GuestVisit.setEditable(true);
        colDayGV.setCellValueFactory(new PropertyValueFactory<>("day"));
        colDetailGV.setCellValueFactory(new PropertyValueFactory<>("detail"));
        colSigGV.setCellValueFactory(new PropertyValueFactory<>("sig"));
        colDayGV.setCellFactory(TextFieldTableCell.forTableColumn());
        colDayGV.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setDay(t.getNewValue()));
        colDetailGV.setCellFactory(TextFieldTableCell.forTableColumn());
        colDetailGV.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setDetail(t.getNewValue()));
        colSigGV.setCellFactory(TextFieldTableCell.forTableColumn());
        colSigGV.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setSig(t.getNewValue()));
        btnSubmitGV.setOnAction(event -> {
            tbGuestVisitList.add(
                    new tbGuestVisit(
                            addColDayGV.getText(),
                            addColDetailGV.getText(),
                            addColSigGV.getText()
                    )
            );
            addColDayGV.clear();
            addColDetailGV.clear();
            addColSigGV.clear();
        });
        GuestVisit.setItems(tbGuestVisitList);

        //---------------Training History------------------//
        TrainingHistory.setEditable(true);
        colDayTH.setCellValueFactory(new PropertyValueFactory<>("day"));
        colDayTH.setCellFactory(TextFieldTableCell.forTableColumn());
        colDayTH.setOnEditCommit(t -> {
            t.getTableView().getItems().get(
                    t.getTablePosition().getRow()).setDay(t.getNewValue());
            System.out.print(t.getNewValue());
        });
        colWhatTH.setCellValueFactory(new PropertyValueFactory<>("what"));
        colWhatTH.setCellFactory(TextFieldTableCell.forTableColumn());
        colWhatTH.setOnEditCommit(t -> {
            t.getTableView().getItems().get(
                    t.getTablePosition().getRow()).setWhat(t.getNewValue());
            System.out.print(t.getNewValue());
        });
        colWhereTH.setCellValueFactory(new PropertyValueFactory<>("where"));
        colWhereTH.setCellFactory(TextFieldTableCell.forTableColumn());
        colWhereTH.setOnEditCommit(t -> {
            t.getTableView().getItems().get(
                    t.getTablePosition().getRow()).setWhere(t.getNewValue());
            System.out.print(t.getNewValue());
        });
        colWhoTH.setCellValueFactory(new PropertyValueFactory<>("who"));
        colWhoTH.setCellFactory(TextFieldTableCell.forTableColumn());
        colWhoTH.setOnEditCommit(t -> {
            t.getTableView().getItems().get(
                    t.getTablePosition().getRow()).setWho(t.getNewValue());
            System.out.print(t.getNewValue());
        });
        btnTH1.setOnAction(event -> {
            tbTrainingHistoryList.add(
                    new tbTrainingHistory(
                            addColDayTH.getText(),
                            addColWhatTH.getText(),
                            addColWhereTH.getText(),
                            addColWhoTH.getText()
                    )
            );
            addColDayTH.clear();
            addColWhatTH.clear();
            addColWhereTH.clear();
            addColWhoTH.clear();
        });

        TrainingHistory.setItems(tbTrainingHistoryList);

        //---------------Parricides Application--------------//
        PerticideApplication.setEditable(true);
        colDayPA.setCellValueFactory(new PropertyValueFactory<>("day"));
        colDayPA.setCellFactory(TextFieldTableCell.forTableColumn());
        colDayPA.setOnEditCommit(t -> {
            t.getTableView().getItems().get(
                    t.getTablePosition().getRow()).setDay(t.getNewValue());
            System.out.print(t.getNewValue());
        });
        colPerticidePA.setCellValueFactory(new PropertyValueFactory<>("perticide"));
        colPerticidePA.setCellFactory(TextFieldTableCell.forTableColumn());
        colPerticidePA.setOnEditCommit(t -> {
            t.getTableView().getItems().get(
                    t.getTablePosition().getRow()).setPerticide(t.getNewValue());
            System.out.print(t.getNewValue());
        });
        colChemPA.setCellValueFactory(new PropertyValueFactory<>("chem"));
        colChemPA.setCellFactory(TextFieldTableCell.forTableColumn());
        colChemPA.setOnEditCommit(t -> {
            t.getTableView().getItems().get(
                    t.getTablePosition().getRow()).setChem(t.getNewValue());
            System.out.print(t.getNewValue());
        });
        colRatePA.setCellValueFactory(new PropertyValueFactory<>("rate"));
        colRatePA.setCellFactory(TextFieldTableCell.forTableColumn());
        colRatePA.setOnEditCommit(t -> {
            t.getTableView().getItems().get(
                    t.getTablePosition().getRow()).setRate(t.getNewValue());
            System.out.print(t.getNewValue());
        });
        colAnnotationPA.setCellValueFactory(new PropertyValueFactory<>("anno"));
        colAnnotationPA.setCellFactory(TextFieldTableCell.forTableColumn());
        colAnnotationPA.setOnEditCommit(t -> {
            t.getTableView().getItems().get(
                    t.getTablePosition().getRow()).setAnno(t.getNewValue());
            System.out.print(t.getNewValue());
        });
        btnPA1.setOnAction(event -> {
            tbPerticicideApplicationList.add(
                    new tbPerticideApplication(
                            addColDayPA.getText(),
                            addColPerticidePA.getText(),
                            addColChemPA.getText(),
                            addColRatePA.getText(),
                            addColAnnoPA.getText()
                    )
            );
            addColDayPA.clear();
            addColPerticidePA.clear();
            addColChemPA.clear();
            addColRatePA.clear();
            addColAnnoPA.clear();
        });
        PerticideApplication.setItems(tbPerticicideApplicationList);


        //---------------Nutrient Deficiency---------------//
        NutrientDeficiency.setEditable(true);
        colDayND.setCellValueFactory(new PropertyValueFactory<>("day"));
        colDayND.setCellFactory(TextFieldTableCell.forTableColumn());
        colDayND.setOnEditCommit(t -> {
            t.getTableView().getItems().get(
                    t.getTablePosition().getRow()).setDay(t.getNewValue());
            System.out.print(t.getNewValue());
        });
        colSymptomND.setCellValueFactory(new PropertyValueFactory<>("symptom"));
        colSymptomND.setCellFactory(TextFieldTableCell.forTableColumn());
        colSymptomND.setOnEditCommit(t -> {
            t.getTableView().getItems().get(
                    t.getTablePosition().getRow()).setSymptom(t.getNewValue());
            System.out.print(t.getNewValue());
        });
        colRateND.setCellValueFactory(new PropertyValueFactory<>("rate"));
        colRateND.setCellFactory(param -> new RadioButtonCell<>(EnumSet.allOf(Rate.class)));
        colRateND.setOnEditCommit(
                t -> {
                    (t.getTableView().getItems().get(t.getTablePosition().getRow())).setRate(t.getNewValue());
                    System.out.print(t.getNewValue());
                }
        );
        btnND1.setOnAction(event -> {
            Rate temp = Rate.ปานกลาง;
            if (rb1.isSelected()) temp = Rate.น้อย;
            else if (rb2.isSelected()) temp = Rate.ปานกลาง;
            else if (rb3.isSelected()) temp = Rate.มาก;
            tbNutrientDeficiencyList.add(
                    new tbNutrientDeficiency(
                            addColDayND.getText(),
                            addColSymptomND.getText(),
                            temp,
                            addColAnnotationND.getText()
                    )
            );
            addColDayND.clear();
            addColSymptomND.clear();
            addColAnnotationND.clear();

        });
        colAnnotationND.setCellValueFactory(new PropertyValueFactory<>("annotation"));
        colAnnotationND.setCellFactory(TextFieldTableCell.forTableColumn());
        colAnnotationND.setOnEditCommit(t -> {
            t.getTableView().getItems().get(
                    t.getTablePosition().getRow()).setAnnotation(t.getNewValue());
            System.out.print(t.getNewValue());
        });
        NutrientDeficiency.setItems(tbNutrientDeficiencyList);


        //-------------------Fertilizer/soil conditioner------------------------------------//
        FertilizerCond.setEditable(true);
        colDayFC.setCellValueFactory(new PropertyValueFactory<>("day"));
        colDayFC.setCellFactory(TextFieldTableCell.forTableColumn());
        colDayFC.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setDay(t.getNewValue()));
        colSoilFC.setCellValueFactory(new PropertyValueFactory<>("soil"));
        colSoilFC.setCellFactory(TextFieldTableCell.forTableColumn());
        colSoilFC.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setSoil(t.getNewValue()));
        colRateFC.setCellValueFactory(new PropertyValueFactory<>("rate"));
        colRateFC.setCellFactory(TextFieldTableCell.forTableColumn(new StringConverter<Double>() {
            @Override
            public String toString(Double object) {
                return object.toString();
            }

            @Override
            public Double fromString(String string) {
                return Double.parseDouble(string);
            }
        }));
        colRateFC.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setRate(t.getNewValue()));
        colCostFC.setCellValueFactory(new PropertyValueFactory<>("cost"));
        colCostFC.setCellFactory(TextFieldTableCell.forTableColumn(new StringConverter<Double>() {
            @Override
            public String toString(Double object) {
                return object.toString();
            }

            @Override
            public Double fromString(String string) {
                return Double.parseDouble(string);
            }
        }));
        colCostFC.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setCost(t.getNewValue()));
        colSumFC.setCellValueFactory(new PropertyValueFactory<>("sum"));
        colSumFC.setCellFactory(TextFieldTableCell.forTableColumn(new StringConverter<Double>() {
            @Override
            public String toString(Double object) {
                return object.toString();
            }

            @Override
            public Double fromString(String string) {
                return Double.parseDouble(string);
            }
        }));
        colSumFC.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setSum(t.getNewValue()));
        colAnnoFC.setCellValueFactory(new PropertyValueFactory<>("anno"));
        colAnnoFC.setCellFactory(TextFieldTableCell.forTableColumn());
        colAnnoFC.setOnEditCommit(t -> t.getTableView().getItems().get(
                t.getTablePosition().getRow()).setAnno(t.getNewValue()));
        btnFC1.setOnAction(event -> {
            double a = Double.parseDouble(tfFC3.getText());
            double b = Double.parseDouble(tfFC4.getText());
            double td = a * b;
            System.out.printf("%f %f %f", a, b, td);
            DecimalFormat df = new DecimalFormat("#.00");
            df.format(td);
            System.out.printf("%f %f %f", a, b, td);
            tbFertilizerCondList.add(
                    new tbFertilizerCond(
                            tfFC1.getText(),
                            tfFC2.getText(),
                            a, b, td,
                            tfFC5.getText()
                    )
            );
            System.out.print("pass1");
            tfFC1.clear();
            tfFC2.clear();
            tfFC3.clear();
            tfFC4.clear();
            tfFC5.clear();
        });
        FertilizerCond.setItems(tbFertilizerCondList);

        //------------------------Manage--------------------------
        Management.setEditable(true);

        final TreeItem<tbManagement> rootMG = new TreeItem<>(new tbManagement("รายการ", "", "", "", "", ""));
        rootMG.setExpanded(true);
        final TreeItem<tbManagement> root1 = new TreeItem<>(new tbManagement("วัตถุดิบ", "", "", "", "", ""));
        root1.setExpanded(true);
        final TreeItem<tbManagement> root2 = new TreeItem<>(new tbManagement("ค่าแรง", "", "", "", "", ""));
        root2.setExpanded(true);
        final TreeItem<tbManagement> root3 = new TreeItem<>(new tbManagement("ค่าแรงครัวเรือน", "", "", "", "", ""));
        root3.setExpanded(true);
        final TreeItem<tbManagement> root4 = new TreeItem<>(new tbManagement("ค่าใช้จ่ายในการผลิต", "", "", "", "", ""));
        root4.setExpanded(true);


        MGC2.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
        MGC3.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
        MGC4.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
        MGC5.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());
        MGC6.setCellFactory(TextFieldTreeTableCell.forTreeTableColumn());

        MGC1.setCellValueFactory((TreeTableColumn.CellDataFeatures<tbManagement, String> p) ->
                new ReadOnlyStringWrapper(p.getValue().getValue().getC1()));
        MGC2.setCellValueFactory((TreeTableColumn.CellDataFeatures<tbManagement, String> p) ->
                new ReadOnlyStringWrapper(p.getValue().getValue().getC57()));
        MGC3.setCellValueFactory((TreeTableColumn.CellDataFeatures<tbManagement, String> p) ->
                new ReadOnlyStringWrapper(p.getValue().getValue().getC58()));
        MGC4.setCellValueFactory((TreeTableColumn.CellDataFeatures<tbManagement, String> p) ->
                new ReadOnlyStringWrapper(p.getValue().getValue().getC59()));
        MGC5.setCellValueFactory((TreeTableColumn.CellDataFeatures<tbManagement, String> p) ->
                new ReadOnlyStringWrapper(p.getValue().getValue().getC60()));
        MGC6.setCellValueFactory((TreeTableColumn.CellDataFeatures<tbManagement, String> p) ->
                new ReadOnlyStringWrapper(p.getValue().getValue().getC61()));
        MGC2.setOnEditCommit(event -> {
            final tbManagement item = event.getRowValue().getValue();
            System.out.println("Change Item " + item + " from " + event.getOldValue() + " to new value "
                    + event.getNewValue());
            item.setC57(event.getNewValue());
        });
        MGC3.setOnEditCommit(event -> {
            final tbManagement item = event.getRowValue().getValue();
            System.out.println("Change Item " + item + " from " + event.getOldValue() + " to new value "
                    + event.getNewValue());
            item.setC58(event.getNewValue());
        });
        MGC4.setOnEditCommit(event -> {
            final tbManagement item = event.getRowValue().getValue();
            System.out.println("Change Item " + item + " from " + event.getOldValue() + " to new value "
                    + event.getNewValue());
            item.setC59(event.getNewValue());
        });
        MGC5.setOnEditCommit(event -> {
            final tbManagement item = event.getRowValue().getValue();
            System.out.println("Change Item " + item + " from " + event.getOldValue() + " to new value "
                    + event.getNewValue());
            item.setC60(event.getNewValue());
        });
        MGC6.setOnEditCommit(event -> {
            final tbManagement item = event.getRowValue().getValue();
            System.out.println("Change Item " + item + " from " + event.getOldValue() + " to new value "
                    + event.getNewValue());
            item.setC61(event.getNewValue());
        });
        final TreeItem<tbManagement> rootIncome = new TreeItem<>(tbManagementList.get(0));
        for (int i = 1; i < 5; i++)
            root1.getChildren().add(new TreeItem<>(tbManagementList.get(i)));
        for (int i = 5; i < 11; i++)
            root2.getChildren().add(new TreeItem<>(tbManagementList.get(i)));
        for (int i = 11; i < 17; i++)
            root3.getChildren().add(new TreeItem<>(tbManagementList.get(i)));
        for (int i = 17; i < 23; i++)
            root4.getChildren().add(new TreeItem<>(tbManagementList.get(i)));
        final TreeItem<tbManagement> root5 = new TreeItem<>(tbManagementList.get(23));
        final TreeItem<tbManagement> root6 = new TreeItem<>(tbManagementList.get(24));
        final TreeItem<tbManagement> rootTun = new TreeItem<>(tbManagementList.get(25));
        final TreeItem<tbManagement> rootKamrai = new TreeItem<>(tbManagementList.get(26));
        Management.setShowRoot(true);
        Management.setRoot(rootMG);
        rootMG.getChildren().addAll(rootIncome, root1, root2, root3, root4, root5, root6, rootTun, rootKamrai);
    }

    private void popup_sav() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Status");
        alert.setHeaderText("Saved");
        alert.setContentText("ทำการเซฟไฟล์แล้ว\nชื่อไฟล์ของท่าน  " + file.getName());
        alert.show();
    }

}