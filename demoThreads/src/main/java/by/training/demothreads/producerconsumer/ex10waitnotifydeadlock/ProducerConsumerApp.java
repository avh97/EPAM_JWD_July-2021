package by.training.demothreads.producerconsumer.ex10waitnotifydeadlock;

public class ProducerConsumerApp {
    public static void main(String[] args) {

        Store store = new Store();
        new Producer(store).start();
        new Consumer(store).start();

	 /*	Producer producer = new Producer(store);
		Consumer consumer = new Consumer(store);
		new Thread(producer).start();
		new Thread(consumer).start();*/

    }
}
