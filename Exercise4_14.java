package com.mystudy.learn.jungsuk;


import java.util.Scanner;

/*
1~100 사이의 숫자 맞추기 게임
 */
public class Exercise4_14 {
    public static void main(String[] args) {
        // 1~100사이의 임의의 값을 얻어서 a에 저장한다.
        int a = (int)(Math.random() * 100) + 1;
        int input = 0; // 사용자가 입력한 값
        int count = 0; // 몇 번 시도했는지 보기위한 카운트

        Scanner s = new Scanner(System.in);

        do {
            count++;//카운트 올려주기
            System.out.print("1과 100사이의 값을 입력하세요 :");
            input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
            if(a > input) {//입력받은 값이 정답보다 작을 경우
                System.out.println("더 큰 수를 입력하세요.");
            }
            else if(a < input){//입력받은 값이 정답보다 큰 경우
                System.out.println("더 작은 수를 입력하세요.");
            } else {//입력 받은 값이 정답인 경우
                System.out.println("맞췄습니다.");
                System.out.println("시도횟수는 "+count+"번입니다.");
                break; // 정답이기 때문에 프로그램 종료
            }
        } while(true); // 맞출 때 까지 반복
    }
}
