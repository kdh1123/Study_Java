package kr.hs.dgsw.java.K0608;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private final Map<String, Account> accountMap =
            new HashMap<String,Account>();

    public Account makeAccount(String name){
        Account account = new Account();
        account.setName(name);
        account.setBalance(0);

        accountMap.put(name,account);

        return account;
    }
    public synchronized void deposit(String name, long amount){
        System.out.println(name+"님이 "+amount+"원만큼 입금합니다.");

        Account account = accountMap.get(name);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if(account != null){
            synchronized (account) {
                long balance = account.getBalance();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance = balance + amount;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.setBalance(balance);
            }
        }
    }
    public  Account getAccount(String name){
        return accountMap.get(name);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        DepositThread self = new DepositThread("홍길동",bank,300000);
        new Thread(self).start();

        DepositThread parent = new DepositThread("홍길동",bank,300000);
        new Thread(parent).start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Account account = bank.getAccount("홍길동");
        System.out.println(account.getName()+"님의 계좌는 "+account.getBalance()+"원 입니다.");
    }
}
