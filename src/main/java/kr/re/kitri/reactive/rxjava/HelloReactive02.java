package kr.re.kitri.reactive.rxjava;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HelloReactive02 {
    public static void main(String[] args) throws Throwable {
//        Observable<Integer> integerObservable =
//                Observable.range(1, 100);
//
//        integerObservable.subscribe(item -> System.out.println(item));

        // Observable 생성 함수 --> just(), interval(), fromXxx(), range()

        Observable
                .fromIterable(Arrays.asList("red","white","yellow","green","brown"))
                .skipLast(2)
                .distinct()
                .filter(x -> x.length() > 3)   // Predicate
                .map(item -> item + " color")  // Function
                .subscribe(item -> System.out.println(item));  // Consumer
    }
}
