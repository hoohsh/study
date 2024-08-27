package com.nhnacademy.app;

import org.apache.commons.math3.random.RandomDataGenerator;

public class Random2 {
    public static void main(String[] args){
        RandomDataGenerator randomDataGenerator = new RandomDataGenerator();
        int randomNum = randomDataGenerator.nextInt(1,100);

        System.out.println("1~100 사이 숫자: "+randomNum);
    }
}
