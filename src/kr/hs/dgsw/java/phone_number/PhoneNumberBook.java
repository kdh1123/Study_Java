package kr.hs.dgsw.java.phone_number;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberBook {
    String name;
    String phoneNum;
    String fun;
    File file = new File("C:\\Users\\DGSW\\Documents\\PhoneNum.txt");
    public Scanner scanner = new Scanner(System.in);

    public void execute(){
        while(true){
            System.out.print("\n명령 대기 : ");
            fun = scanner.nextLine();
            if(fun.startsWith("/")){
                if(fun.equals("/등록")) insertPhoneNum();
                else if(fun.equals("/전화번호 검색")) searchUseNum();
                else if(fun.equals("/이름 검색")) searchUseName();
                else if(fun.equals("/수정")) updatePhoneNum();
                else if(fun.equals("/삭제")) deletePhoneNum();
                else if(fun.equals("/목록")) {
                    System.out.println("** " + getList().size() + "개의 전화번호가 있습니다. **");
                    for(String item: getList()){
                        System.out.println(item);
                    }
                }
                else if(fun.equals("/명령어")) {
                    System.out.println("** 명령어 목록 **");
                    System.out.println(
                            "/등록 : 이름과 전화번호를 입력해서 저장합니다.\n" +
                                    "/전화번호 검색 : 전화번호를 입력해 해당하는 전화번호를 검색합니다.\n" +
                                    "/이름 검색 : 이름을 입력해 해당하는 전화번호를 검색합니다.\n"+
                                    "/수정 : 선택한 인물의 전화번호를 수정합니다.\n" +
                                    "/삭제 : 이름을 입력해 전화번호를 삭제합니다.\n" +
                                    "/목록 : 저장된 전화번로 목록을 불러옵니다.\n" +
                                    "/나가기 : 프로그램을 종료합니다.");
                }
                else if(fun.equals("/나가기")) {
                    exit();
                    break;
                }
                else System.out.println("사용 가능한 명령어가 아닙니다. \"/명령어\"로 올바른 명령어인지 확인해주세요.");
            }
            else{
                System.out.println(fun+" 라고 입력하셨습니다.");
            }
        }
    }
    public void insertPhoneNum(){
        FileWriter writer = null;
        try {
            writer = new FileWriter(file,true);
            System.out.print("이름을 입력해주세요 : ");
            name = scanner.nextLine();
            System.out.print("전화번호를 입력해주세요 (하이픈 '-' 포함): ");
            phoneNum = scanner.nextLine();
            while(true){
                if(Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$",phoneNum)) break;
                System.out.print("전화번호를 다시 입력해주세요 (하이픈 '-' 포함): ");
                phoneNum = scanner.nextLine();
            }
            writer.write(name+"/"+phoneNum+"\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void searchUseName(){
        List<String> list = getList();
        System.out.print("이름을 입력해주세요 : ");
        name = scanner.nextLine();
        System.out.println("** 검색 결과 **");
        for(String item:list){
            if(item.contains(name)) System.out.println(item);
        }

    }
    public void searchUseNum(){
        List<String> list = getList();
        System.out.print("전화번호를 입력해주세요 : ");
        phoneNum = scanner.nextLine();
        System.out.println("** 검색 결과 **");
        for(String item:list){
            if(item.contains(phoneNum)) System.out.println(item);
        }
    }
    public void deletePhoneNum(){
        List<String> list = getList();
        try {
            FileWriter writer = new FileWriter(file, false);
            int index;
            System.out.println("** 전화번호 목록 **");
            index = 0;
            for (String item : list) {
                System.out.println("순번 " + index++ + ":" + item);
            }
            System.out.print("삭제할 전화번호의 순번을 입력해주세요 : ");
            index = scanner.nextInt();
            System.out.println(list.get(index)+" 를 삭제하겠습니다.");
            list.remove(index);

            for(String item:list){
                writer.write(item+"\n");
                writer.flush();
            }
            System.out.println("** 삭제 완료 **");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void updatePhoneNum(){
        List<String> list = getList();
        try {
            FileWriter writer = new FileWriter(file, false);
            int index;
            System.out.println("** 전화번호 목록 **");
            index = 0;
            for (String item : list) {
                System.out.println("순번 " + index++ + ":" + item);
            }
            System.out.print("수정할 전화번호의 순번을 입력해주세요 : ");
            index = (Integer.parseInt(scanner.nextLine()) <= index && Integer.parseInt(scanner.nextLine()) >= 0)?Integer.parseInt(scanner.nextLine()):-1;
            System.out.print("새로운 이름을 입력해주세요 : ");
            name = scanner.nextLine();
            System.out.print("새로운 전화번호를 입력해주세요 : ");
            phoneNum = scanner.nextLine();
            while(true){
                if(Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$",phoneNum)) break;
                System.out.print("전화번호를 다시 입력해주세요 (하이픈 '-' 포함): ");
                phoneNum = scanner.nextLine();
            }
            list.remove(index);
            list.add(index,name+"/"+phoneNum);

            for(String item:list){
                writer.write(item+"\n");
                writer.flush();
            }
            System.out.println("** 수정 완료 **");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exit(){
        scanner.close();
    }

    public List<String> getList(){
        List<String> list = new ArrayList<String>();
        String str;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            while((str = reader.readLine()) != null){
                list.add(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        Collections.sort(list);
        return list;
    }
    public static void main(String[] args) {
        PhoneNumberBook book = new PhoneNumberBook();
        System.out.println("** 전화번호부 프로그램입니다. **");
        System.out.println("사용하는 방법은 \"/명령어\"를 참고해주세요.");
        book.execute();
        System.out.println("\n** 프로그램 종료 **");
    }
}
