package concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by 46513 on 2017/2/19.
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0;i<5;i++){
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
