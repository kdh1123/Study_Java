package kr.hs.dgsw.java.K0518;

import java.io.IOException;

public class MyClass {
    public void method1() throws Exception,IOException{
        System.out.println("method1 호출됨");
        method2();
    }
    public void method2() throws Exception, IOException{
        System.out.println("method2 호출됨");
        method3();
    }
    public void method3() throws IOException, MyException{
        System.out.println("method3 호출됨");

        //예외 생성
        IOException e = new IOException();
        throw e;
    }

    public static void main(String[] args) {
        try{
            MyClass myClass = new MyClass();
            myClass.method1();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
