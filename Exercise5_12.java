package com.mystudy.run.jungsuk;

import java.util.Scanner;

//배열을 이용하여 문제에 대한 답을 맞추고 몇 문제 맞췄는지 출력하는 프로그램
public class Exercise5_12 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair","의자"}, // words[0][0], words[0][1]
                {"computer","컴퓨터"}, // words[1][0], words[1][1]
                {"integer","정수"} // words[2][0], words[2][1]
        };

        int score = 0;

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i< words.length;i++){
            System.out.printf("문제 %d번. '%s' 의 뜻은? : ",i+1,words[i][0]);
            String tmp = scanner.nextLine();
            if(tmp.equals(words[i][1])){
                System.out.println("정답입니다.");
                score++; // 정답 수 +1
            }else {
                System.out.printf("오답입니다. 정답은 '%s' 입니다\n",words[i][1]);
            }
        }
        System.out.println();
        System.out.println("당신은 총 "+words.length+"문제 중 "+score+"문제를 맞췄습니다.");
    }
}
