package com.mystudy.learn.jungsuk;


/*[3-5] 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 만일 변수 num의
        값이 333이라면 331이 되고, 777이라면 771이 된다. */
public class Exercise3_5 {
    public static void main(String[] args) {
        int num = 333;
        System.out.println( num/10*10+1);
    }
}
