package by.khaletski.task03.service.factory;

import by.khaletski.task03.service.impl.*;

public class ServiceFactory {
    private static final ServiceFactory instance = new ServiceFactory();

    private final MatrixFillService matrixFillService = new MatrixFillService();
    private final MatrixMultiplicationService matrixMultiplicationService = new MatrixMultiplicationService();
    private final MatrixAdditionService matrixAdditionService = new MatrixAdditionService();
    private final MatrixSubtractionService matrixSubtractionService = new MatrixSubtractionService();
    private final MatrixTransposeService matrixTransposeService = new MatrixTransposeService();

    private final NumberArrayFillService numberArrayFillService = new NumberArrayFillService();
    private final BubbleSortingService bubbleSortingService = new BubbleSortingService();
    private final ShakerSortingService shakerSortingService = new ShakerSortingService();
    private final SelectionSortingService selectionSortingService = new SelectionSortingService();
    private final InsertionSortingService insertionSortingService = new InsertionSortingService();

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        return instance;
    }

    public MatrixFillService getMatrixFillService() {
        return matrixFillService;
    }

    public MatrixMultiplicationService getMatrixMultiplicationService() {
        return matrixMultiplicationService;
    }

    public MatrixAdditionService getMatrixAdditionService() {
        return matrixAdditionService;
    }

    public MatrixSubtractionService getMatrixSubtractionService() {
        return matrixSubtractionService;
    }

    public MatrixTransposeService getMatrixTransposeService() {
        return matrixTransposeService;
    }



    public NumberArrayFillService getNumberArrayFillService() {
        return numberArrayFillService;
    }

    public BubbleSortingService getBubbleSortingService() {
        return bubbleSortingService;
    }

    public ShakerSortingService getShakerSortingService() {
        return shakerSortingService;
    }

    public SelectionSortingService getSelectionSorterService() {
        return selectionSortingService;
    }

    public InsertionSortingService getInsertionSortingService() {
        return insertionSortingService;
    }

}
