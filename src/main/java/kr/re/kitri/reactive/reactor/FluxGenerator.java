package kr.re.kitri.reactive.reactor;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.SynchronousSink;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FluxGenerator {

    public Flux<String> fromArray() {
        return null;
    }

    public Flux<String> fromIterable() {
        return null;
    }

    public Flux<String> fromStream() {
        return null;
    }

    public Flux<String> fromJust() {
        return null;
    }

    public Flux<String> generate() {
        return null;
    }

    public Flux<String> interval() {
        return null;
    }

    public Flux<String> range() {
        return null;
    }

    public Flux<String> defer() {
        return null;
    }



    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Flux.just(1,2,3,4)
                //.log()
                .subscribe(new Subscriber<Integer>() {

                    private Subscription subscription;
                    @Override
                    public void onSubscribe(Subscription subscription) {
                        this.subscription = subscription;
                        //subscription.request(1);
                        System.out.println("ready..");
                    }
                    @Override
                    public void onNext(Integer integer) {
                        System.out.println(integer + " requested..");
                        subscription.request(1);
                    }
                    @Override
                    public void onError(Throwable throwable) {

                    }
                    @Override
                    public void onComplete() {
                        System.out.println("end..");
                    }
                });
    }
}
