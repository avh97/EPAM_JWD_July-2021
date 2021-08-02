package by.khaletski.task01.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Function {
    private double varA;
    private double varB;

    static final Logger logger = LogManager.getLogger();

    public Function(double newA, double newB) {
        varA = newA;
        varB = newB;
    }

    //    public Function(double varA, double varB) {
//        this.varA = varA;
//        this.varB = varB;
//        logger.info("Constructor has been successfully executed");
//    }

//    /**
//     * Задача №4. Найдите значение функции z (x) = ((a-3)*b/2)+3 * x
//     *
//     */

    /**
     * @param x
     * @return
     */

    public double getValueOfFunction(final double x) {
        return ((varA - 3) * varB / 2) + 3 * x;
    }

    public double getValueOfFunction() {
        return ((varA - 3) * varB / 2) + 3;
    }

    public void printValueOfFunction() {
        System.out.println("Задача №4. Найдите значение функции z = ((a-3)*b/2)+3");
        System.out.println(("z = " + getValueOfFunction()));
    }
}
