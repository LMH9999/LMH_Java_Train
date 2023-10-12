package com.mystudy.run.jungsuk;

//다음과 같은 실행결과를 얻도록 Student클래스에 생성자와 info()를 추가하기
//실행결과
//홍길동,1,1,100,60,76,236,78.7
public class Exercise6_5 {
    public static void main(String args[]) {
        Student2 s = new Student2("홍길동",1,1,100,60,76);
        System.out.println(s.info());
    }
}

class Student2 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    Student2(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal() {
        return kor+eng+math;
    }
    float getAverage() {
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }

    //여러 값을 스트링으로 변환해 한번에 리턴할수 있게 만듬
    public String info() {
        return name
                +","+ban
                +","+no
                +","+kor
                +","+eng
                +","+math
                +","+getTotal()
                +","+getAverage() ;
    }
}