package kr.re.kitri.reactive.reactor;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class SubscriberDemo01 {
    public static void main(String[] args) {
        Flux<String> stringFlux = Flux.just("Hello world", "Fine thank you", "Hi");

        stringFlux.subscribe(new Subscriber<String>() {
            private Subscription subscription;
            @Override
            public void onSubscribe(Subscription subscription) {
                System.out.println("구독 시작..");
                this.subscription = subscription;
                this.subscription.request(2);
            }
            @Override
            public void onNext(String s) {
                System.out.println(s + " 사용완료..");
                this.subscription.request(1);
            }
            @Override
            public void onError(Throwable throwable) {

            }
            @Override
            public void onComplete() {
                System.out.println("the end..");
            }
        });
    }
}
