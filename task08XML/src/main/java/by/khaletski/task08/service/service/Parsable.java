package by.khaletski.task08.service.service;

import by.khaletski.task08.service.entity.Tariff;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;

public interface Parsable {
    List<Tariff> parse() throws ParserConfigurationException, SAXException, IOException, XMLStreamException;
}
