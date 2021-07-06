package kr.re.kitri.reactive.rxjava;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.List;

public class Exercise01 {
    public static void main(String[] args) {
        List<Dish> dishList = Arrays.asList(
                new Dish("삼겹살", 500),
                new Dish("스테이크", 400),
                new Dish("파스타", 300),
                new Dish("된장찌게", 200),
                new Dish("비빔밥", 350),
                new Dish("샐러드", 100)
        );
        // 요리 중 300 칼로리 이하의 요리를 필터링 한 후
        // 요리의 이름만 출력하라..
        Observable
                .fromIterable(dishList)
                .filter(t -> t.getCalorie() >= 300)
                .map(Dish::getName)
                .subscribe(System.out::println);
    }
}

class Dish {
    private String name;
    private int calorie;

    public Dish(String name, int calorie) {
        this.name = name;
        this.calorie = calorie;
    }
    public String getName() {
        return name;
    }
    public int getCalorie() {
        return calorie;
    }
    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", calorie=" + calorie +
                '}';
    }
}