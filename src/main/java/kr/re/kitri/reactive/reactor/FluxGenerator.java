package kr.re.kitri.reactive.reactor;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;
import reactor.core.publisher.Flux;
import reactor.core.publisher.SynchronousSink;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FluxGenerator {

    public Flux<String> fromArray() {
        String[] strings = new String[] {"a", "b", "c", "d"};
        return Flux.fromArray(strings);
    }

    public Flux<String> fromIterable() {
        List<String> stringList = Arrays.asList("a", "b", "c", "d");
        return Flux.fromIterable(stringList);
    }

    public Flux<String> fromStream() {
        Stream<String> stringStream = Stream.of("a", "b", "c", "d");
        return Flux.fromStream(stringStream);
    }

    public Flux<String> fromJust() {
        return Flux.just("a", "b", "c", "d");
    }

    public Flux<String> generate() {
        return null;
    }

    public Flux<Long> interval() {
        return Flux.interval(Duration.of(1, ChronoUnit.SECONDS));
    }

    public Flux<Integer> range() {
        return Flux.range(1, 15);
    }

    public Flux<String> defer() {
        return Flux.defer(() -> Flux.just("1", "2", "3", "4"));
    }

    public static void main(String[] args) {

        FluxGenerator fg = new FluxGenerator();
        Flux<String> fff = fg.fromJust();
        fff.subscribe(t -> System.out.println(t));

//        List<Integer> integerList = new ArrayList<>();
//        Flux.just(1,2,3,4)
//                //.log()
//                .subscribe(new Subscriber<Integer>() {
//
//                    private Subscription subscription;
//                    @Override
//                    public void onSubscribe(Subscription subscription) {
//                        this.subscription = subscription;
//                        //subscription.request(1);
//                        System.out.println("ready..");
//                    }
//                    @Override
//                    public void onNext(Integer integer) {
//                        System.out.println(integer + " requested..");
//                        subscription.request(1);
//                    }
//                    @Override
//                    public void onError(Throwable throwable) {
//
//                    }
//                    @Override
//                    public void onComplete() {
//                        System.out.println("end..");
//                    }
//                });
    }
}
