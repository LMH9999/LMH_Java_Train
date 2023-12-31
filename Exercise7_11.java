package com.mystudy.run.jungsuk;

//MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
//수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
//getter와 setter메서드를 추가하라.

//7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는
//기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
//메서드명 : gotoPrevChannel
//기 능 : 현재 채널을 이전 채널로 변경한다.
//반환타입 : 없음
//매개변수 : 없음

class MyTv3 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    //이전 채널을 저장할 변수 선언
    private int prevChannel;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    public void setVolume(int volume){
        if(volume > MAX_VOLUME || volume < MIN_VOLUME)
            return;
        this.volume = volume;
    }
    public int getVolume(){
        return volume;
    }
    public void setChannel(int channel){
        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
            return;

        //새로운 채널로 가기전의 채널을 저장함
        prevChannel = this.channel;

        this.channel = channel;
    }
    public int getChannel(){
        return channel;
    }

    public void gotoPrevChannel(){
        //채널 바꾸는 메소드에 이전 채널의 변수를 대입해서 바꿈
        setChannel(prevChannel);
    }
}
public class Exercise7_11 {
    public static void main(String args[]) {
        MyTv3 t = new MyTv3();
        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}
