package kr.re.kitri.reactive.rxjava;

import io.reactivex.rxjava3.core.Observable;
import org.w3c.dom.ls.LSOutput;

import java.util.concurrent.TimeUnit;

public class MergeDemo {
    public static void main(String[] args) throws Throwable {
        Observable<Long> longObservable01 =
                Observable.interval(0, 1000, TimeUnit.MILLISECONDS);
        Observable<Long> longObservable02 =
                Observable.interval(100, 500, TimeUnit.MILLISECONDS);

        Observable<Long> longObservable3 = longObservable01.mergeWith(longObservable02);
        // Observable.merge(longObservable01, longObservable02);
        longObservable3.subscribe(item -> System.out.println(item));

        Thread.sleep(10_000);
    }
}
