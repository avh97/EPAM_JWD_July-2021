package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.NumberArray;
import by.khaletski.task03.entity.exception.NumberArrayException;
import by.khaletski.task03.service.factory.ServiceFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BubbleSortServiceTest {

    @DataProvider(name = "dataProvider")
    public Object[][] createData() {
        return new Object[][]{{new NumberArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}),
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}},
                {new NumberArray(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}),
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}},
                {new NumberArray(new int[]{1, 8, 9, 3, 2, 7, 5, 6, 4, 10}),
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}},
                {new NumberArray(new int[]{10, 25, 333, 3, 12, 12, 12, 5, 5, 99}),
                        new int[]{3, 5, 5, 10, 12, 12, 12, 25, 99, 333}},
                {new NumberArray(new int[]{-5, 12, 3, 55, -55, 55, 66, 3, 8, 9}),
                        new int[]{-55, -5, 3, 3, 8, 9, 12, 55, 55, 66}}};
    }

    @Test(dataProvider = "dataProvider")
    public void testBubbleSortService(NumberArray array, int[] expected) throws NumberArrayException {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        int[] actual = serviceFactory.getBubbleSortService().bubbleSort(array).getArray();
        assertEquals(actual, expected);
    }
}
