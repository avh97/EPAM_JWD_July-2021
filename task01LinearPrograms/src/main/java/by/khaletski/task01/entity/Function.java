package by.khaletski.task01.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Function {
    private double varA;
    private double varB;

    static final Logger logger = LogManager.getLogger();

    public Function(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
        logger.info("Constructor has been successfully executed");
    }

    /**
     * Задача №4. Найдите значение функции z = ((a-3)*b/2)+3
     */

    public Double getValueOfFunction(Function function) {
        return ((varA - 3) * varB / 2) + 3;
    }

    public void printValueOfFunction() {
        Function function = new Function(varA, varB);
        System.out.println("Задача №4. Найдите значение функции z = ((a-3)*b/2)+3");
        System.out.println(("z = " + getValueOfFunction(function)));
    }
}
