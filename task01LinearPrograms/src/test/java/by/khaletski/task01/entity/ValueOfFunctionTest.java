package by.khaletski.task01.entity;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ValueOfFunctionTest {

//    @DataProvider (name = "dataProvider")
//    public Object[][] createData() {
//        return new Object[][]{{0, 0, -3}};
//    }
//
// (dataProvider = "dataProvider")

    @Test
    public void testValueOfFunction() {
        ValueOfFunction value = new ValueOfFunction();
        double actual = value.getValueOfFunction(0,0);
        double expected = 3;
        Assert.assertEquals(actual, expected, 0.01);
    }
}