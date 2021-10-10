package by.khaletski.task08.service.view;

import by.khaletski.task08.service.service.ParserDOM;
import by.khaletski.task08.service.service.ParserSAX;
import by.khaletski.task08.service.service.ParserStAX;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ParserDOM parserDOM = new ParserDOM();
        try {
            parserDOM.parse();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ParserSAX parserSAX = new ParserSAX();
        try {
            parserSAX.parse();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ParserStAX parserStAX = new ParserStAX();
        try {
            parserStAX.parse();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
