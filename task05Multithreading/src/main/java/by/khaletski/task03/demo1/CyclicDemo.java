package by.khaletski.task03.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicDemo {
    public static void main(String[] args) {
        List<Integer> dataList = Collections.synchronizedList(new ArrayList<Integer>());
        // Initializing cyclicbarrier
        CyclicBarrier cb = new CyclicBarrier(3, new ListBarrierAction(dataList));
        // starting threads
        for(int i = 0; i < 3; i++) {
            new Thread(new ListWorker(dataList, cb)).start();;
        }
    }
}

class ListWorker implements Runnable{
    private CyclicBarrier cb;
    private List<Integer> dataList;
    ListWorker(List<Integer> dataList, CyclicBarrier cb) {
        this.dataList = dataList;
        this.cb = cb;
    }
    @Override
    public void run() {
        System.out.println("Executing run method for thread - " + Thread.currentThread().getName());
        for(int i = 0; i < 10; i++) {
            dataList.add(i);
        }

        try {
            System.out.println("Calling await.. " + Thread.currentThread().getName());
            cb.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
// Barrier action to be executed when barrier is tripped
class ListBarrierAction implements Runnable {
    private List<Integer> dataList;
    ListBarrierAction(List<Integer> dataList){
        this.dataList = dataList;
    }
    @Override
    public void run() {
        System.out.println("In ListBarrierAction, start further processing on list with length " + dataList.size());
    }
}