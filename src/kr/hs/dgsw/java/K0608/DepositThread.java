package kr.hs.dgsw.java.K0608;

public class DepositThread implements Runnable{
    private final String name;
    private final Bank bank;
    private final int amount;

    public DepositThread(String name,Bank bank, int amount){
        this.name = name;
        this.amount= amount;
        this.bank =bank;
    }
    @Override
    public void run(){

    }
}
