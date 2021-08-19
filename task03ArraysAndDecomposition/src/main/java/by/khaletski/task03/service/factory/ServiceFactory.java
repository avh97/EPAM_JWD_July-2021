package by.khaletski.task03.service.factory;

import by.khaletski.task03.service.impl.BubbleSortService;
import by.khaletski.task03.service.impl.InsertionSortService;
import by.khaletski.task03.service.impl.MatrixAddService;
import by.khaletski.task03.service.impl.MatrixMultiplyService;
import by.khaletski.task03.service.impl.MatrixSubtractService;
import by.khaletski.task03.service.impl.MatrixTransposeService;
import by.khaletski.task03.service.impl.MergeSortService;
import by.khaletski.task03.service.impl.SelectionSortService;
import by.khaletski.task03.service.impl.CocktailSortService;
import by.khaletski.task03.service.impl.ShellSortService;

public final class ServiceFactory {
    private static final ServiceFactory INSTANCE = new ServiceFactory();

    private final MatrixMultiplyService matrixMultiplyService = new MatrixMultiplyService();
    private final MatrixAddService matrixAddService = new MatrixAddService();
    private final MatrixSubtractService matrixSubtractService = new MatrixSubtractService();
    private final MatrixTransposeService matrixTransposeService = new MatrixTransposeService();
    private final BubbleSortService bubbleSortService = new BubbleSortService();
    private final CocktailSortService cocktailSortService = new CocktailSortService();
    private final SelectionSortService selectionSortService = new SelectionSortService();
    private final InsertionSortService insertionSortService = new InsertionSortService();
    private final ShellSortService shellSortService = new ShellSortService();
    private final MergeSortService mergeSortService = new MergeSortService();

    private ServiceFactory() {

    }

    public static ServiceFactory getInstance() {
        return INSTANCE;
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

    public BubbleSortService getBubbleSortService() {
        return bubbleSortService;
    }

    public CocktailSortService getShakerSortService() {
        return cocktailSortService;
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
