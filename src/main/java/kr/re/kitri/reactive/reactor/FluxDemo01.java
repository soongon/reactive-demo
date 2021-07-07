package kr.re.kitri.reactive.reactor;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;

public class FluxDemo01 {

    public static Flux<Integer> getData() {
        return Flux.just(1,2,3,4,5);
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        getData()
                .log()
                .subscribe(t -> integerList.add(t));

        // System.out.println(integerList);
    }
}
