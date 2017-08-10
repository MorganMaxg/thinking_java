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
    //=========================实验结论:锁的是整个对象,当一个方法休眠时,其他方法不会执行==================================

    //===========================实验:俩个包含同步方法块的方法,当一个方法休眠时,其他方法会不会执行=========================
    public void doLongPartLock(){
        try{
            System.out.println("begin do Long part lock." + Thread.currentThread().getName());
            synchronized (this){
                System.out.println("start doing do long part lock." + Thread.currentThread().getName());
                Thread.sleep(10000L);
                System.out.println("end doing do long part lock." + Thread.currentThread().getName());
            }
            System.out.println("end do long lock." + Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void doLongPartLock1(){
        try{
            System.out.println("begin do Long part lock no sleep." + Thread.currentThread().getName());
            synchronized (this){
                System.out.println("doing do long part lock no sleep." + Thread.currentThread().getName());
            }
            System.out.println("end do long lock.  no sleep" + Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //===================实验结果:使用同步块,方法还是会执行,执行到对象锁时,才会进入等待状态===========================
}
