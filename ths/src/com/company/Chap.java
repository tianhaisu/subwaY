package com.company;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Chap {
    public static void main(String[] args) {
        LocalDateTime rightNow = LocalDateTime.now();
//        String result = rightNow.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX"));
        System.out.println(rightNow);
    }
}
