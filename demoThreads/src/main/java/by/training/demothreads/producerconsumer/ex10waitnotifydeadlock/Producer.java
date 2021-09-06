package by.training.demothreads.producerconsumer.ex10waitnotifydeadlock;

//класс Производитель
class Producer extends Thread {//implements Runnable {

    Store store;

    Producer(Store store) {
        this.store = store;
    }

    public void run() {
        for (int i = 1; i < 6; i++) {
            store.put();
        }
    }
}
