package concurrency;

/**
 * 使用Runnable接口的线程,t.getName()方法,返回的是Thread-0,Thread-1这种格式
 * 与SimpleThread类进行对比
 * Created by maxiaogang on 2017/2/27.
 */
public class SelfManaged implements Runnable {

    private int countDown = 5;
    private Thread t = new Thread(this);

    public SelfManaged(){
        t.start();
    }

    @Override
    public String toString(){
        return  t.getName() + "("+ countDown +"), ";
    }

    @Override
    public void run() {
        while (true){
            System.out.print(this);
            if(--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            new SelfManaged();
    }
}
