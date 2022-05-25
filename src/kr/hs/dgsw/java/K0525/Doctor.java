package kr.hs.dgsw.java.K0525;

public class Doctor  implements Doer{
    @Override
    public void play() {
        System.out.println("커피를 마신다!!!!!!!!!!!!!");
    }

    @Override
    public void work() {
        System.out.println("수술이다!!!!!!!!!!!!!!!!!!");
    }
}
