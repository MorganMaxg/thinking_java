package concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by maxiaogang on 2017/2/27.
 */
public class Daemons {
    public static void main(String[] args) throws InterruptedException {
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        System.out.println("d.isDaemon() = " + d.isDaemon() + ",");
        TimeUnit.SECONDS.sleep(1);
    }
}
