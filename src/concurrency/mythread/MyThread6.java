package concurrency.mythread;

import concurrency.sytask.Task;

/**
 * Created by maxiaogang on 2017/8/10.
 */
public class MyThread6 extends Thread {

    private Task task;

    public MyThread6(Task task) {
        super();
        this.task = task;
    }

    @Override
    public void run(){
        try {
            task.doLongPartLock1();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
