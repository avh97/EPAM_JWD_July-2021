package by.khaletski.task08.service.service;

import by.khaletski.task08.service.entity.Tariff;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ParserStAX {
    public void parse() throws FileNotFoundException, XMLStreamException {
        ArrayList<Tariff> tariffSet = new ArrayList<>();
        Tariff currentTariff = new Tariff();
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        XMLEventReader reader = inputFactory.createXMLEventReader(
                new FileInputStream("src/main/resources/data/tariffs.xml"));
        while (reader.hasNext()) {
            XMLEvent event = reader.nextEvent();
            if (event.isStartElement()) {
                StartElement startElement = event.asStartElement();
                if (startElement.getName().getLocalPart().equals("tariff")) {
                    currentTariff = new Tariff();
                    Attribute id = startElement.getAttributeByName(new QName("id"));
                    currentTariff.setId(id.getValue());
                } else if (startElement.getName().getLocalPart().equals("name")) {
                    event = reader.nextEvent();
                    currentTariff.setName(event.asCharacters().getData());
                } else if (startElement.getName().getLocalPart().equals("payroll")) {
                    event = reader.nextEvent();
                    currentTariff.setPayroll(Double.parseDouble(event.asCharacters().getData()));
                } else if (event.isStartElement()) {
                    if (startElement.getName().getLocalPart().equals("insideNetwork")) {
                        event = reader.nextEvent();
                        currentTariff.callPrices
                                .setInsideNetwork(Double.parseDouble(event.asCharacters().getData()));
                    } else if (startElement.getName().getLocalPart().equals("outsideNetwork")) {
                        event = reader.nextEvent();
                        currentTariff.callPrices
                                .setOutsideNetwork(Double.parseDouble(event.asCharacters().getData()));
                    } else if (startElement.getName().getLocalPart().equals("stationaryNetwork")) {
                        event = reader.nextEvent();
                        currentTariff.callPrices
                                .setStationaryNetwork(Double.parseDouble(event.asCharacters().getData()));
                    }
                }
                if (startElement.getName().getLocalPart().equals("traffic")) {
                    event = reader.nextEvent();
                    currentTariff.setTraffic(Double.parseDouble(event.asCharacters().getData()));
                } else if (event.isStartElement()) {
                    if (startElement.getName().getLocalPart().equals("favouriteNumbers")) {
                        event = reader.nextEvent();
                        currentTariff.parameters
                                .setFavouriteNumbers(Integer.parseInt(event.asCharacters().getData()));
                    } else if (startElement.getName().getLocalPart().equals("tarificationType")) {
                        event = reader.nextEvent();
                        currentTariff.parameters
                                .setTarificationType(event.asCharacters().getData());
                    } else if (startElement.getName().getLocalPart().equals("connectionFee")) {
                        event = reader.nextEvent();
                        currentTariff.parameters
                                .setConnectionFee(Double.parseDouble(event.asCharacters().getData()));
                    }
                }
            }
            if (event.isEndElement()) {
                EndElement endElement = event.asEndElement();
                if (endElement.getName().getLocalPart().equals("tariff")) {
                    tariffSet.add(currentTariff);
                }
            }
        }
        for (int i = 0; i < tariffSet.size(); i++) {
            System.out.println(tariffSet.get(i));
        }
    }
}