package com.mystudy.run.jungsuk;

//오류가 나는 이유와 에러 수정하기

class Product
{
    int price; // 제품의 가격
    int bonusPoint; // 제품구매 시 제공하는 보너스점수

    //매개 변수가 없는 기본 생성자가 없는데 매개변수 없이 호출해서 오류가 남
    Product() {}
    Product(int price) {
        this.price = price;
        bonusPoint =(int)(price/10.0);
    }
}
class Tv extends Product {
    Tv() {}
    public String toString() {
        return "Tv";
    }
}
public class Exercise7_5 {
    public static void main(String[] args) {
        Tv t = new Tv();
        System.out.println(t.toString());
    }
}
