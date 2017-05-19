package java8.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by 46513 on 2017/5/19.
 */
public class PredicateTest {

    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<T>();
        for(T s:list){
            if(p.test(s)){
                result.add(s);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Predicate<String> notEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("");
        listOfStrings.add("123");
        List<String> nonEmpty = filter(listOfStrings, notEmptyStringPredicate);
        System.out.println(nonEmpty.toString());
    }
}
