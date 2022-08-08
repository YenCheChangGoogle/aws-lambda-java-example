package com.codetinkering.example;

import java.util.function.Supplier;

import org.springframework.stereotype.Component;

@Component
public class ExampleSupplier implements Supplier<MyPojo> {

    @Override
    public MyPojo get() {
    	System.out.println("偵錯 ExampleSupplier.get()");
    	
        return new MyPojo("YenCheChang Example Data");
    }
}
