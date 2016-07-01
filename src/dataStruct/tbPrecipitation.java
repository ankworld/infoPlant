package dataStruct;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by anukul on 12/12/15.
 */
public class tbPrecipitation {

    private final SimpleStringProperty month = new SimpleStringProperty("");
    private final SimpleStringProperty volume57 = new SimpleStringProperty("");
    private final SimpleStringProperty aday57 = new SimpleStringProperty("");
    private final SimpleStringProperty volume58 = new SimpleStringProperty("");
    private final SimpleStringProperty aday58 = new SimpleStringProperty("");
    private final SimpleStringProperty volume59 = new SimpleStringProperty("");
    private final SimpleStringProperty aday59 = new SimpleStringProperty("");
    private final SimpleStringProperty volume60 = new SimpleStringProperty("");
    private final SimpleStringProperty aday60 = new SimpleStringProperty("");
    private final SimpleStringProperty volume61 = new SimpleStringProperty("");
    private final SimpleStringProperty aday61 = new SimpleStringProperty("");

    public tbPrecipitation() {
        this("", "", "", "", "", "", "", "", "", "", "");
    }

    public tbPrecipitation( String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9, String s10 ) {
        setMonth(s);
        setVolume57(s1);
        setAday57(s2);
        setVolume58(s3);
        setAday58(s4);
        setVolume59(s5);
        setAday59(s6);
        setVolume60(s7);
        setAday60(s8);
        setVolume61(s9);
        setAday61(s10);
    }


    public String getMonth() {
        return month.get();
    }

    public void setMonth( String s ) {
        month.set(s);
    }

    public String getVolume57() {
        return volume57.get();
    }

    public void setVolume57( String s ) {
        volume57.set(s);
    }

    public String getAday57() {
        return aday57.get();
    }

    public void setAday57( String s ) {
        aday57.set(s);
    }

    public String getVolume58() {
        return volume58.get();
    }

    public void setVolume58( String s ) {
        volume58.set(s);
    }

    public String getAday58() {
        return aday58.get();
    }

    public void setAday58( String s ) {
        aday58.set(s);
    }

    public String getVolume59() {
        return volume59.get();
    }

    public void setVolume59( String s ) {
        volume59.set(s);
    }

    public String getAday59() {
        return aday59.get();
    }

    public void setAday59( String s ) {
        aday59.set(s);
    }

    public String getVolume60() {
        return volume60.get();
    }

    public void setVolume60( String s ) {
        volume60.set(s);
    }

    public String getAday60() {
        return aday60.get();
    }

    public void setAday60( String s ) {
        aday60.set(s);
    }

    public String getVolume61() {
        return volume61.get();
    }

    public void setVolume61( String s ) {
        volume61.set(s);
    }

    public String getAday61() {
        return aday61.get();
    }

    public void setAday61( String s ) {
        aday61.set(s);
    }

}