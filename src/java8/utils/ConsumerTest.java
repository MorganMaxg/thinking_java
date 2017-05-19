package java8.utils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by 46513 on 2017/5/19.
 */
public class ConsumerTest {

    public static <T> void forEach(List<T> list, Consumer<T> consumer){
        for(T i:list){
            consumer.accept(i);
        }
    }

    public static void main(String[] args) {
        forEach(Arrays.asList(1,2,3,4,5), (Integer i)-> System.out.println(i));
    }
}
