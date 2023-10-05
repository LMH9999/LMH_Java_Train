package com.mystudy.learn.jungsuk;


//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산
public class Exercise4_3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;
        for(int i=1; i <=10; i++) {
            sum += i; //각 항을 계산
            totalSum += sum; //각 항을 전부 더해줌
        }
        System.out.println("totalSum="+totalSum);
    }
}
