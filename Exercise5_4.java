package com.mystudy.run.jungsuk;

//2차원 배열 arr에 담긴 모든 값의 총합과 평균을 구하는 프로그램
public class Exercise5_4 {
    public static void main(String[] args) {
        //2차원 배열 arr
        int[][] arr = {
                { 5, 5, 5, 5, 5},
                {10,10,10,10,10},
                {20,20,20,20,20},
                {30,30,30,30,30}
        };
        int total = 0; // 총합을 넣을 변수 total
        float average = 0; // 평균을 넣을 변수 average
        for(int i=0; i < arr.length;i++) { // 행을 나타내는 i
            for(int j=0; j < arr[i].length;j++) { // 열을 나타내는 j
                total += arr[i][j];
            }
        }
        average = total /(float)(arr.length * arr[0].length);
        System.out.println("total="+total);
        System.out.println("average="+average);

    }
}
