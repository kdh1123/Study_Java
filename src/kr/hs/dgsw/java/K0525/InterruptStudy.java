package kr.hs.dgsw.java.K0525;

public class InterruptStudy {
    public static class Child implements Runnable {
        @Override
        public void run() {
            System.out.println("자식 쓰레드가 시작되었습니다.");
            try{
                Thread.sleep(1000000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("자식 쓰레드가 종료되었습니다.");
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Child());
        thread.start();

        try{
            Thread.sleep(1500);
            System.out.println("부모가 자식을 깨웁니다.");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

