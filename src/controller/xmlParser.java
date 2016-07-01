package controller;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by anukul on 6/21/16.
 */
public class xmlParser {

     String[] titleParser(){

        String[] str = new String[0];
        int strSize = 0;
        try {
            File file = new File("comboList.xml");
            DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance()
                    .newDocumentBuilder();

            Document doc = dBuilder.parse(file);

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList n = doc.getChildNodes().item(0).getChildNodes();
            System.out.println("Size of NodeList = " + n.getLength());
            for (int i = 0; i < n.getLength(); i++) {
                if (n.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    strSize++;
                }
            }

            str = new String[strSize];

            for (int i = 0; i < n.getLength(); i++) {
                if (n.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    int j=0;
                    str[j] = n.item(i).getTextContent();
                    System.out.println("List at " + i + "is " + str[j]);
                    j++;
                }
            }

//            if (doc.hasChildNodes()) {
//
//                printNote(doc.getChildNodes());
//
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return str;
        
    }

    private static void printNote(NodeList nodeList) {

        for (int count = 0; count < nodeList.getLength(); count++) {

            Node tempNode = nodeList.item(count);

            // make sure it's element node.
            if (tempNode.getNodeType() == Node.ELEMENT_NODE) {

                // get node name and value
                System.out.println("\nNode Name =" + tempNode.getNodeName() + " [OPEN]");
                System.out.println("Node Value =" + tempNode.getTextContent());

                if (tempNode.hasAttributes()) {

                    // get attributes names and values
                    NamedNodeMap nodeMap = tempNode.getAttributes();

                    for (int i = 0; i < nodeMap.getLength(); i++) {

                        Node node = nodeMap.item(i);
                        System.out.println("attr name : " + node.getNodeName());
                        System.out.println("attr value : " + node.getNodeValue());

                    }

                }

                if (tempNode.hasChildNodes()) {

                    // loop again if has child nodes
                    printNote(tempNode.getChildNodes());

                }

                System.out.println("Node Name =" + tempNode.getNodeName() + " [CLOSE]");

            }

        }

    }



}
