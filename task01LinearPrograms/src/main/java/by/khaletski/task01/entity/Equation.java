package by.khaletski.task01.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Equation {
    private double varX;

    static final Logger logger = LogManager.getLogger();

    public Equation(double varX) {
        this.varX = varX;
        logger.info("Constructor has been successfully executed");
    }

    public double getSolutionOfEquation(Equation equation) {
        return (6 + varX * (5 + varX * (4 + varX * (3 + 2 * varX))));
    }

    public void printSolutionOfEquation() {
        System.out.println("Задача №34. Дано действительное число x. "
                + "Не пользуясь никакими другими арифметическими операциями, "
                + "кроме умножения, сложения и вычитания, "
                + "вычислите за минимальное количество операций "
                + "2*x^4 + 3*x^3 + 4*x^2 - 5*x + 6");
        Equation equation = new Equation(varX);
        System.out.println("Решение: " + getSolutionOfEquation(equation));
    }
}
