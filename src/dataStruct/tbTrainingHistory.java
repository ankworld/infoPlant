package dataStruct;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by anukul on 12/7/15.
 */
public class tbTrainingHistory {

    private final SimpleStringProperty day = new SimpleStringProperty("");
    private final SimpleStringProperty what = new SimpleStringProperty("");
    private final SimpleStringProperty where = new SimpleStringProperty("");
    private final SimpleStringProperty who = new SimpleStringProperty("");

    public tbTrainingHistory(){
        this("","","","");
    }

    public tbTrainingHistory(String day,String what,String where,String who){
        setDay(day);
        setWhat(what);
        setWhere(where);
        setWho(who);
    }

    public String getDay() {
        return day.get();
    }

    public void setDay(String sDay) {
        day.set(sDay);
    }

    public String getWhat() {
        return what.get();
    }

    public void setWhat(String sWhat) {
        what.set(sWhat);
    }

    public String getWhere() {
        return where.get();
    }

    public void setWhere(String sWhere) {
        where.set(sWhere);
    }

    public String getWho(){
        return who.get();
    }

    public void setWho(String sWho){
        who.set(sWho);
    }
}
