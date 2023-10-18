package com.mystudy.run.jungsuk;

/*
메서드명 : max
기 능 : 주어진 int형 배열의 값 중에서 제일 큰 값을 반환한다.
만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환한다.
반환타입 : int
매개변수 : int[] arr - 최대값을 구할 배열
*/

import java.util.Arrays;

public class Exercise6_23 {
    public static int max(int[] arr) {
        if(arr==null || arr.length==0) //주어진 배열이 null이거나 0일때
            return -999999;
        int max = arr[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다.
        for(int i=1; i< arr.length;i++) { // 배열의 두 번째 값부터 비교한다.
            if(arr[i] > max)//현재 배열의 값이 더 큰경우 바꾸기
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args)
    {
        int[] data = {3,2,9,4,7};
        System.out.println(Arrays.toString(data));
        System.out.println("최대값:"+max(data));
        System.out.println("최대값:"+max(null));
        System.out.println("최대값:"+max(new int[]{})); // 크기가 0인 배열
    }
}
