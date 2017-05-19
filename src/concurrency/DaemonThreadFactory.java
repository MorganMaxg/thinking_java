package concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * Created by maxiaogang on 2017/2/24.
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
