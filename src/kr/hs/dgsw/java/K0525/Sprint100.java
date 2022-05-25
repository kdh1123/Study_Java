package kr.hs.dgsw.java.K0525;

public class Sprint100 implements Runnable{
    private final String name;

    private final double record;

    public Sprint100(String name, double record){
        this.name = name;
        this.record = record;

    }

    @Override
    public void run() {
        int time = 0;
        while(true){
            double distance = time * (100 / record);
            System.out.println(name+" 선수는 "+time+"초에 "+distance+"M를 달렸습니다.");

            if(distance > 100){
                break;
            }

            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){e.printStackTrace();}
            time++;
        }
        System.out.println(name+"선수가 달리기를 마쳤습니다.");
    }

    public static void main(String[] args) {

        Sprint100 run1 = new Sprint100("우사인 볼트",9.58);
        Sprint100 run2 = new Sprint100("일반인",15);
        Thread bolt = new Thread(run1);
        Thread foo = new Thread(run2);

        bolt.start();
        foo.start();
    }
}
