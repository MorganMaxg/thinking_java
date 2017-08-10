package concurrency.mythread;

import concurrency.sytask.Task;

/**
 * Created by maxiaogang on 2017/8/10.
 */
public class MyThread3 extends Thread {
    private Task task;

    public MyThread3(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run(){
        try{
            task.doLongLock();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
