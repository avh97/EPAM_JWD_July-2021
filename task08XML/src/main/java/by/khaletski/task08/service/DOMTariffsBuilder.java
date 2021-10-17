package by.khaletski.task08.service;

import by.khaletski.task08.entity.Tariff;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DOMTariffsBuilder implements Parsable {

    public List<Tariff> build(String pathname) throws ParserConfigurationException, SAXException, IOException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File(pathname));

        NodeList privateTariffNodeList = document.getElementsByTagName("privateTariff");
        NodeList commercialTariffNodeList = document.getElementsByTagName("commercialTariff");
        NodeList callPricesNodeList = document.getElementsByTagName("callPrices");
        NodeList parametersNodeList = document.getElementsByTagName("parameters");

        List<Tariff> privateTariffs = parseChild(privateTariffNodeList, callPricesNodeList, parametersNodeList);
        List<Tariff> commercialTariffs = parseChild(commercialTariffNodeList, callPricesNodeList, parametersNodeList);
        List<Tariff> allTariffs = new ArrayList<>();
        allTariffs.addAll(privateTariffs);
        allTariffs.addAll(commercialTariffs);
        return allTariffs;
    }

    public List<Tariff> parseChild(NodeList tariffNodeList, NodeList callPricesNodeList, NodeList parametersNodeList) {
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
        List<Tariff> tariffList = new ArrayList<>();

        while (i < tariffNodeList.getLength() - 1) {
            Tariff tariff = new Tariff();
            i++;
            Element element1 = (Element) tariffNodeList.item(i);

            id = element1.getAttribute("id");
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

            tariff.setId(id);
            tariff.setName(name);
            tariff.setPayroll(payroll);
            tariff.callPrices.setInsideNetwork(insideNetwork);
            tariff.callPrices.setOutsideNetwork(outsideNetwork);
            tariff.callPrices.setStationaryNetwork(stationaryNetwork);
            tariff.setTraffic(traffic);
            tariff.parameters.setFavouriteNumbers(favouriteNumbers);
            tariff.parameters.setTarificationType(tarificationType);
            tariff.parameters.setConnectionFee(connectionFee);
            tariffList.add(tariff);

        }
        return tariffList;
    }
}




