package kr.hs.dgsw.java.K0525;

public class Student implements Doer{
    @Override
    public void work() {
        System.out.println("공부를 한다!!!!!!!!!!");
    }

    @Override
    public void play() {
        System.out.println("축구를 한다!!!!!!!!!");
    }
}
