package concurrency.test;

import concurrency.mythread.MyThread5;
import concurrency.mythread.MyThread6;
import concurrency.sytask.Task;

/**
 * 用于测试俩个包含synchronized代码块的方法,当一个阻塞时,其他方法还可以使用么
 * Created by maxiaogang on 2017/8/10.
 */
public class Run4 {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread5 myThread5 = new MyThread5(task);
        myThread5.start();
        MyThread6 myThread6 = new MyThread6(task);
        myThread6.start();
    }
}
