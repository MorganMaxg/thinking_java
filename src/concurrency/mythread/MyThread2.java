package concurrency.mythread;

import concurrency.commonutils.CommonUtils;
import concurrency.sytask.Task;

/**
 * Created by maxiaogang on 2017/8/10.
 */
public class MyThread2 extends Thread {
    private Task task;

    public MyThread2(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run(){
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
