package com.mystudy.learn.jungsuk;


//1부터 6사이의 임의의 정수를 변수 value에 저장하는 프로그램
public class Exercise4_7 {
    public static void main(String[] args) {
        int value = 0;
        value = (int)(Math.random()*6) +1;
        System.out.println(value);
    }
}
