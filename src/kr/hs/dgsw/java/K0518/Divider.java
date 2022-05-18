package kr.hs.dgsw.java.K0518;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divider {
    private final Scanner scanner;
    public Divider(){
        this.scanner = new Scanner(System.in);

    }
    private int calculate(int v1, int v2){
        return v1 / v2;
    }
    public void execute(){
        try {
            System.out.println("두 정수를 입력하세요");

            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();

            int result = calculate(v1, v2);
            System.out.printf("%d / %d = %d\n", v1, v2, result);
            boolean saved = saveResult(v1,v2,result);
            System.out.println(saved);

            System.out.println("프로그램을 종료합니다.");
        }catch (InputMismatchException e){
            System.out.println("올바른 정수를 입력해주십시오");
        }catch (ArithmeticException e){
            System.out.println("0으로 나눠지지 않습니다.");
        }finally {
            scanner.close();
        }

        /*catch (Exception e) {
            System.out.println("오류");
            if(e instanceof InputMismatchException) System.out.println("올바른 정수를 입력해주십시오");
            if(e instanceof ArithmeticException){
                System.out.println("올바른 정수를 입력해주십시오");
            }
        }*/
    }

    public static final String FILE_PATH = "C:/Users/DGSW/Documents/GitHub/Study_Java/result.txt";

    private boolean saveResult(int v1, int v2, int result){
        OutputStream os = null;
        try {
            File file = new File(FILE_PATH);
            os = new FileOutputStream(file);

            String str = String.format("%d / %d = %d\n", v1, v2, result);
            os.write(str.getBytes());
            return true;

        }catch (IOException e){
            System.out.println("파일 저장에 실패했습니다.");
        }finally {
            System.out.println("saveResult의 Finally가 수행됨");
            try{
                os.close();
            } catch (IOException e1){}
        }
        return false;
    }

    public static void main(String[] args) {
        Divider divider = new Divider();
        divider.execute();
    }
}
