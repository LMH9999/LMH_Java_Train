package com.mystudy.run.jungsuk;

//주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램
public class Exercise5_11 {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100}
                , {20, 20, 20}
                , {30, 30, 30}
                , {40, 40, 40}
                , {50, 50, 50}
        };
        //주어진 배열보다 1,1 큰 배열 생성
        int[][] result = new int[score.length+1][score[0].length+1];

        for(int i=0; i < score.length;i++) {
            for(int j=0; j < score[i].length;j++) {
                result[i][j] = score[i][j]; // 일단 주어진 배열을 복사
                result[i][score[0].length] += result[i][j]; //행 끝에 행의 합을 더함
                result[score.length][j] += result[i][j]; // 열 끝에 열의 합을 더함
                result[score.length][score[0].length] += result[i][j]; // 행열의 끝에 총합
            }
        }
        for(int i=0; i < result.length;i++) {
            for(int j=0; j < result[i].length;j++) {
                System.out.printf("%4d",result[i][j]);
            }
            System.out.println();
        }
    }
}
