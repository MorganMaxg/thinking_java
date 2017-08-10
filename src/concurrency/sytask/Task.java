package concurrency.sytask;

/**
 * Created by maxiaogang on 2017/8/10.
 */
public class Task {
    private String getData1;
    private String getData2;

    public synchronized void doLongTimeTask(){
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            getData1 = "长时间处理任务后从远程返回的值1 threadName = " + Thread.currentThread().getName();
            getData2 = "长时间处理任务后从远程返回的值2 threadName = " + Thread.currentThread().getName();
            System.out.println(getData1);
            System.out.println(getData2);
            System.out.println("end task");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    //=============doLongLock()方法用于判断当一个synchroniezed方法锁住休眠时,调用其他方法能否正常调用=================
    public synchronized void doLongLock(){
        try{
            System.out.println("begin doLong lock." + Thread.currentThread().getName());
            Thread.sleep(10000L);
            System.out.println("end do long lock." + Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public synchronized void doLongLock2(){
        try{
            System.out.println("begin doLong lock." + Thread.currentThread().getName());
            System.out.println("end do long lock." + Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //=========================实验结论:锁的是整个对象,当一个方法休眠时,其他方法不会访问==================================
}
