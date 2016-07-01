package dataStruct;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by anukul on 12/12/15.
 */
public class tbManagement {

        private SimpleStringProperty C1 = new SimpleStringProperty("");

        private SimpleStringProperty C57 = new SimpleStringProperty("");
        private SimpleStringProperty C58 = new SimpleStringProperty("");
        private SimpleStringProperty C59 = new SimpleStringProperty("");
        private SimpleStringProperty C60 = new SimpleStringProperty("");
        private SimpleStringProperty C61 = new SimpleStringProperty("");

    public tbManagement (){
        this("","","","","","");
    }

    public tbManagement(String s, String s1,String s2,String s3,String s4,String s5){

        setC1(s);
        setC57(s1);
        setC58(s2);
        setC59(s3);
        setC60(s4);
        setC61(s5);
    }

    public String getC57() {
        return C57.get();
    }

    public SimpleStringProperty c57Property() {
        return C57;
    }

    public void setC57( String c57 ) {
        this.C57.set(c57);
    }

    public String getC58() {
        return C58.get();
    }

    public SimpleStringProperty c58Property() {
        return C58;
    }

    public void setC58( String c58 ) {
        this.C58.set(c58);
    }

    public String getC59() {
        return C59.get();
    }

    public SimpleStringProperty c59Property() {
        return C59;
    }

    public void setC59( String c59 ) {
        this.C59.set(c59);
    }

    public String getC60() {
        return C60.get();
    }

    public SimpleStringProperty c60Property() {
        return C60;
    }

    public void setC60( String c60 ) {
        this.C60.set(c60);
    }

    public String getC61() {
        return C61.get();
    }

    public SimpleStringProperty c61Property() {
        return C61;
    }

    public void setC61( String c61 ) {
        this.C61.set(c61);
    }

    public String getC1() {
        return C1.get();
    }

    public SimpleStringProperty c1Property() {
        return C1;
    }

    public void setC1( String c1 ) {
        this.C1.set(c1);
    }

}
