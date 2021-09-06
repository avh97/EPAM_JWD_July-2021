package by.training.demothreads.commonresource.ex06synchronized;

public class ThreadsApp {

    public static void main(String[] args) {

        CommonResource commonResource = new CommonResource();
        for (int i = 1; i < 6; i++) {

            Thread t = new Thread(new CountThread(commonResource));
            t.setName("Поток " + i);
            t.start();
        }
    }
}

//один из вариантов

//
//class CommonResource {
//    int x = 0;
//}
//
//class CountThread implements Runnable {
//
//    CommonResource res;
//
//    CountThread(CommonResource res) {
//        this.res = res;
//    }
//
//    public void run() {
//        synchronized (res) {
//            res.x = 1;
//            for (int i = 1; i < 5; i++) {
//                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
//                res.x++;
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                }
//            }
//        }
//    }

//некорректное выполнение

//class CountThread implements Runnable{
//
//	    CommonResource res;
//
//	    CountThread(CommonResource res){
//	        this.res = res;
//	    }
//	    public void run(){
//	        res.x=1;
//
//	        for (int i = 1; i < 5; i++){
//	            System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
//	            res.x++;
//	            try{
//	                Thread.sleep(100);
//	            }
//	            catch(InterruptedException e){}
//	        }
//	    }
//	}
//}