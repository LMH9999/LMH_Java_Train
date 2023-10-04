package com.mystudy.learn.jungsuk;

public class Exercise4_11 {
    public static void main(String[] args) {
        // 피보나치 수열의 시작의 첫 두 숫자 num1과 num2를 1로 한다.
        int num1 = 1;
        int num2 = 1;
        int num3 = 0; // 세번째 값은 아직 정해지지 않았기 때문에 0으로 초기화
        System.out.print(num1+","+num2);
        for (int i = 0 ; i < 8 ; i++ ) {
            num3 = num1 + num2; // 3번째 값은 num1과 num2을 더해서 얻는다.
            System.out.print(","+num3); // 3번째 수열 출력
            num1 = num2; // 1번째 수열을 2번째 수열로 바꾼다.
            num2 = num3; // 2번째 수열을 3번째 수열로 바꾼다.
        }
    }
}
