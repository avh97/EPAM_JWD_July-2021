package by.khaletski.task08.service.service;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ParserDOM {
    public void parse() throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("src/main/resources/data/tariffs.xml"));

        NodeList tariffNodeList = document.getElementsByTagName("tariff");
        NodeList callPricesNodeList = document.getElementsByTagName("callPrices");
        NodeList parametersNodeList = document.getElementsByTagName("parameters");

        String id = "";
        String name = "";
        String tarificationType = "";
        double payroll = 0;
        double insideNetwork = 0;
        double outsideNetwork = 0;
        double stationaryNetwork = 0;
        double traffic = 0;
        int favouriteNumbers = 0;
        double connectionFee = 0;
        int i = -1;
        int j = -1;
        int k = -1;

        while (i < tariffNodeList.getLength() - 1) {
            i++;
            Element element1 = (Element) tariffNodeList.item(i);

            name = element1
                    .getElementsByTagName("name").item(0)
                    .getChildNodes().item(0).getNodeValue();
            payroll = Double.parseDouble(element1
                    .getElementsByTagName("payroll")
                    .item(0).getChildNodes().item(0).getNodeValue());
            traffic = Double.parseDouble(element1
                    .getElementsByTagName("traffic")
                    .item(0).getChildNodes().item(0).getNodeValue());

            if (j < callPricesNodeList.getLength()) {
                j++;
                Element element2 = (Element) callPricesNodeList.item(j);

                insideNetwork = Double.parseDouble(element2
                        .getElementsByTagName("insideNetwork")
                        .item(0).getChildNodes().item(0).getNodeValue());
                outsideNetwork = Double.parseDouble(element2
                        .getElementsByTagName("outsideNetwork")
                        .item(0).getChildNodes().item(0).getNodeValue());
                stationaryNetwork = Double.parseDouble(element2
                        .getElementsByTagName("stationaryNetwork")
                        .item(0).getChildNodes().item(0).getNodeValue());
            }

            if (k < parametersNodeList.getLength()) {
                k++;
                Element element3 = (Element) parametersNodeList.item(k);

                favouriteNumbers = Integer.parseInt(element3
                        .getElementsByTagName("favouriteNumbers")
                        .item(0).getChildNodes().item(0).getNodeValue());
                tarificationType = element3
                        .getElementsByTagName("tarificationType")
                        .item(0).getChildNodes().item(0).getNodeValue();
                connectionFee = Double.parseDouble(element3
                        .getElementsByTagName("connectionFee")
                        .item(0).getChildNodes().item(0).getNodeValue());

            }
            System.out.println("\nid: " + id
                    + "\nname: " + name
                    + "\npayroll: " + payroll
                    + "\ncallPrices: "
                    + "\n\tinsideNetwork: " + insideNetwork
                    + "\n\toutsideNetwork: " + outsideNetwork
                    + "\n\tstationaryNetwork: " + stationaryNetwork
                    + "\ntraffic: " + traffic
                    + "\nparameters: "
                    + "\n\tfavouriteNumbers: " + favouriteNumbers
                    + "\n\ttarificationType: " + tarificationType
                    + "\n\tconnectionFee: " + connectionFee);
        }
    }
}




