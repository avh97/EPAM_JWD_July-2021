package by.training.demothreads.other.ex04threadmanagement;

public class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }

    public void run() {
        String nameT = getName();
        long timeout = 0;
        System.out.println("Старт потока " + nameT);
        try {
            switch (nameT) {
                case "First":
                    timeout = 5_000;
                    break;
                case "Second":
                    timeout = 1_000l;
            }
            Thread.sleep(timeout);
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
