package concurrency.mutilQueue;

/**
 * Created by maxiaogang on 2017/8/8.
 */
public class UserQueueTest {
    public static int i =0;
    public static void main(String[] args) {
        UserQueue queue = new UserQueue();
        new Thread((() -> {
            while (true) {
                for (int j = 0; j < 9; j++) {
                    i++;
                    queue.produce(new User("USER_" + i + "_" + Math.random() * 10000));
                }
                try {
                    Thread.currentThread().sleep(10000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        })).start();
        new Thread(() -> {
            while (true) {
                queue.consume();
                try {
                    Thread.currentThread().sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            while (true) {
                queue.consume();
                try {
                    Thread.currentThread().sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            while (true) {
                queue.consume();
                try {
                    Thread.currentThread().sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            while (true) {
                queue.consume();
                try {
                    Thread.currentThread().sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
