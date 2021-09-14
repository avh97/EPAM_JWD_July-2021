package by.khaletski.task03.view;

import by.khaletski.task03.entity.Matrix;
import by.khaletski.task03.entity.MatrixException;
import by.khaletski.task03.service.creator.MatrixFillServiceCreator;
import by.khaletski.task03.service.impl.*;

public class Runner {

    /**
     * Task 6. Многопоточность
     *
     * Разработать многопоточное приложение, использующее разделяемые ресурсы. Любая сущность, желающая получить
     * доступ к разделяемому ресурсу, должна быть потоком. В приложении должна быть реализована функциональность,
     * определенная индивидуальным заданием.
     *
     * Требования
     *
     *     • Программа должна использовать возможности синхронизации, поставляемые библиотеками java.util.concurrent
     *     и java.util.concurrent.locks.
     *     • Не использовать synchronized, volatile, BlockingQueue и другие ограниченно потокобезопасные коллекции.
     *     • Классы и другие сущности приложения должны быть грамотно структурированы по пакетам и иметь отражающую
     *     их функциональность название.
     *     • Использовать шаблон State для описания состояний объекта, если только этих состояний больше двух.
     *     • Вместо Thread.sleep использовать только возможности перечисления TimeUnit.
     *     • Данные инициализации матрицы и потоков считывать из текстового файла.
     *     • В приложении должен присутствовать потокобезопасный Singleton.
     *     • Для записи логов использовать Log4J2.
     *     • *TestNG
     *     • Разрешается для вывода работы потоков использовать метод main
     *
     * Задание
     *
     * Матрица. Инициализирована целочисленная матрица размерности NxN, где  n1<=N<=n2.  Главная диагональ матрицы
     * инициализирована нулями.
     * Создано M потоков, где  m1<=M<=m2, 1<n1 <= n2, 1<m1 <= m2.
     *
     * Полем каждого класса-потока является некоторое уникальное целое положительное число. Каждый поток записывает
     * в диагональ матрицы свое число.
     * Примечания:
     *     A) Должны быть изменены все диагональные элементы матрицы.
     *     B) Диагональный элемент может подвергнуться замене только один раз.
     *     C) Решение, при котором изменения в матрице совершает один поток считается некорректным.
     * Предложить 4 или более решений задачи.
     */

    public static void main(String[] args) throws InterruptedException {
        MatrixFillServiceCreator matrixCreator = new MatrixFillServiceCreator();
        Matrix matrix = null;
        try {
            matrix = matrixCreator.fillFrom("src/main/resources/matrix.txt");
        } catch (MatrixException e) {
            e.printStackTrace();
        }
        System.out.println(matrix);
        Thread.sleep(1000);

        MatrixCyclicBarrierServiceImpl matrixCyclicBarrierService = new MatrixCyclicBarrierServiceImpl();
        MatrixExecutorServiceImpl matrixExecutorService = new MatrixExecutorServiceImpl();
        MatrixReentrantLockServiceImpl matrixReentrantLockService = new MatrixReentrantLockServiceImpl();
        MatrixSemaphoreServiceImpl matrixSemaphoreService = new MatrixSemaphoreServiceImpl();
        MatrixAtomicServiceImpl matrixAtomicService = new MatrixAtomicServiceImpl();

//        matrixCyclicBarrierService.setMainDiagonal(matrix, 111, 3);

//        matrixExecutorService.setMainDiagonal(matrix, 111);

//        matrixSemaphoreService.setMainDiagonal(matrix, 999, 3);

//        matrixAtomicService.setMainDiagonal(matrix, 111, 3);

        matrixReentrantLockService.setMainDiagonal(matrix, 111, 3);

        Thread.sleep(3000);
        System.out.println(matrix);
    }
}
