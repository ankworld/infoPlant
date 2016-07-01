package dataStruct;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by anukul on 12/12/15.
 */
public class tbFertilizerRec {

    private final SimpleStringProperty Year = new SimpleStringProperty("");
    private final SimpleStringProperty FertType = new SimpleStringProperty("");
    private final SimpleStringProperty M1 = new SimpleStringProperty("");
    private final SimpleStringProperty M2 = new SimpleStringProperty("");
    private final SimpleStringProperty M3 = new SimpleStringProperty("");
    private final SimpleStringProperty M4 = new SimpleStringProperty("");
    private final SimpleDoubleProperty A1 = new SimpleDoubleProperty(0);
    private final SimpleDoubleProperty A2 = new SimpleDoubleProperty(0);
    private final SimpleDoubleProperty A3 = new SimpleDoubleProperty(0);
    private final SimpleDoubleProperty A4 = new SimpleDoubleProperty(0);
    private final SimpleDoubleProperty sum = new SimpleDoubleProperty(0);

    public  tbFertilizerRec(){
        this("","","","","","",0,0,0,0,0);
    }

    public  tbFertilizerRec( String s, String s1, String s2, String s3, String s4, String s5, double D, double D1, double D2, double D3,double D4 ){
        setYear(s);
        setFertType(s1);
        setM1(s2);
        setM2(s3);
        setM3(s4);
        setM4(s5);
        setA1(D);
        setA2(D1);
        setA3(D2);
        setA4(D3);
        setSum(D4);
    }

    public String getYear(){
        return Year.get();
    }

    public void setYear(String s){
        Year.set(s);
    }

    public String getFertType(){
        return FertType.get();
    }

    public void setFertType(String s){
        FertType.set(s);
    }
    public String getM1(){
        return M1.get();
    }

    public void setM1(String s){
        M1.set(s);
    }
    public String getM2(){
        return M2.get();
    }

    public void setM2(String s){
        M2.set(s);
    }
    public String getM3(){
        return M3.get();
    }

    public void setM3(String s){
        M3.set(s);
    }
    public String getM4(){
        return M4.get();
    }

    public void setM4(String s){
        M4.set(s);
    }
    public double getA1(){
        return A1.get();
    }

    public void setA1(double s){
        A1.set(s);
    }
    public double getA2(){
        return A2.get();
    }

    public void setA2(double s){
        A2.set(s);
    }
    public double getA3(){
        return A3.get();
    }

    public void setA3(double s){
        A3.set(s);
    }

    public double getA4(){
        return A4.get();
    }

    public void setA4(double s){
        A4.set(s);
    }
    public Double getSum(){
        return sum.get();
    }

    public void setSum(Double s){
        sum.set(s);
    }
}
