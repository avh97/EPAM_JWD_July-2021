package by.khaletski.task08.service;

import by.khaletski.task08.service.entity.Tariff;
import by.khaletski.task08.service.service.Parsable;
import by.khaletski.task08.service.service.parser.DOMParserService;
import by.khaletski.task08.service.service.parser.SAXParserService;
import by.khaletski.task08.service.service.parser.StAXParserService;
import org.xml.sax.SAXException;

import javax.swing.text.TabableView;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Parsable dom = new DOMParserService();
        Parsable sax = new SAXParserService();
        Parsable stax = new StAXParserService();

        List<Tariff> saxList = new ArrayList<>();
        List<Tariff> staxList = new ArrayList<>();
        List<Tariff> domList = new ArrayList<>();

        try {
            saxList = dom.parse();
            staxList = stax.parse();
            domList = dom.parse();
        } catch (ParserConfigurationException | SAXException | IOException | XMLStreamException e) {
            e.printStackTrace();
        }

    }
}
