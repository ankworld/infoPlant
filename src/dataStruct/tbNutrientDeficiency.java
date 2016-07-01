package dataStruct;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by anukul on 12/7/15.
 */



public class tbNutrientDeficiency{

    public enum Rate {
        น้อย, ปานกลาง, มาก;

        public String toString() {
            return super.toString();
        }
    }


    private final SimpleStringProperty day = new SimpleStringProperty("");
    private final SimpleStringProperty symptom = new SimpleStringProperty("");
    private final SimpleObjectProperty<Object> rate = new SimpleObjectProperty<>() ;
    private final SimpleStringProperty annotation = new SimpleStringProperty("");

    public tbNutrientDeficiency(){
        this("","",null,"");
    }

    public tbNutrientDeficiency(String day,String symptom,Rate rate,String annotation){
        setDay(day);
        setSymptom(symptom);
        setRate(rate);
        setAnnotation(annotation);
    }

    public String getDay() {
        return day.get();
    }

    public void setDay(String sDay) {
        day.set(sDay);
    }

    public String getSymptom() {
        return symptom.get();
    }

    public void setSymptom(String sSymptom) {
        symptom.set(sSymptom);
    }

    public Rate getRate(){
        return (Rate) rate.getValue();
    }

    public void setRate(Rate sRate){
        rate.set(sRate);
    }

    public String getAnnotation(){
        return annotation.get();
    }

    public void setAnnotation(String sAnnotation){
        annotation.set(sAnnotation);
    }
}
