package com.mystudy.jungsuk2;

//메서드명 : action
//기 능 : 주어진 객체의 메서드를 호출한다.
//DanceRobot인 경우, dance()를 호출하고,
//SingRobot인 경우, sing()을 호출하고,
//DrawRobot인 경우, draw()를 호출한다.
//반환타입 : 없음
//매개변수 : Robot r - Robot인스턴스 또는 Robot의 자손 인스턴스

//실행결과 :
//춤을 춥니다.
//노래를 합니다.
//그림을 그립니다.

public class Exercise7_18 {
    public static void action(Robot r) {
        //불려온 로봇 종류에 따라 액션이 달라짐
        if(r instanceof DanceRobot) {
            DanceRobot dr = (DanceRobot)r;
            dr.dance();
        } else if(r instanceof SingRobot) {
            SingRobot sr = (SingRobot)r;
            sr.sing();
        } else if(r instanceof DrawRobot) {
            DrawRobot dr = (DrawRobot)r;
            dr.draw();
        }
    }
    public static void main(String[] args) {
        //실행결과를 보고 춤,노래,그림 순서로 배열에 넣어주기
        Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
        for(int i=0; i< arr.length;i++)
            action(arr[i]); // 순서대로 호출
    }
}
class Robot {}

//모두 Robot클래스의 자손이므로 extends로 상속
class DanceRobot extends Robot {
    void dance() {
        System.out.println("춤을 춥니다.");
    }
}
class SingRobot extends Robot {
    void sing() {
        System.out.println("노래를 합니다.");
    }
}
class DrawRobot extends Robot {
    void draw() {
        System.out.println("그림을 그립니다.");
    }
}