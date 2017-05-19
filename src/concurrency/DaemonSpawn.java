package concurrency;

/**
 * Created by maxiaogang on 2017/2/27.
 */
public class DaemonSpawn implements Runnable {

    @Override
    public void run() {
        while (true){
            Thread.yield();
        }
    }
}
