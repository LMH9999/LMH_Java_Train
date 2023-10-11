package com.mystudy.run.jungsuk;

//거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제, 가능한 한 적은 수의 동전으로
public class Exercise5_6 {
    public static void main(String[] args) {
        //가능한 큰 동전부터 거슬러줘야함
        int[] coinUnit = {500, 100, 50, 10};
        int money = 14640;// 거슬르고 싶은 금액
        System.out.println("money="+money);
        for(int i=0;i<coinUnit.length;i++) {// 배열의 가장 큰 동전부터 거슬르기 위해 가장 앞인 500부터
            System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);
            money = money%coinUnit[i];
        }
    }

}
