package controller;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

/**
 * Created by anukul on 12/15/15.
 */
public class ReadXMLFile {

    UserWrapper loadedData;

    public  ReadXMLFile() throws JAXBException {
        StreamSource xml = new StreamSource("AllData.xml");
        JAXBContext jc = JAXBContext.newInstance(UserWrapper.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        loadedData = (UserWrapper) unmarshaller.unmarshal(xml);
    }

    public void searchPlotName(){
        Scanner scan = new Scanner(System.in);
        String search = scan.nextLine();
        for (User user : loadedData.userArrayList)
        {
            if (user.getListPlotInfo().getPlotName().contains(search))
                System.out.println(user.getListPlotInfo().getPlotName());
            else
                System.out.println("NOT FOUND");
        }
    }

    public void scanAllAge(){
        int a = 0,b = 0,c = 0,all = 0;
        for (User user : loadedData.userArrayList)
        {
            all++;
            if (user.getListPlotInfo().getPlotYear2().equals("4-8 ปี"))
                a++;
            else if (user.getListPlotInfo().getPlotYear2().equals("8-16 ปี"))
                b++;
            else if (user.getListPlotInfo().getPlotYear2().equals("16 ปีขึ้นไป"))
                c++;
            System.out.println(user.getListPlotInfo().getPlotYear1());
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(all);
    }


}
