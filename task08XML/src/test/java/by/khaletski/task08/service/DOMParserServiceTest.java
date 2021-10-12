package by.khaletski.task08.service;

import by.khaletski.task08.service.entity.Tariff;
import by.khaletski.task08.service.service.Parsable;
import by.khaletski.task08.service.service.parser.DOMParserService;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DOMParserServiceTest {

    @Test
    public void testParse() {
        Parsable parser = new DOMParserService();
        List<Tariff> tariffList = new ArrayList<>();
        try {
            tariffList = parser.parse();
        } catch (XMLStreamException | ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        int expected = 18;
        int actual = tariffList.size();
        Assert.assertEquals(actual, expected);
    }
}
