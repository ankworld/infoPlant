package dataStruct;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by anukul on 12/7/15.
 */
@XmlRootElement(name="root")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class tbFertilizerCond {

    private final SimpleStringProperty day = new SimpleStringProperty("");
    private final SimpleStringProperty soil = new SimpleStringProperty("");
    private final SimpleDoubleProperty rate = new SimpleDoubleProperty();
    private final SimpleDoubleProperty cost = new SimpleDoubleProperty();
    private final SimpleDoubleProperty sum = new SimpleDoubleProperty();
    private final SimpleStringProperty Anno = new SimpleStringProperty("");

    public tbFertilizerCond() {
        this("","",0,0,0,"");
    }

    public tbFertilizerCond(String day,String soil,double rate,double cost,double sum,String Anno){
        setDay(day);
        setSoil(soil);
        setRate(rate);
        setCost(cost);
        setSum(sum);
        setAnno(Anno);
    }

    public String getDay() {
        return day.get();
    }
    //@XmlElement
    public void setDay(String sDay) {
        day.set(sDay);
    }

    public String getSoil() {
        return soil.get();
    }
    //@XmlElement
    public void setSoil(String sSoil) {
        soil.set(sSoil);
    }

    public double getRate() {
        return rate.get();
    }
    //@XmlElement
    public void setRate(double sRate) {
        rate.set(sRate);
    }

    public double getCost(){
        return cost.get();
    }
    //@XmlElement
    public void setCost(double sCost){
        cost.set(sCost);
    }

    public double getSum(){
        return sum.get();
    }
    //@XmlElement
    public void setSum(double sSum){
        sum.set(sSum);
    }

    public String getAnno() {
        return Anno.get();
    }
    //@XmlElement
    public void setAnno(String anno) {
        Anno.set(anno);
    }
}
