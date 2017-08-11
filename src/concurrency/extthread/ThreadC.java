package concurrency.extthread;

import concurrency.service.ObjectService;

/**
 * Created by maxiaogang on 2017/8/12.
 */
public class ThreadC extends Thread {

    private ObjectService objectService;
    public ThreadC(ObjectService objectService){
        super();
        this.objectService = objectService;
    }

    @Override
    public void run(){
        super.run();
        objectService.serviceMethod();
    }
}
