package com.mystudy.run.jungsuk;


//Exercise6-6에서 작성한 클래스메서드 getDistance()를 MyPoint클래스의 인스턴스메서드로 정의
public class Exercise6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);

        System.out.println(p.getDistane(2,2));
    }
}

class MyPoint{
    int x;
    int y;

    //생성자
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    double getDistane(int x1, int y1){
        return Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
    }
}
