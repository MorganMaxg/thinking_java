package concurrency;

/**
 * Created by 46513 on 2017/2/19.
 */
public class MyThreadMain2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            new Thread(new MyThread(i)).start();
        }
    }
}