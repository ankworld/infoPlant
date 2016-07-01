package dataStruct;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by anukul on 12/6/15.
 */
public class tbGuestVisit {

    private final SimpleStringProperty day = new SimpleStringProperty("");
    private final SimpleStringProperty detail = new SimpleStringProperty("");
    private final SimpleStringProperty sig = new SimpleStringProperty("");

    public tbGuestVisit(){
        this("","","");
    }

    public tbGuestVisit(String rday,String rdetail,String rsig){
        setDay(rday);
        setDetail(rdetail);
        setSig(rsig);
    }

    public String getDay() {
        return day.get();
    }

    public void setDay(String sDay) {
        day.set(sDay);
    }

    public String getDetail() {
        return detail.get();
    }

    public void setDetail(String sDetail) {
        detail.set(sDetail);
    }

    public String getSig() {
        return sig.get();
    }

    public void setSig(String sSig) {
        sig.set(sSig);
    }
}
