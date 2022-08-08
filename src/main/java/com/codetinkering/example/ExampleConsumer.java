package com.codetinkering.example;

import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class ExampleConsumer implements Consumer<MyPojo> {

    @Override
    public void accept(MyPojo myPojo) {
        System.out.println("偵錯 ExampleConsumer.accept() 且 myPojo.getExampleField()=" + myPojo.getExampleField());
    }
}
