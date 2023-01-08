package org.example.creational.builder;

public class LunchOrderDemo {


    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();

        LunchOrder lunchOrder = builder.bread("austr")
                .meat("beff")
                .dressing("azei").build();

        System.out.println(lunchOrder);

    }
}
