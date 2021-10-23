package by.khaletski.task08.service;

import by.khaletski.task08.entity.Tariff;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DOMTariffsBuilderTest {

    @Test
    public void testParse() {
        Parsable parser = new DOMTariffsBuilder();
        List<Tariff> tariffList = new ArrayList<>();
        try {
            tariffList = parser.build("src/main/resources/data/tariffs.xml");
        } catch (XMLStreamException | ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        int expected = 18;
        int actual = tariffList.size();
        Assert.assertEquals(actual, expected);
    }
}
