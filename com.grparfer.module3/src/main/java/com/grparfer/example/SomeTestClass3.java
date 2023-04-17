package com.grparfer.example;

import java.util.List;
import java.util.stream.IntStream;

public class SomeTestClass3 {
    public static List<String> getStringList() {
        return IntStream.range(0, 1000)
                .boxed()
                .map(String::valueOf)
                .toList();
    }
}