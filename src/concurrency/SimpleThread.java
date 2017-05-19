package concurrency;

/**
 * 使用继承Thread类的线程,t.getName()方法,返回的是0,1这种格式
 *  与SelfManaged类进行对比
 * Created by maxiaogang on 2017/2/27.
 */
public class SimpleThread extends Thread {
    private int countDown = 5;
    private static int threadCount = 0;

    public SimpleThread(){
        super(Integer.toString(++threadCount));
        start();
    }

    @Override
    public String toString(){
        return "#" + getName() + "(" + countDown+ "), ";
    }

    @Override
    public void run(){
        while (true){
            System.out.print(this);
            if(--countDown == 0){
                return;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            new SimpleThread();
        }
    }

}
