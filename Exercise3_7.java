package com.mystudy.learn.jungsuk;

//화씨를 섭씨로 변환하기
public class Exercise3_7 {
    public static void main(String[] args) {
        int fahrenheit = 100; //변환할 화씨 온도
        float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f; // 변환공식이 'C = 5/9 ×(F - 32)'
        System.out.println("Fahrenheit:"+fahrenheit); // 변환할 화씨 온도 출력
        System.out.println("Celcius:"+celcius); //변환 된 섭씨 온도 출력
    }
}
