package com.java8;

import java.util.ArrayList;
import java.util.List;

public class DemoForEach {

    public static void main(String[] args) {
        List<Integer> values=new ArrayList<>();
        values.add(1);
        for (int i = 0; i < values.size(); i++) {
System.out.println(values.get(i));
        }

        for (int input:values) {
            System.out.println(input);
        }

        values.forEach(i -> System.out.println("i"+i));

    }
}


