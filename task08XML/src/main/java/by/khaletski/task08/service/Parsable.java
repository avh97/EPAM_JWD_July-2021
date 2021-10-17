package by.khaletski.task08.service;

import by.khaletski.task08.entity.Tariff;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;

public interface Parsable {
    List<Tariff> build(String pathName)
            throws ParserConfigurationException, SAXException, IOException, XMLStreamException;
}
