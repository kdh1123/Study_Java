package kr.hs.dgsw.java.K0525;

import java.util.Scanner;

public class AdderWithThread {
    private final Scanner scanner;

    public AdderWithThread(){
        this.scanner = new Scanner(System.in);
    }
    public void execute(){
        while(true){
            System.out.println("두 정수를 입력하세요");
            int value1 = scanner.nextInt();
            int value2 = scanner.nextInt();
            if(value1 == 0 && value2 == 0) break;

            CalculatorThread calculator =
                    new CalculatorThread(value1,value2);
            Thread thread = new Thread(calculator);
            
        }
        System.out.println("프로그램을 종료합니다.");
    }

    public static class CalculatorThread implements Runnable {
        private  int value1;
        private int value2;

        public CalculatorThread(int value1,int value2){
            this.value1 = value1;
            this.value2 = value2;
        }

        @Override
        public void run() {
            try{
                Thread.sleep(15000L);
            }catch ( InterruptedException e){
                e.printStackTrace();
            }
        }
    }

}
