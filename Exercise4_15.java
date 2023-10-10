package com.mystudy.run.jungsuk;

//회문수를 구하는 프로그램, 회문수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수, '12321', '12621' 같은 수
public class Exercise4_15 {
    public static void main(String[] args) {
        int number = 12321;
        int tmp = number;
        int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
        while(tmp >0) {
            result = result*10 + tmp % 10; // 기존 결과에 10을 곱해서 더한다.
            System.out.println(result);
            tmp /= 10; // 이미 처리 한 값은 10을 나눠서 없애준다.
        }
        if(number == result)
            System.out.println( number + "는 회문수 입니다.");
        else
            System.out.println( number + "는 회문수가 아닙니다.");
    }
}
