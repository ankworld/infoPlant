package controller;

import dataStruct.Precipitation2;
import dataStruct.tbPrecipitation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.File;

/**
 * Created by anukul on 2/14/16.
 */
public class Copy {

    ObservableList<tbPrecipitation> CopyPC(File file){
        ObservableList<tbPrecipitation> LIST_PC = FXCollections.observableArrayList();

        if (file != null) {
            UserWrapper loadedData = null;
            JAXBContext jc;
            try {
                jc = JAXBContext.newInstance(UserWrapper.class);
                Unmarshaller unmarshaller = jc.createUnmarshaller();
                StreamSource xml = new StreamSource(file);
                loadedData = (UserWrapper) unmarshaller.unmarshal(xml);
            } catch (JAXBException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR,"You can't use this file\nPlease try again", ButtonType.CLOSE);
                alert.show();
            }
            if (loadedData != null) {
                LIST_PC.addAll(loadedData.userArrayList.get(0).getListPC());
            }
        }
        return LIST_PC;
    }

    Precipitation2 CopyPC2(File file) {
        Precipitation2 PC2 = new Precipitation2();
        if (file != null) {
            UserWrapper loadedData = null;
            JAXBContext jc;
            try {
                jc = JAXBContext.newInstance(UserWrapper.class);
                Unmarshaller unmarshaller = jc.createUnmarshaller();
                StreamSource xml = new StreamSource(file);
                loadedData = (UserWrapper) unmarshaller.unmarshal(xml);
            } catch (JAXBException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR, "You can't use this file\nPlease try again", ButtonType.CLOSE);
                alert.show();
            }

            assert loadedData != null;
            if(loadedData.userArrayList.get(0).getListPC2().getData57() == null)
                PC2.setData57("");
            else
                PC2.setData57(loadedData.userArrayList.get(0).getListPC2().getData57());

            if(loadedData.userArrayList.get(0).getListPC2().getData58() == null)
                PC2.setData58("");
            else
                PC2.setData58(loadedData.userArrayList.get(0).getListPC2().getData58());

            if(loadedData.userArrayList.get(0).getListPC2().getData59() == null)
                PC2.setData59("");
            else
                PC2.setData59(loadedData.userArrayList.get(0).getListPC2().getData59());

            if(loadedData.userArrayList.get(0).getListPC2().getData60() == null)
                PC2.setData60("");
            else
                PC2.setData60(loadedData.userArrayList.get(0).getListPC2().getData60());

            if(loadedData.userArrayList.get(0).getListPC2().getData61() == null)
                PC2.setData61("");
            else
                PC2.setData61(loadedData.userArrayList.get(0).getListPC2().getData61());

            if(loadedData.userArrayList.get(0).getListPC2().getDday57() == null)
                PC2.setDday57("");
            else
                PC2.setDday57(loadedData.userArrayList.get(0).getListPC2().getDday57());

            if(loadedData.userArrayList.get(0).getListPC2().getDday58() == null)
                PC2.setDday58("");
            else
                PC2.setDday58(loadedData.userArrayList.get(0).getListPC2().getDday58());

            if(loadedData.userArrayList.get(0).getListPC2().getDday59() == null)
                PC2.setDday59("");
            else
                PC2.setDday59(loadedData.userArrayList.get(0).getListPC2().getDday59());

            if(loadedData.userArrayList.get(0).getListPC2().getDday60() == null)
                PC2.setDday60("");
            else
                PC2.setDday60(loadedData.userArrayList.get(0).getListPC2().getDday60());

            if(loadedData.userArrayList.get(0).getListPC2().getDday61() == null)
                PC2.setDday61("");
            else
                PC2.setDday61(loadedData.userArrayList.get(0).getListPC2().getDday61());

        }
        return PC2;
    }
}
