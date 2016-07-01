package controller;

import javafx.stage.FileChooser;
import javafx.stage.Stage;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by anukul on 2/9/16.
 */
class mergeData {

    private static Document merge(String expression, List<File> files) throws Exception {

        XPathFactory xPathFactory = XPathFactory.newInstance();
        XPath xpath = xPathFactory.newXPath();
        XPathExpression compiledExpression = xpath.compile(expression);
        return merge(compiledExpression, files);
    }

    private static Document merge(XPathExpression expression,
                                  List<File> files) throws Exception {
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        docBuilderFactory.setIgnoringElementContentWhitespace(true);
        DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
        Document base = docBuilder.parse(files.get(0));
        Node results = (Node) expression.evaluate(base,
                XPathConstants.NODE);
        if (results == null) {
            throw new IOException(files.get(0)
                    + ": expression does not evaluate to node");
        }

        for (int i = 1; i < files.size(); i++) {
            Document merge = docBuilder.parse(files.get(i));
            Node nextResults = (Node) expression.evaluate(merge,
                    XPathConstants.NODE);
            while (nextResults.hasChildNodes()) {
                Node kid = nextResults.getFirstChild();
                nextResults.removeChild(kid);
                kid = base.importNode(kid, true);
                results.appendChild(kid);
            }
        }

        return base;
    }

    private static void print(Document doc) throws Exception {
        FileChooser fcsave = new FileChooser();
        Stage stage = new Stage();
//       System.out.print("StartTranform");
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.METHOD, "html");
        DOMSource source = new DOMSource(doc);
        //StreamResult result_Con = new StreamResult(System.out);
        //transformer.transform(source, result_Con);
        StreamResult result = new StreamResult(fcsave.showSaveDialog(stage));
        transformer.transform(source, result);
        //NodeList nodeList = doc.getElementsByTagName("USER");
//        System.out.print("Fin");
//        System.out.print(nodeList.getLength());

    }

    void mergeFile() {
        Stage stage = new Stage();
        Document doc;
        final FileChooser fileChooser = new FileChooser();
        List<File> list = fileChooser.showOpenMultipleDialog(stage);

        if (list != null) {

            try {
                doc = merge("/userWrapper", list);
                print(doc);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}
