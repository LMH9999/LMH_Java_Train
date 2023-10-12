package com.mystudy.run.jungsuk;


//SutdaCard클래스에 두 개의 생성자와 info()를 추가해서 실행결과와 같은 결과가 나오도록 만들기
//실행결과
//3
//1K
public class Exercise6_2 {
    public static void main(String args[]) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info()); // 3이 출력된다.
        System.out.println(card2.info()); // 1K가 출력된다.
    }

}
class SutdaCard{
    int num;
    boolean isKwang;

    public SutdaCard() {
        this(1,true);
    }

    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    String info(){
        return num + (isKwang ? "K" : ""); //들어온 숫자와 광이 맞다면 K 아니면 빈 문자를 합쳐서 리턴
    }
}
