package com.nhnacademy.app;

/**
 * Hello world!
 *
 */

import java.util.Random;

public class Random1
{
    public static void main( String[] args )
    {
        Random random = new Random();
        int randomNum = random.nextInt(100)+1;
        System.out.println("1~100 사이 숫자: "+randomNum);

    }
}
