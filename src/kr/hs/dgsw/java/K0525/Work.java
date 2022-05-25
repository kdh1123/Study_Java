package kr.hs.dgsw.java.K0525;

public class Work {
    public void doWorking(Doer doer){
        doer.work();
        doer.play();
    }

    public static void main(String[] args) {
        Work work = new Work();
        Doer doer = null;
        Doer doctor = new Doctor();
        Doer student = new Student();

        doer = new Doer() {
            @Override
            public void work() {
                System.out.println("일하자!!!!!!!!!!!!!!!!");
            }

            @Override
            public void play() {
                System.out.println("놀자!!!!!!!!!!!!!!!!!!");
            }
        };

        work.doWorking(doer);
        work.doWorking(doctor);
        work.doWorking(student);
    }
}
