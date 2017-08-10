package concurrency.test;

import concurrency.commonutils.CommonUtils;
import concurrency.mythread.MyThread1;
import concurrency.sytask.Task;

/**
 * 用于测试使用synchronized同步方法耗时时间长的问题
 * Created by maxiaogang on 2017/8/10.
 */
public class Run2 {
    public static void main(String[] args) {
        Task task = new Task();
        MyThread1 myThread1 = new MyThread1(task);
        MyThread1 myThread2 = new MyThread1(task);
        myThread1.start();
        myThread2.start();
        try{
            Thread.sleep(10000L);
        }catch (Exception e){
            e.printStackTrace();
        }
        long beginTime = CommonUtils.beginTime1;
        if(CommonUtils.beginTime2 < CommonUtils.beginTime2){
            beginTime = CommonUtils.beginTime2;
        }
        long endTime = CommonUtils.endTime1;
        if(CommonUtils.endTime2 > CommonUtils.endTime1){
            endTime = CommonUtils.endTime2;
        }
        System.out.println("耗时:" + (endTime - beginTime) / 1000);
    }
}
