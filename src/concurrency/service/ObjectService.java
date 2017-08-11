package concurrency.service;

/**
 * 测试同步代码块
 * Created by maxiaogang on 2017/8/12.
 */
public class ObjectService {
    public void serviceMethod(){
        try{
            synchronized (this){
                System.out.println("begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end end=" + System.currentTimeMillis());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
