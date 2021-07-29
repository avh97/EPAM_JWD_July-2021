package by.khaletski.task01.runner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        /**
         *  Исходные данные для задач (конструкторы) находятся в классе TaskSwitcher.
         *
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

        logger.info("Application has been launched");
        TaskSwitcher taskSwitcher = new TaskSwitcher();
        taskSwitcher.startApplication();
        logger.info("Application has been successfully executed");
    }
}
