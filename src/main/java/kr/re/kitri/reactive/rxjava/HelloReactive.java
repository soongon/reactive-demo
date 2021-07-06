package kr.re.kitri.reactive.rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;

public class HelloReactive {

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a", "b", "c", "d", "e", "f");
        stringList.forEach(item -> System.out.println(item));

//        for (String item : stringList) {
//            System.out.println(item);
//        }

        Observable<String> stringObservable = Observable.just("a", "b", "c", "d", "e", "f");
        stringObservable.subscribe(item -> System.out.println(item));
    }
}
