package concurrency.extthread;

import concurrency.service.HasSelfPrivateNum;

/**
 * Created by maxiaogang on 2017/7/27.
 */
public class ThreadA extends Thread {

    private HasSelfPrivateNum hasSelfPrivateNum;

    public ThreadA(HasSelfPrivateNum hasSelfPrivateNum){
        super();
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run(){
        super.run();
        hasSelfPrivateNum.add1("a");
    }
}
