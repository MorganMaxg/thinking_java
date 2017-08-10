package concurrency.mythread;

import concurrency.sytask.Task;

/**
 * Created by maxiaogang on 2017/8/10.
 */
public class MyThread4 extends Thread {

    private Task task;

    public MyThread4(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run(){
        try {
            task.doLongLock2();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
