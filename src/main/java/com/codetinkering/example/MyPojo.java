package com.codetinkering.example;

import lombok.Data;

@Data
public class MyPojo {
    private String exampleField;
    
    public MyPojo() {}
    public MyPojo(String s) { exampleField=s; }
}