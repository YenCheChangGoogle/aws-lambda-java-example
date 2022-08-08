package com.codetinkering.example;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ExampleFunction implements Function<MyPojo, String> {

    @Override
    public String apply(MyPojo myPojo) {
    	System.out.println("偵錯 ExampleFunction.apply() 且 myPojo.getExampleField()="+myPojo.getExampleField());
    	
        //執行Lambda後的回應內容
        return myPojo.getExampleField().toUpperCase();
    }


}
