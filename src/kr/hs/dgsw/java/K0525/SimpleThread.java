package kr.hs.dgsw.java.K0525;

public class SimpleThread extends Thread{
    private String name;

    public SimpleThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i=0; i< 10; i++){
            System.out.println(this.name + " : " + i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SimpleThread thread = new SimpleThread("Main");
        SimpleThread thread1 = new SimpleThread("1번");
        SimpleThread thread2 = new SimpleThread("2번");
        thread.start();
        thread1.start();
        thread2.start();
    }
}
