package dataStruct;

import javafx.beans.property.SimpleStringProperty;

/**
 * Created by anukul on 12/7/15.
 */
public class tbYield {

    private final SimpleStringProperty date = new SimpleStringProperty("");
    private final SimpleStringProperty bunchWeight = new SimpleStringProperty("");
    private final SimpleStringProperty bunchCost = new SimpleStringProperty("");
    private final SimpleStringProperty bunchSum = new SimpleStringProperty("");
    private final SimpleStringProperty productWeight = new SimpleStringProperty("");
    private final SimpleStringProperty productCost = new SimpleStringProperty("");
    private final SimpleStringProperty productSum = new SimpleStringProperty("");
    private final SimpleStringProperty sumWeight = new SimpleStringProperty("");
    private final SimpleStringProperty sumCost = new SimpleStringProperty("");

    public tbYield(){
        this("","","","","","","","","");
    }

    public tbYield(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9){

        setDate(s1);
        setBunchWeight(s2);
        setBunchCost(s3);
        setBunchSum(s4);
        setProductWeight(s5);
        setProductCost(s6);
        setProductSum(s7);
        setSumWeight(s8);
        setSumCost(s9);

    }


    public String getDate() {
        return date.get();
    }

    public void setDate(String date) {
        this.date.set(date);
    }

    public String getBunchWeight() {
        return bunchWeight.get();
    }

    public void setBunchWeight(String bunchWeight) {
        this.bunchWeight.set(bunchWeight);
    }

    public String getBunchCost() {
        return bunchCost.get();
    }

    public void setBunchCost(String bunchCost) {
        this.bunchCost.set(bunchCost);
    }

    public String getBunchSum() {
        return bunchSum.get();
    }

    public void setBunchSum(String bunchSum) {
        this.bunchSum.set(bunchSum);
    }

    public String getProductWeight() {
        return productWeight.get();
    }

    public void setProductWeight(String productWeight) {
        this.productWeight.set(productWeight);
    }

    public String getProductCost() {
        return productCost.get();
    }

    public void setProductCost(String productCost) {
        this.productCost.set(productCost);
    }

    public String getProductSum() {
        return productSum.get();
    }

    public void setProductSum(String productSum) {
        this.productSum.set(productSum);
    }

    public String getSumWeight() {
        return sumWeight.get();
    }

    public void setSumWeight(String sumWeight) {
        this.sumWeight.set(sumWeight);
    }

    public String getSumCost() {
        return sumCost.get();
    }

    public void setSumCost(String sumCost) {
        this.sumCost.set(sumCost);
    }
}
