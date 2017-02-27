package concurrency;

import java.util.concurrent.TimeUnit;

/**
 * if the main thread run over,the ADaemon thread will be over either, not interrupted
 * Created by maxiaogang on 2017/2/27.
 */
public class DaemonsDontRunFinally {
    public static void main(String[] args) {
        Thread t = new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
    }
}

/**
 * 当主线程结束时,JVM会立刻停止所有的伴随线程
 */
class ADaemon implements Runnable{

    @Override
    public void run() {
        System.out.println("Starting ADaemon");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            System.out.println("Existing via InterruptedException");
        } finally {
            System.out.println("This should always run ?");
        }
    }
}
