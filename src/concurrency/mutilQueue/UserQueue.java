package concurrency.mutilQueue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by maxiaogang on 2017/8/8.
 */
public class UserQueue {

    private Queue<User> userQueue;

    public UserQueue(){
        userQueue = new ConcurrentLinkedQueue<>();
    }

    public void produce(User user){
        System.out.println("produce:" + user.getName());
        userQueue.add(user);
    }

    public User consume(){
        User user = userQueue.peek();
        if(user != null){
            userQueue.poll();
            System.out.println("consume:" + user.getName());
        }
        return user;
    }
}
