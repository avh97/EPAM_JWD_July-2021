package by.khaletski.task08.service;

import by.khaletski.task08.entity.Tariff;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SAXTariffsBuilder implements Parsable {

    public List<Tariff> build(String pathName) throws ParserConfigurationException, SAXException, IOException {
        SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
        TariffHandler tariffHandler = new TariffHandler();
        List<Tariff> tariffList;
        if (tariffHandler != null) {
            parser.parse(pathName, tariffHandler);
        }
        tariffList = tariffHandler.getNotes();
        return tariffList;
    }

    public class TariffHandler extends DefaultHandler {
        List<Tariff> tariffList = new ArrayList();
        Tariff currentTariff = new Tariff();
        int currentIndex = -1;

        public List getNotes() {
            return tariffList;
        }

        @Override
        public void startElement(String uri, String localName, String qName,
                                 Attributes attributes) {
            if (qName.equals("privateTariff") || qName.equals("commercialTariff")) {
                currentTariff = new Tariff();
                currentTariff.setId(attributes.getValue(0));
            }
            if (qName.equals("name"))
                currentIndex = 2;
            else if (qName.equals("payroll"))
                currentIndex = 3;
            else if (qName.equals("insideNetwork"))
                currentIndex = 4;
            else if (qName.equals("outsideNetwork"))
                currentIndex = 5;
            else if (qName.equals("stationaryNetwork"))
                currentIndex = 6;
            else if (qName.equals("traffic"))
                currentIndex = 7;
            else if (qName.equals("favouriteNumbers"))
                currentIndex = 8;
            else if (qName.equals("tarificationType"))
                currentIndex = 9;
            else if (qName.equals("connectionFee"))
                currentIndex = 10;
        }

        @Override
        public void endElement(String uri, String localName, String qName) {
            if (qName.equals("privateTariff") || qName.equals("commercialTariff"))
                tariffList.add(currentTariff);
        }

        @Override
        public void characters(char[] characters, int start, int length) {
            String string = new String(characters, start, length);
            try {
                switch (currentIndex) {
                    case 2:
                        currentTariff.setName(string);
                        break;
                    case 3:
                        currentTariff.setPayroll(Double.parseDouble(string));
                        break;
                    case 4:
                        currentTariff.callPrices.setInsideNetwork(Double.parseDouble(string));
                        break;
                    case 5:
                        currentTariff.callPrices.setOutsideNetwork(Double.parseDouble(string));
                        break;
                    case 6:
                        currentTariff.callPrices.setStationaryNetwork(Double.parseDouble(string));
                        break;
                    case 7:
                        currentTariff.setTraffic(Double.parseDouble(string));
                        break;
                    case 8:
                        currentTariff.parameters.setFavouriteNumbers(Integer.parseInt(string));
                        break;
                    case 9:
                        currentTariff.parameters.setTarificationType(string);
                        break;
                    case 10:
                        currentTariff.parameters.setConnectionFee(Double.parseDouble(string));
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            currentIndex = -1;
        }
    }
}
