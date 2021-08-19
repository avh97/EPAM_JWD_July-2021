package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.service.exception.MatrixServiceException;
import by.khaletski.task03.service.factory.ServiceFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MatrixAddServiceTest {

    @DataProvider(name = "dataProvider")
    public Object[][] createData() {
        return new Object[][]{{new Matrix(new int[][]{{5, 7, 3}, {7, 0, 1}, {8, 1, 2}}),
                new Matrix(new int[][]{{1, 3, 4}, {8, 2, 1}, {2, 1, 2}}),
                new int[][]{{6, 10, 7}, {15, 2, 2}, {10, 2, 4}}}};
    }

    @Test(dataProvider = "dataProvider")
    public void testMatrixAddService(Matrix p, Matrix q, int[][] expected) throws MatrixServiceException {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        int[][] actual = serviceFactory.getMatrixAddService().add(p, q).getElements();
        assertEquals(actual, expected);
    }
}
