package dataStruct;

import javafx.collections.FXCollections;

import javax.xml.bind.annotation.XmlAnyElement;
import java.util.List;

/**
 * Created by anukul on 12/15/15.
 */
public class WrapperForList<T> {

    private List<T> list = FXCollections.<T>observableArrayList();

    public WrapperForList() {
        list = FXCollections.<T>observableArrayList();
    }

    public WrapperForList(List<T> list) {
        this.list = list;
    }

    @XmlAnyElement(lax = true)
    public List<T> getItems() {
        return list;
    }
}
