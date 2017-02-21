package concurrency;

/**
 * Created by 46513 on 2017/2/19.
 */
public class MyThread implements Runnable {
    private int id;

    public MyThread() {
    }

    public MyThread(int countDown) {
        this.id = countDown;
        System.out.println("#" + id + "(start)");
    }

    @Override
    public void run() {
        System.out.println("#" + id +"(is running)");
        Thread.yield();
        System.out.println("#" + id +"(is running2)");
        Thread.yield();
        System.out.println("#" + id +"(is running3)");
        Thread.yield();
        System.out.println("#" + id + "(end run)");
    }
}
