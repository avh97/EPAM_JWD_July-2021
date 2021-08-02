package by.khaletski.task01.runner;

import by.khaletski.task01.entity.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public final class TaskSwitcher {

    static final Logger logger = LogManager.getLogger(TaskSwitcher.class);

    /**
     *  Задача №4. Найдите значение функции z = ((a-3)*b/2)+3
     *
     *  Задача №9. Найдите значение выражения ((a/c) * (b/d)) - ((a*b -c)/c*d)
     *
     *  Задача №19. Дана сторона равностороннего треугольника. Найти площадь
     *  этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
     *
     *  Задача №24. Найти (в радианах, в градусах) все углы треугольника со сторонами a, b, c
     *
     *  Задача №34. Дано действительное число x. Не пользуясь никакими другими арифметическими
     *  операциями, кроме умножения, сложения и вычитания, вычислите за минимальное количество
     *  операций 2*x^4 + 3*x^3 + 4*x^2 - 5*x + 6
     */

    Function task4 = new Function(3,  4);
    Expression task9 = new Expression(3, 4, 5, -6);
    EquilateralTriangle task19 = new EquilateralTriangle(7);
    DerivativeTriangle task24 = new DerivativeTriangle(3, 4, 5);
    Equation task34 = new Equation(3);

    public void startApplication() {
        logger.debug("switch start");
        do {
            System.out.println("Введите номер задачи: 4, 9, 19, 24 или 34");
            String num = getTaskNumber();
            switch (num) {
                case "4" : task4.printValueOfFunction(); break;
                case "9" : task9.printValueOfExpression();  break;
                case "19" : task19.printPropertiesOfTriangle();  break;
                case "24" : task24.printPropertiesOfTriangle();  break;
                case "34" : logger.debug("switch 34"); task34.printSolutionOfEquation();  break;
                default : logger.debug("switch default"); System.out.println("Итак, ещё раз: введите номер " +
                        "задачи: 4, 9, 19, 24 или 34");
            }
        } while (!ifExit());
    }

    private String getTaskNumber() {
        Scanner scan = new Scanner(System.in);
        String num;
//        boolean isValid;
//        do {
            num = scan.nextLine();
//            if (!num.equals("4") && !num.equals("9")
//                    && !num.equals("19")
//                    && !num.equals("24")
//                    && !num.equals("34")) {
//                System.out.println("Итак, ещё раз: введите номер задачи: 4, 9, 19, 24 или 34");
//                isValid = false;
//            } else {
//                isValid = true;
//            }
//        } while (!isValid);
        return num;
    }

    private boolean ifExit() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Для продолжения выполнения программы введите любой символ. "
                + "Для выхода из программы введите exit.");
        return scan.nextLine().equals("exit");
    }
}
