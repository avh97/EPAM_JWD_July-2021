package by.khaletski.task03.demo2;

public class PopulateArray extends Thread {

    private int f[];
    private int a, b;
    private int x;

    public PopulateArray(int list[], int a, int b, int x) {
        f = list;
        this.a = a;
        this.b = b;
        this.x = x;
    }

    @Override
    public void run() {
        for (int j = a; j < b; j++) {
            f[j] = x;
        }

    }

}

class ShuffleResult {

    public static void main(String[] args) {
        //Populate array
        int list[] = new int[100];

        Thread t = new PopulateArray(list, 0, 50, (int) Math.random() * 100);
        Thread t1 = new PopulateArray(list, 50, list.length, (int) Math.random() * 100);

        t.start();
        t1.start();
        try {
            t.join();
            t1.join();
        } catch (InterruptedException e) {
        }

        //Print array
        for (int i : list) {
            System.out.print(list[i] + " ");

        }
    }

}
