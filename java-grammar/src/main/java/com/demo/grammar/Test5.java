package com.demo.grammar;

import java.util.ArrayList;

public class Test5 {

    private static final ArrayList<String> list = new ArrayList<>();
    public static String test(String j){
        int i = 1, s = 1, f = 1, a = 1, b = 1,c = 1,d = 1,e = 1;
        list.add(new String("11111111111111111111111111111"));
        return test(s+i+f+a+b+c+d+e+"");
    }

    public static void main(String[] args) {
        Test5.test("j");
    }
}