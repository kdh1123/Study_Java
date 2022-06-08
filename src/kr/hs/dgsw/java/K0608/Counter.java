package kr.hs.dgsw.java.K0608;

import javax.xml.stream.events.EndDocument;
import java.util.LinkedList;
import java.util.Queue;

public class Counter {
    private Queue<String> list = new LinkedList<String>();
    private void hireEngineers(){
        for(int i=0; i<10; i++){
            Enginner engineer = new Engineer(this);
            new Thread(engineer).start();
        }
    }

    public void acceptRequirement(String problem){
        list.add(problem);

        synchronized (this){
            this.notify();
        }
    }
    public String getProblem(){
        return list.poll();
    }


    public static void main(String[] args) throws Exception {
        Counter counter = new Counter();
        counter.hireEngineers();

        Thread.sleep(1000);
        counter.acceptRequirement("충전이 안 돼요.");

        Thread.sleep(200);
        counter.acceptRequirement("액정이 깨졌어요.");

        counter.acceptRequirement("핸드폰이 변기에 빠졌어요.");

    }
}
