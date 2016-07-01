package dataStruct;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by anukul on 12/19/15.
 */
public class tbSoilAndLeaves3 {

    private SimpleStringProperty type= new SimpleStringProperty("");
    private SimpleStringProperty rate = new SimpleStringProperty("");
    private SimpleStringProperty round1 = new SimpleStringProperty("");
    private SimpleStringProperty round2 = new SimpleStringProperty("");
    private SimpleStringProperty round3 = new SimpleStringProperty("");
    private SimpleStringProperty Anno = new SimpleStringProperty("");

    public tbSoilAndLeaves3(){
        this("","","","","","");
    }

    public tbSoilAndLeaves3 (String s1,String s2,String s3,String s4,String s5,String s6){
        setType(s1);
        setRate(s2);
        setRound1(s3);
        setRound2(s4);
        setRound3(s5);
        setAnno(s6);

    }

    public String getType() {
        return type.get();
    }

    public SimpleStringProperty typeProperty() {
        return type;
    }

    public void setType( String type ) {
        this.type.set(type);
    }

    public String getRate() {
        return rate.get();
    }

    public SimpleStringProperty rateProperty() {
        return rate;
    }

    public void setRate( String rate ) {
        this.rate.set(rate);
    }

    public String getRound1() {
        return round1.get();
    }

    public SimpleStringProperty round1Property() {
        return round1;
    }

    public void setRound1( String round1 ) {
        this.round1.set(round1);
    }

    public String getRound2() {
        return round2.get();
    }

    public SimpleStringProperty round2Property() {
        return round2;
    }

    public void setRound2( String round2 ) {
        this.round2.set(round2);
    }

    public String getRound3() {
        return round3.get();
    }

    public SimpleStringProperty round3Property() {
        return round3;
    }

    public void setRound3( String round3 ) {
        this.round3.set(round3);
    }

    public String getAnno() {
        return Anno.get();
    }

    public SimpleStringProperty annoProperty() {
        return Anno;
    }

    public void setAnno( String anno ) {
        this.Anno.set(anno);
    }
}
