package com.mystudy.run.jungsuk;

//호출되는 생성자의 순서와 실행결과

class Parent {
    int x=100;

    //3번째
    Parent() {
        this(200); // Parent(int x)를 호출
    }
    //4번째
    Parent(int x) {
        this.x = x;
    }
    //5번째
    int getX() {
        return x;
    }
}
class Child extends Parent {
    int x = 3000;

    //1번째
    Child() {
        this(1000); // Child(int x)를 호출
    }
    //2번째
    Child(int x) {
        this.x = x;
    }
}
public class Exercise7_7 {
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("x="+c.getX());
    }
}
