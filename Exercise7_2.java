package com.mystudy.run.jungsuk;

//7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
//        [주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
//        1. 메서드명 : shuffle
//        기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
//        반환타입 : 없음
//        매개변수 : 없음
//        2. 메서드명 : pick
//        기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
//        반환타입 : SutdaCard
//        매개변수 : int index - 위치
//        3. 메서드명 : pick
//        기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
//        반환타입 : SutdaCard
//        매개변수 : 없음

class SutdaDeck2 {
    final int CARD_NUM = 20;
    SutdaCard2[] cards = new SutdaCard2[CARD_NUM];

    SutdaDeck2() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num == 1 || num == 3 || num == 8);
            cards[i] = new SutdaCard2(num, isKwang);
        }
    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int j = (int) (Math.random() * cards.length); //랜덤한 위치 받기
            // cards[i]와 cards[j]의 값을 서로 바꾼다.
            SutdaCard2 tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }

    //값을 입력 받으면 그 값의 위치의 카드를 리턴
    SutdaCard2 pick(int index) {
        if (index < 0 || index >= CARD_NUM) // index의 유효성을 검사한다.
            return null;
        return cards[index];
    }
    //값을 입력 받지 못했다면 랜덤한 카드 리턴
    SutdaCard2 pick() {
        int index = (int) (Math.random() * cards.length);
        return pick(index); // pick(int index)를 호출한다.
    }
}

class SutdaCard2 {
    int num;
    boolean isKwang;

    SutdaCard2() {
        this(1, true);
    }

    SutdaCard2(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class Exercise7_2 {
    public static void main(String args[]) {
        SutdaDeck2 deck = new SutdaDeck2();
        System.out.println(deck.pick(0)); //섞기 전의 카드의 첫번째 카드
        System.out.println(deck.pick()); // 랜덤한 카드 하나
        deck.shuffle();// 카드 섞기
        for (int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ","); // 모든 카드 순서대로 출력
        System.out.println();
        System.out.println(deck.pick(0)); // 섞은 뒤의 첫번째 카드
    }
}