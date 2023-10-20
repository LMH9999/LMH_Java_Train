package com.mystudy.run.jungsuk;


//메서드명 : abs
//기 능 : 주어진 값의 절대값을 반환한다.
//반환타입 : int
//매개변수 : int value
public class Exercise6_24 {
    public static int abs(int value){
        return value >=0 ? value : -value; // 들어온 값이 0이거나 0보다 크면 그대로 리턴, 음수라면 -를 곱해 양수로 변환해 리턴
    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value+"의 절대값:"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값:"+abs(value));
    }
}
