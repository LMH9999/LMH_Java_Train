package com.mystudy.learn.jungsuk;

//삼항 연산자를 이용한 양수,음수,0 판별
public class Excercise3_3 {
    public static void main(String[] args) {
        int num = 10; // 판별하고 싶은 수
        System.out.println(num > 0 ? "양수":(num < 0 ? "음수" : "0"));//판별하고 싶은 수가 0보다 크면 "양수" 출력, 0보다 작으면 "음수" 출력, 둘 다 아니면 0
    }
}
