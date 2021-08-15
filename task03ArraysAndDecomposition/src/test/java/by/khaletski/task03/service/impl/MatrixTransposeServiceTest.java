package by.khaletski.task03.service.impl;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.exception.MatrixException;
import by.khaletski.task03.service.factory.ServiceFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MatrixTransposeServiceTest {

    @DataProvider(name = "dataProvider")
    public Object[][] createData() {
        return new Object[][]{{new Matrix(new int[][]{{5, 7, 3}, {7, 0, 1}, {8, 1, 2}}),
                new int[][]{{5, 7, 8}, {7, 0, 1}, {3, 1, 2}}}};
    }

    @Test(dataProvider = "dataProvider")
    public void testMatrixTransposeService(Matrix p, int[][] expected) throws MatrixException {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        int[][] actual = serviceFactory.getMatrixTransposeService().transpose(p).getElements();
        assertEquals(actual, expected);
    }
}
