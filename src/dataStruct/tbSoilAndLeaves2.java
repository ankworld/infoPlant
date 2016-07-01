package dataStruct;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by anukul on 12/19/15.
 */
public class tbSoilAndLeaves2 {

    private SimpleStringProperty element = new SimpleStringProperty("");
    private SimpleStringProperty std = new SimpleStringProperty("");
    private SimpleStringProperty cal =  new SimpleStringProperty("");
    private SimpleStringProperty care = new SimpleStringProperty("");

    public tbSoilAndLeaves2(){
        this("","","","");
    }

    public tbSoilAndLeaves2(String s1,String s2 ,String s3,String s4){
        setElement(s1);
        setStd(s2);
        setCal(s3);
        setCare(s4);
    }


    public String getElement() {
        return element.get();
    }

    public SimpleStringProperty elementProperty() {
        return element;
    }

    public void setElement( String element ) {
        this.element.set(element);
    }

    public String getStd() {
        return std.get();
    }

    public SimpleStringProperty stdProperty() {
        return std;
    }

    public void setStd( String std ) {
        this.std.set(std);
    }

    public String getCal() {
        return cal.get();
    }

    public SimpleStringProperty calProperty() {
        return cal;
    }

    public void setCal( String cal ) {
        this.cal.set(cal);
    }

    public String getCare() {
        return care.get();
    }

    public SimpleStringProperty careProperty() {
        return care;
    }

    public void setCare( String care ) {
        this.care.set(care);
    }
}
