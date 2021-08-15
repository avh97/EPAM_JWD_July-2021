package by.khaletski.task03.service.factory;

import by.khaletski.task03.service.impl.*;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final MatrixFillService matrixFillService = new MatrixFillService();
    private final MatrixMultiplyService matrixMultiplyService = new MatrixMultiplyService();
    private final MatrixAddService matrixAddService = new MatrixAddService();
    private final MatrixSubtractService matrixSubtractService = new MatrixSubtractService();
    private final MatrixTransposeService matrixTransposeService = new MatrixTransposeService();

    private final NumberArrayFillService numberArrayFillService = new NumberArrayFillService();
    private final BubbleSortService bubbleSortService = new BubbleSortService();
    private final ShakerSortService shakerSortService = new ShakerSortService();
    private final SelectionSortService selectionSortService = new SelectionSortService();
    private final InsertionSortService insertionSortService = new InsertionSortService();
    private final ShellSortService shellSortService = new ShellSortService();
    private final MergeSortService mergeSortService = new MergeSortService();

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public MatrixFillService getMatrixFillService() {
        return matrixFillService;
    }

    public MatrixMultiplyService getMatrixMultiplyService() {
        return matrixMultiplyService;
    }

    public MatrixAddService getMatrixAddService() {
        return matrixAddService;
    }

    public MatrixSubtractService getMatrixSubtractService() {
        return matrixSubtractService;
    }

    public MatrixTransposeService getMatrixTransposeService() {
        return matrixTransposeService;
    }


    public NumberArrayFillService getNumberArrayFillService() {
        return numberArrayFillService;
    }

    public BubbleSortService getBubbleSortService() {
        return bubbleSortService;
    }

    public ShakerSortService getShakerSortService() {
        return shakerSortService;
    }

    public SelectionSortService getSelectionSortService() {
        return selectionSortService;
    }

    public InsertionSortService getInsertionSortService() {
        return insertionSortService;
    }

    public ShellSortService getShellSortService() {
        return shellSortService;
    }

    public MergeSortService getMergeSortService() {
        return mergeSortService;
    }
}
