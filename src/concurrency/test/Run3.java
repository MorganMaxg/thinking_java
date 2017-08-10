package concurrency.test;

import concurrency.mythread.MyThread3;
import concurrency.mythread.MyThread4;
import concurrency.sytask.Task;

/**
 * 用于测试俩个synchronized方法,当一个阻塞时,其他方法还可以使用么
 * Created by maxiaogang on 2017/8/10.
 */
public class Run3 {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread3 myThread3 = new MyThread3(task);
        MyThread4 myThread4 = new MyThread4(task);
        myThread3.start();
        myThread4.start();
    }
}
