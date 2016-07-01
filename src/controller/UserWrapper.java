package controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by anukul on 12/18/15.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
class UserWrapper {

    @XmlElement(name = "USER" , type = User.class)
    ArrayList<User> userArrayList = new ArrayList<>();

}
