package by.khaletski.task01.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Expression {
    double varA;
    double varB;
    double varC;
    double varD;

    static final Logger logger = LogManager.getLogger();

    public Expression(double varA, double varB, double varC, double varD) {
        this.varA = varA;
        this.varB = varB;
        this.varC = varC;
        this.varD = varD;
        logger.info("Constructor has been successfully executed");
    }

    /**
     * Задача №9. Найдите значение выражения ((a/c) * (b/d)) - ((a*b -c)/c*d)
     */

    public double getValueOfExpression(Expression expression) {
        if (varC <= 0 || varD <= 0) {
            logger.error("Invalid variables. Denominator cannot be negative.");
            throw new IllegalArgumentException();
        }
        return ((varA / varC) * (varB / varD)) - ((varA * varB - varC) / varC * varD);
    }

    public void printValueOfExpression() {
        Expression expression = new Expression(varA, varB, varC, varD);
        System.out.println("Задача №9. Найдите значение выражения ((a/c) * (b/d)) - ((a*b -c)/c*d)");
        System.out.println("Значение выражения: " + getValueOfExpression(expression));
    }
}
