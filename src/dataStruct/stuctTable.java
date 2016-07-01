package dataStruct;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Created by anukul on 12/18/15.
 */
public class stuctTable{

    private final SimpleIntegerProperty sid = new SimpleIntegerProperty();
    private final SimpleStringProperty sgroup = new SimpleStringProperty("");
    private final SimpleStringProperty spname = new SimpleStringProperty("");
    private final SimpleStringProperty soname = new SimpleStringProperty("");

    public stuctTable(){
        this(0,"","","");
    }

    public stuctTable(int sid,String sgroup,String spname,String soname){
        setSid(sid);
        setSgroup(sgroup);
        setSoname(soname);
        setSpname(spname);
    }

    public int getSid() {
        return sid.get();
    }

    public void setSid(int sDay) {
        sid.set(sDay);
    }

    public String getSpname() {
        return spname.get();
    }

    public void setSpname(String sDetail) {
        spname.set(sDetail);
    }

    public String getSoname() {
        return soname.get();
    }

    public void setSoname(String sSig) {
        soname.set(sSig);
    }

    public String getSgroup() {
        return sgroup.get();
    }

    public void setSgroup(String sSig) {
        sgroup.set(sSig);
    }
}