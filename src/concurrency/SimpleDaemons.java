package concurrency;

import java.util.concurrent.TimeUnit;



/**
 * 守护线程/伴随线程
 *
 * Created by maxiaogang on 2017/2/23.
 */
public class SimpleDaemons implements Runnable {
    @Override
    public void run() {
        while (true){
            try {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread() + "   " + this);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0;i<10;i++){
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("All Deamons started");
        TimeUnit.MILLISECONDS.sleep(175);
    }
}
