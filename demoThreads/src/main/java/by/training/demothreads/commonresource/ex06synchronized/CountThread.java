package by.training.demothreads.commonresource.ex06synchronized;

class CountThread implements Runnable {

    CommonResource res;

    CountThread(CommonResource res) {
        this.res = res;
    }

    public void run() {
        res.increment();
    }
}
