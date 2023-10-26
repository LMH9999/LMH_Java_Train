package com.mystudy.jungsuk2;

/*
    7-22에서 정의한 클래스들의 면적을 구하는 메서드를 작성하고 테스트 하시오.
    1. 메서드명 : sumArea
        기 능 : 주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환한다.
        반환타입 : double
        매개변수 : Shape[] arr
*/

abstract class Shape2 {
    Point2 p;
    Shape2() {
        this(new Point2(0,0));
    }
    Shape2(Point2 p) {
        this.p = p;
    }
    abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
    Point2 getPosition() {
        return p;
    }
    void setPosition(Point2 p) {
        this.p = p;
    }
}
class Rect2 extends Shape2 {
    double width;
    double height;
    Rect2(double width, double height) {
        this(new Point2(0,0), width, height);
    }
    Rect2(Point2 p, double width, double height) {
        super(p); // 조상의 멤버는 조상의 생성자가 초기화하도록 한다.
        this.width = width;
        this.height = height;
    }
    boolean isSquare() {
// width나 height가 0이 아니고 width와 height가 같으면 true를 반환한다.
        return width*height!=0 && width==height;
    }
    double calcArea() {
        return width * height;
    }
}
class Circle2 extends Shape2 {
    double r; // 반지름
    Circle2(double r) {
        this(new Point2(0,0),r); // Circle(Point p, double r)를 호출
    }
    Circle2(Point2 p, double r) {
        super(p); // 조상의 멤버는 조상의 생성자가 초기화하도록 한다.
        this.r = r;
    }
    double calcArea() {
        return Math.PI * r * r;
    }
}
class Point2 {
    int x;
    int y;
    Point2() {
        this(0,0);
    }
    Point2(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public String toString() {
        return "["+x+","+y+"]";
    }
}

public class Exercise7_23 {

    static double sumArea(Shape2[] arr) {
        double sum = 0;
        //총 면적의 합 구해서 저장
        for(int i=0; i < arr.length;i++)
            sum+= arr[i].calcArea();
        return sum;
    }
    public static void main(String[] args)
    {
        Shape2[] arr = {new Circle2(5.0), new Rect2(3,4), new Circle2(1)};
        System.out.println("면적의 합:"+sumArea(arr));
    }
}
