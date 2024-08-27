package com.nhnacademy.app;

import org.apache.commons.lang3.StringUtils;
import java.util.Objects;

public class NullOrEmpty {
    public static void main(String[]args){
        StringUtils stingUtils = new StringUtils();

        String[] strArray = {
                "",
                "intellij",
                null,
                "java"

        };
        int n = 1;
        for(String s : strArray){
            System.out.print(n+": ");
            n++;
            if(Objects.isNull(s)){
                System.out.println("!Null!");
            }else if(s.isEmpty()) {
                System.out.println("!비어있음!");
            }else{
                System.out.println(s);
            }
        }
    }
}
