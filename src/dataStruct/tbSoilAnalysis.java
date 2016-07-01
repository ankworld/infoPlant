package dataStruct;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by anukul on 12/12/15.
 */
public class tbSoilAnalysis {

    private SimpleStringProperty col1 = new SimpleStringProperty();
    private SimpleStringProperty col2 = new SimpleStringProperty();
    private SimpleStringProperty col3 = new SimpleStringProperty();
    private SimpleStringProperty col4 = new SimpleStringProperty();
    private SimpleStringProperty col5 = new SimpleStringProperty();
    private SimpleStringProperty col6 = new SimpleStringProperty();
    private SimpleStringProperty col7 = new SimpleStringProperty();
    private SimpleStringProperty col8 = new SimpleStringProperty();
    private SimpleStringProperty col9 = new SimpleStringProperty();
    private SimpleStringProperty col10 = new SimpleStringProperty();
    private SimpleStringProperty col11 = new SimpleStringProperty();
    private SimpleStringProperty col12 = new SimpleStringProperty();
    private SimpleStringProperty col13 = new SimpleStringProperty();
    private SimpleStringProperty col14 = new SimpleStringProperty();
    private SimpleStringProperty col15 = new SimpleStringProperty();

    public tbSoilAnalysis(){
        this("","","","","","","","","","","","","","","");
    }

    public tbSoilAnalysis(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10,String s11,String s12,String s13,String s14,String s15){
        setCol1(s1);
        setCol2(s2);
        setCol3(s3);
        setCol4(s4);
        setCol5(s5);
        setCol6(s6);
        setCol7(s7);
        setCol8(s8);
        setCol9(s9);
        setCol10(s10);
        setCol11(s11);
        setCol12(s12);
        setCol13(s13);
        setCol14(s14);
        setCol15(s15);
    }

    public String getCol1() {
        return col1.get();
    }

    public SimpleStringProperty col1Property() {
        return col1;
    }

    public void setCol1( String col1 ) {
        this.col1.set(col1);
    }

    public String getCol2() {
        return col2.get();
    }

    public SimpleStringProperty col2Property() {
        return col2;
    }

    public void setCol2( String col2 ) {
        this.col2.set(col2);
    }

    public String getCol3() {
        return col3.get();
    }

    public SimpleStringProperty col3Property() {
        return col3;
    }

    public void setCol3( String col3 ) {
        this.col3.set(col3);
    }

    public String getCol4() {
        return col4.get();
    }

    public SimpleStringProperty col4Property() {
        return col4;
    }

    public void setCol4( String col4 ) {
        this.col4.set(col4);
    }

    public String getCol5() {
        return col5.get();
    }

    public SimpleStringProperty col5Property() {
        return col5;
    }

    public void setCol5( String col5 ) {
        this.col5.set(col5);
    }

    public String getCol6() {
        return col6.get();
    }

    public SimpleStringProperty col6Property() {
        return col6;
    }

    public void setCol6( String col6 ) {
        this.col6.set(col6);
    }

    public String getCol7() {
        return col7.get();
    }

    public SimpleStringProperty col7Property() {
        return col7;
    }

    public void setCol7( String col7 ) {
        this.col7.set(col7);
    }

    public String getCol8() {
        return col8.get();
    }

    public SimpleStringProperty col8Property() {
        return col8;
    }

    public void setCol8( String col8 ) {
        this.col8.set(col8);
    }

    public String getCol9() {
        return col9.get();
    }

    public SimpleStringProperty col9Property() {
        return col9;
    }

    public void setCol9( String col9 ) {
        this.col9.set(col9);
    }

    public String getCol10() {
        return col10.get();
    }

    public SimpleStringProperty col10Property() {
        return col10;
    }

    public void setCol10( String col10 ) {
        this.col10.set(col10);
    }

    public String getCol11() {
        return col11.get();
    }

    public SimpleStringProperty col11Property() {
        return col11;
    }

    public void setCol11( String col11 ) {
        this.col11.set(col11);
    }

    public String getCol12() {
        return col12.get();
    }

    public SimpleStringProperty col12Property() {
        return col12;
    }

    public void setCol12( String col12 ) {
        this.col12.set(col12);
    }

    public String getCol13() {
        return col13.get();
    }

    public SimpleStringProperty col13Property() {
        return col13;
    }

    public void setCol13( String col13 ) {
        this.col13.set(col13);
    }

    public String getCol14() {
        return col14.get();
    }

    public SimpleStringProperty col14Property() {
        return col14;
    }

    public void setCol14( String col14 ) {
        this.col14.set(col14);
    }

    public String getCol15() {
        return col15.get();
    }

    public SimpleStringProperty col15Property() {
        return col15;
    }

    public void setCol15( String col15 ) {
        this.col15.set(col15);
    }
}
