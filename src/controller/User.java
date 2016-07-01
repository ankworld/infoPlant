package controller;

import dataStruct.*;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * Created by anukul on 12/12/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "USER")
public class User {

    @XmlAttribute
    int id;
    @XmlAttribute
    String group;
    @XmlElement
    private plotInfo listPlotInfo;
    @XmlElement
    private plotBG listPlotBG;
    @XmlElement
    private bleeding listBleeding;
    @XmlElement
    private Precipitation2 listPC2;
    @XmlElement
    private Manage2 listMG2;
    @XmlElement
    private SoilAndLeavesMeta listSALMeta;
    @XmlElementWrapper(name = "LIST_FC")
    @XmlElements({@XmlElement(name = "root", type = tbFertilizerCond.class)})
    private List<tbFertilizerCond> listFC;
    @XmlElementWrapper (name ="LIST_ND")
    @XmlElements({@XmlElement(name = "root", type = tbNutrientDeficiency.class)})
    private List<tbNutrientDeficiency> listND;
    @XmlElementWrapper (name ="LIST_TH")
    @XmlElements({@XmlElement(name = "root", type = tbTrainingHistory.class)})
    private List<tbTrainingHistory> listTH;
    @XmlElementWrapper (name ="LIST_GV")
    @XmlElements({@XmlElement(name = "root", type = tbGuestVisit.class)})
    private List<tbGuestVisit> listGV;
    @XmlElementWrapper (name ="LIST_PA")
    @XmlElements({@XmlElement(name = "root", type = tbPerticideApplication.class)})
    private List<tbPerticideApplication> listPA;
    @XmlElementWrapper (name ="LIST_FR")
    @XmlElements({@XmlElement(name = "root", type = tbFertilizerRec.class)})
    private List<tbFertilizerRec> listFR;
    @XmlElementWrapper (name ="LIST_PC")
    @XmlElements({@XmlElement(name = "root", type = tbPrecipitation.class)})
    private List<tbPrecipitation> listPC;
    @XmlElementWrapper (name ="LIST_Sla1")
    @XmlElements({@XmlElement(name = "root", type = tbSoilAndLeaves.class)})
    private List<tbSoilAndLeaves> listSLA1;
    @XmlElementWrapper (name ="LIST_Sla2")
    @XmlElements({@XmlElement(name = "root", type = tbSoilAndLeaves2.class)})
    private List<tbSoilAndLeaves2> listSLA2;
    @XmlElementWrapper (name ="LIST_Sla3")
    @XmlElements({@XmlElement(name = "root", type = tbSoilAndLeaves3.class)})
    private List<tbSoilAndLeaves3> listSLA3;
    @XmlElementWrapper (name ="LIST_SA")
    @XmlElements({@XmlElement(name = "root", type = tbSoilAnalysis.class)})
    private List<tbSoilAnalysis> listSA;
    @XmlElementWrapper (name ="LIST_MG")
    @XmlElements({@XmlElement(name = "root", type = tbManagement.class)})
    private List<tbManagement> listMG;
    @XmlElementWrapper (name = "LIST_MY")
    @XmlElements({@XmlElement(name = "root", type = tbMYield.class)})
    private List<tbMYield> listMY;
    @XmlElementWrapper (name = "LIST_Y")
    @XmlElements({@XmlElement(name = "root", type = tbYield.class)})
    private List<tbYield> listY;

    public User() {
    }


    List<tbNutrientDeficiency> getListND() {
        return listND;
    }

    void setListND(List<tbNutrientDeficiency> listND) {
        this.listND = listND;
    }

    plotInfo getListPlotInfo() {
        return listPlotInfo;
    }

    void setListPlotInfo(plotInfo listPlotInfo) {
        this.listPlotInfo = listPlotInfo;
    }

    plotBG getListPlotBG() {
        return listPlotBG;
    }

    void setListPlotBG(plotBG listPlotBG) {
        this.listPlotBG = listPlotBG;
    }

    bleeding getListBleeding() {
        return listBleeding;
    }

    void setListBleeding(bleeding listBleeding) {
        this.listBleeding = listBleeding;
    }


    List<tbFertilizerCond> getListFC() {
        return listFC;
    }

    void setListFC(List<tbFertilizerCond> listFC) {
        this.listFC = listFC;
    }

    List<tbTrainingHistory> getListTH() {
        return listTH;
    }

    void setListTH(List<tbTrainingHistory> listTH) {
        this.listTH = listTH;
    }

    List<tbGuestVisit> getListGV() {
        return listGV;
    }

    void setListGV(List<tbGuestVisit> listGV) {
        this.listGV = listGV;
    }

    List<tbPerticideApplication> getListPA() {
        return listPA;
    }

    void setListPA(List<tbPerticideApplication> listPA) {
        this.listPA = listPA;
    }

    List<tbFertilizerRec> getListFR() {
        return listFR;
    }

    void setListFR(List<tbFertilizerRec> listFR) {
        this.listFR = listFR;
    }

    List<tbPrecipitation> getListPC() {
        return listPC;
    }

    void setListPC(List<tbPrecipitation> listPC) {
        this.listPC = listPC;
    }

    Precipitation2 getListPC2() {
        return listPC2;
    }

    void setListPC2(Precipitation2 listPC2) {
        this.listPC2 = listPC2;
    }

    Manage2 getListMG2() {
        return listMG2;
    }

    void setListMG2(Manage2 listMG2) {
        this.listMG2 = listMG2;
    }

    List<tbSoilAndLeaves> getListSLA1() {
        return listSLA1;
    }

    void setListSLA1(List<tbSoilAndLeaves> listSLA1) {
        this.listSLA1 = listSLA1;
    }

    List<tbSoilAndLeaves2> getListSLA2() {
        return listSLA2;
    }

    void setListSLA2(List<tbSoilAndLeaves2> listSLA2) {
        this.listSLA2 = listSLA2;
    }

    List<tbSoilAndLeaves3> getListSLA3() {
        return listSLA3;
    }

    void setListSLA3(List<tbSoilAndLeaves3> listSLA3) {
        this.listSLA3 = listSLA3;
    }

    SoilAndLeavesMeta getListSALMeta() {
        return listSALMeta;
    }

    void setListSALMeta(SoilAndLeavesMeta listSALMeta) {
        this.listSALMeta = listSALMeta;
    }

    List<tbSoilAnalysis> getListSA() {
        return listSA;
    }

    void setListSA(List<tbSoilAnalysis> listSA) {
        this.listSA = listSA;
    }

    List<tbManagement> getListMG() {
        return listMG;
    }

    void setListMG(List<tbManagement> listMG) {
        this.listMG = listMG;
    }

    List<tbMYield> getListMY() {
        return listMY;
    }

    void setListMY(List<tbMYield> listMY) {
        this.listMY = listMY;
    }

    List<tbYield> getListY() {
        return listY;
    }

    void setListY(List<tbYield> listY) {
        this.listY = listY;
    }
}
