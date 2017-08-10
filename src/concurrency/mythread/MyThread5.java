package concurrency.mythread;

import concurrency.sytask.Task;

/**
 * Created by maxiaogang on 2017/8/10.
 */
public class MyThread5 extends Thread {

    private Task task;

    public MyThread5(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run(){
        try {
            task.doLongPartLock();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
