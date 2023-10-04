package com.mystudy.learn.jungsuk;

//1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합
public class Exercise4_2 {
    public static void main(String[] args) {
        int sum = 0;//총합을 저장할 변수
        for(int i=1; i <=20; i++) {//1부터 20까지의 반복문
            if(i%2!=0 && i%3!=0) //i가 2또는 3의 배수가 아닐 때만 sum에 i를 더한다. AND연산 이기 때문에 둘다 충족할 때 더해진다.
                sum +=i;
        }
        System.out.println("sum="+sum);
    }
}
