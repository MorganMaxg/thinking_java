package concurrency.test.run;

import concurrency.extthread.ThreadC;
import concurrency.extthread.ThreadD;
import concurrency.service.ObjectService;

/**
 * 测试同步代码块
 * Created by maxiaogang on 2017/8/12.
 */
public class Run {
    public static void main(String[] args) {
        ObjectService service = new ObjectService();
        ThreadC threadC = new ThreadC(service);
        threadC.setName("C");
        threadC.start();
        ThreadD threadD = new ThreadD(service);
        threadD.setName("D");
        threadD.start();
    }
}
