package com.mystudy.run.jungsuk;

//섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 섯
//다카드 20장을 담는 SutdaCard배열을 초기화하시오. 단, 섯다카드는 1부터 10까지의 숫자
//가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이
//어야 한다. 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.

//7_1에 나오는 섯다카드의 숫자와 종류(isKwang)는 사실 한번 값이 지정되면
//변경되어서는 안 되는 값이다. 카드의 숫자가 한번 잘못 바뀌면 똑같은 카드가 두 장이
//될 수 도 있기 때문이다. 이러한 문제점이 발생하지 않도록 아래의 SutdaCard를 수정하기.

class SutdaDeck3 {
    final int CARD_NUM = 20; //카드의 개수는 변하지 않으므로 기호상수로 선언
    SutdaCard3[] cards = new SutdaCard3[CARD_NUM];
    SutdaDeck3() {
        for(int i=0;i < cards.length;i++) {
            int num = i%10+1; //1~10 카드가 2장씩 있기 때문에 나머지를 이용해서 등록
            boolean isKwang = (i < 10)&&(num==1||num==3||num==8); // 1,3,8인 카드 중 하나씩만 광이기 떄문에 i를 10 이하로 해서 광 등록
            cards[i] = new SutdaCard3(num,isKwang);
        }
    }
}
class SutdaCard3 {
    //값이 변하지 않도록 final로 상수 선언
    final int NUM;
    final boolean IS_KWANG;
    SutdaCard3() {
        this(1, true);
    }
    SutdaCard3(int num, boolean isKwang) {
        this.NUM = num;
        this.IS_KWANG = isKwang;
    }
    // info()대신 Object클래스의 toString()을 오버라이딩했다.
    public String toString() {
        return NUM + ( IS_KWANG ? "K":""); //숫자 뒤에 광인지 체크해서 맞으면 K를 붙이고 아니면 아무것도 넣지 않고 리턴
    }
}

public class Exercise7_14 {
    public static void main(String[] args) {
        SutdaDeck3 deck = new SutdaDeck3();
        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
    }
}
