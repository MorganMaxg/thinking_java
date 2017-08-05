package concurrency.test;

import concurrency.extthread.ThreadA;
import concurrency.extthread.ThreadB;
import concurrency.service.HasSelfPrivateNum;

/**
 * Created by maxiaogang on 2017/7/27.
 */
public class Run {
    public static void main(String[] args) {
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        HasSelfPrivateNum hasSelfPrivateNum1 = new HasSelfPrivateNum();
        ThreadA athread = new ThreadA(hasSelfPrivateNum);
        athread.start();
        ThreadB bthread = new ThreadB(hasSelfPrivateNum1);
        bthread.start();
    }
}
