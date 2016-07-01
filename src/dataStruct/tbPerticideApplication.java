package dataStruct;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by anukul on 12/7/15.
 */
public class tbPerticideApplication {

    private final SimpleStringProperty day = new SimpleStringProperty("");
    private final SimpleStringProperty perticide = new SimpleStringProperty("");
    private final SimpleStringProperty chem = new SimpleStringProperty("");
    private final SimpleStringProperty rate = new SimpleStringProperty("");
    private final SimpleStringProperty anno = new SimpleStringProperty("");

    public tbPerticideApplication() {
        this("","","","","");
    }

    public tbPerticideApplication(String day,String perticide,String chem,String rate,String anno){
        setDay(day);
        setPerticide(perticide);
        setChem(chem);
        setRate(rate);
        setAnno(anno);
    }

    public String getDay() {
        return day.get();
    }

    public void setDay(String sDay) {
        day.set(sDay);
    }

    public String getPerticide() {
        return perticide.get();
    }

    public void setPerticide(String sPerticide) {
        perticide.set(sPerticide);
    }

    public String getChem() {
        return chem.get();
    }

    public void setChem(String sChem) {
        chem.set(sChem);
    }

    public String getRate(){
        return rate.get();
    }

    public void setRate(String sRate){
        rate.set(sRate);
    }

    public String getAnno(){
        return anno.get();
    }

    public void setAnno(String sAnno){
        anno.set(sAnno);
    }
}
