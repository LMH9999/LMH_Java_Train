package com.mystudy.run.jungsuk;


//두 점의 거리를 계산하는 getDistance()를 완성
public class Exercise6_6 {

    static double getDistance(int x, int y, int x1, int y1){
        return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1)); //Math.sqrt 제곱근 구하는 공식
    }


    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));
    }
}
