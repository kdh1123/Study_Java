package kr.hs.dgsw.java.K0504;

public class WriterTester {

    public void calculate(int Value1, int Value2){
    }
    public static void main(String[] args){
        String value = "예외가 없는 법칙은 없다.";

        Writer simpleWriter = new SimpleWriter();
        simpleWriter.write(value);

        Writer fileWriter = new FileWriter("C:\\may.txt");
        fileWriter.write(value);
    }
}
