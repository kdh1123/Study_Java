package kr.hs.dgsw.java.phone_number;

import kr.hs.dgsw.java.K0504.FileWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PhoneNumberBook {
    String name;
    String phoneNum;
    String[] phoneNumArr;
    public Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        PhoneNumberBook book = new PhoneNumberBook();
        System.out.println("** 전화번호부 프로그램입니다. **");
        System.out.println("사용하는 방법은 \"/명령어\"를 참고해주세요.");
        String fun;
        while(true){
            System.out.print("명령 대기 : ");
            fun = book.scanner.nextLine();
            if(fun.startsWith("/")){
                if(fun.equals("/전화번호 저장")) book.insertPhoneNum();
                else if(fun.equals("/전화번호로 검색")) book.searchUseNum();
                else if(fun.equals("/이름으로 검색")) book.searchUseName();
                else if(fun.equals("/전화번호 수정")) book.updatePhoneNum();
                else if(fun.equals("/전화번호 삭제")) book.deletePhoneNum();
                else if(fun.equals("/명령어")) {
                    System.out.println("** 명령어 목록 **");
                    System.out.println(
                            "/전화번호 저장 : 이름과 전화번호를 입력해서 저장합니다.\n" +
                            "/전화번호로 검색 : 전화번호를 입력해 해당하는 전화번호를 검색합니다.\n" +
                            "/이름으로 검색 : 이름을 입력해 해당하는 전화번호를 검색합니다.\n"+
                            "/전화번호 수정 : 선택한 인물의 전화번호를 수정합니다.\n" +
                            "/전화번호 삭제 : 이름을 입력해 전화번호를 삭제합니다.");
                }
                else System.out.println("사용 가능한 명령어가 아닙니다. \"/명령어\"로 올바른 명령어인지 확인해주세요.");
            }
            else{
                System.out.println("올바른 명령어 형식이 아닙니다. 확인해주세요.");
            }
        }
    }
    public void insertPhoneNum(){
        FileWriter writer = new FileWriter("C:\\Users\\DGSW\\Documents\\PhoneNum.txt");
        System.out.print("이름을 입력해주세요 : ");
        name = scanner.next();
        System.out.print("전화번호를 입력해주세요 (하이픈 '-' 포함): ");
        phoneNum = scanner.nextLine();
        phoneNum = phoneNum.trim();
        writer.write(name+"/"+phoneNum);
        System.out.println(getList());
    }
    public void searchUseName(){
        List<String> list = getList();
    }
    public void searchUseNum(){
        List<String> list = getList();
    }
    public void deletePhoneNum(){
        List<String> list = getList();
    }
    public void updatePhoneNum(){
        List<String> list = getList();
    }


    public List<String> getList(){
        List<String> list = null;
        String str;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DGSW\\Documents\\PhoneNum.txt"));
            while((str = reader.readLine()) != null){
                list.add(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }
}
