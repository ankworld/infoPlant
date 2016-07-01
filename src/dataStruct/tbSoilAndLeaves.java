package dataStruct;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by anukul on 12/12/15.
 */
public class tbSoilAndLeaves {

    private final SimpleStringProperty N = new SimpleStringProperty("");
    private final SimpleStringProperty P= new SimpleStringProperty("");
    private final SimpleStringProperty K = new SimpleStringProperty("");
    private final SimpleStringProperty Mg = new SimpleStringProperty("");
    private final SimpleStringProperty Ca = new SimpleStringProperty("");
    private final SimpleStringProperty S = new SimpleStringProperty("");
    private final SimpleStringProperty B = new SimpleStringProperty("");
    private final SimpleStringProperty Mn = new SimpleStringProperty("");

    public  tbSoilAndLeaves(){
        this("","","","","","","","","");
    }

    public tbSoilAndLeaves(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9){
        setN(s1);
        setP(s2);
        setK(s3);
        setMg(s4);
        setCa(s5);
        setS(s6);
        setS(s7);
        setB(s8);
        setMn(s9);

    }

    public String getN() {
        return N.get();
    }

    public SimpleStringProperty nProperty() {
        return N;
    }

    public void setN( String n ) {
        this.N.set(n);
    }

    public String getP() {
        return P.get();
    }

    public SimpleStringProperty pProperty() {
        return P;
    }

    public void setP( String p ) {
        this.P.set(p);
    }

    public String getK() {
        return K.get();
    }

    public SimpleStringProperty kProperty() {
        return K;
    }

    public void setK( String k ) {
        this.K.set(k);
    }

    public String getMg() {
        return Mg.get();
    }

    public SimpleStringProperty mgProperty() {
        return Mg;
    }

    public void setMg( String mg ) {
        this.Mg.set(mg);
    }

    public String getCa() {
        return Ca.get();
    }

    public SimpleStringProperty caProperty() {
        return Ca;
    }

    public void setCa( String c ) {
        this.Ca.set(c);
    }

    public String getS() {
        return S.get();
    }

    public SimpleStringProperty sProperty() {
        return S;
    }

    public void setS( String s ) {
        this.S.set(s);
    }

    public String getB() {
        return B.get();
    }

    public SimpleStringProperty bProperty() {
        return B;
    }

    public void setB( String b ) {
        this.B.set(b);
    }

    public String getMn() {
        return Mn.get();
    }

    public SimpleStringProperty mnProperty() {
        return Mn;
    }

    public void setMn( String mn ) {
        this.Mn.set(mn);
    }
}
