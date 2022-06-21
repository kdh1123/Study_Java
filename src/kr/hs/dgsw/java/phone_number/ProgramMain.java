package kr.hs.dgsw.java.phone_number;

import java.io.File;
import java.util.Scanner;

public class ProgramMain {
    String fun;
    Scanner scanner;
    File file;
    PhoneNum book;
    CommonFun cf;
    public ProgramMain(){
        file =  new File("C:\\\\Users\\\\DGSW\\\\Documents\\\\PhoneNum.txt");
        book = new PhoneNum(this.file);
        cf = new CommonFun();
        scanner = new Scanner(System.in);
    }
    public static void main(String[] args) {
        ProgramMain pm = new ProgramMain();
        System.out.println("** 전화번호부 프로그램입니다. **");
        System.out.println("사용하는 방법은 \"/명령어\"를 참고해주세요.");
        pm.execute();
        System.out.println("\n** 프로그램 종료 **");
    }
    public void execute(){
        while(true) {
            System.out.print("\n명령 대기 : ");
            fun = scanner.nextLine().trim();
            switch (fun) {
                case "/등록" -> book.insertPhoneNum();
                case "/전화번호 검색" -> book.searchUseNum();
                case "/이름 검색" -> book.searchUseName();
                case "/수정" -> book.updatePhoneNum();
                case "/삭제" -> book.deletePhoneNum();
                case "/목록" -> {
                    System.out.println("** " + cf.getList(file).size() + "개의 전화번호가 있습니다. **");
                    for (String item : cf.getList(file)) {
                        System.out.println(item);
                    }
                }
                case "/명령어" -> cf.commandHelp();
                case "/나가기" -> {
                    book.exit();
                    break;
                }
                default ->  System.out.println("사용 가능한 명령어가 아닙니다. \"/명령어\"로 올바른 명령어인지 확인해주세요.");
            }
        }
    }
}
