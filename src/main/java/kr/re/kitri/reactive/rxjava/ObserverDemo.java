package kr.re.kitri.reactive.rxjava;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import org.reactivestreams.Subscription;

public class ObserverDemo {

    public static void main(String[] args) throws InterruptedException {
        Observable<Integer> integerFlowable =
                Observable.just(1,2,3,4,5,6,7);

        integerFlowable.subscribe(new Observer<Integer>() {
            @Override
            public void onSubscribe(@NonNull Disposable d) {
                System.out.println("구독 시작");
            }
            @Override
            public void onNext(@NonNull Integer integer) {
                System.out.println(integer + " 데이터 전달됨");
            }
            @Override
            public void onError(@NonNull Throwable e) {
            }
            @Override
            public void onComplete() {
                System.out.println("job completed..");
            }
        });
    }
}
