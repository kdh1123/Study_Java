package kr.hs.dgsw.java.phone_number;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNum {
    String nameTemp;
    String numTemp;
    CommonFun cf;
    File file;
    public Scanner scanner;

    public PhoneNum(File file){
        cf = new CommonFun();
        this.file = new File("C:\\Users\\DGSW\\Documents\\PhoneNum.txt");
        scanner = new Scanner(System.in);
    }

    public void insertPhoneNum(){
        System.out.println("***********************************************");
        List<String> list = cf.getList(file);
        FileWriter writer = null;
        try {
            writer = new FileWriter(file,true);
            System.out.print("이름을 입력해주세요 : ");
            nameTemp = scanner.nextLine();
            System.out.print("전화번호를 입력해주세요 (하이픈 '-' 포함): ");
            numTemp = scanner.nextLine();
            while(true){
                if(Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", numTemp) && cf.checkDuplicate(list,numTemp)) break;
                System.out.print("전화번호 형식이 맞지 않거나, 중복되었습니다. 다시 입력해주세요(하이픈 '-' 포함): ");
                numTemp = scanner.nextLine();
            }
            writer.write(nameTemp +"/"+ numTemp +"\n");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("***********************************************");
    }
    public void searchUseName(){
        System.out.println("***********************************************");
        List<String> list = cf.getList(file);
        System.out.print("이름을 입력해주세요 : ");
        nameTemp = scanner.nextLine();
        System.out.println("** 검색 결과 **");
        for(String item:list){
            if(item.contains(nameTemp)) System.out.println(item);
        }
        System.out.println("***********************************************");
    }
    public void searchUseNum(){
        System.out.println("***********************************************");
        List<String> list = cf.getList(file);
        System.out.print("전화번호를 입력해주세요 : ");
        numTemp = scanner.nextLine();
        System.out.println("** 검색 결과 **");
        for(String item:list){
            if(item.contains(numTemp)) System.out.println(item);
        }
        System.out.println("***********************************************");
    }
    public void deletePhoneNum(){
        System.out.println("***********************************************");
        List<String> list = cf.getList(file);
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
        System.out.println("***********************************************");
    }
    public void updatePhoneNum(){
        System.out.println("***********************************************");
        List<String> list = cf.getList(file);
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
            nameTemp = scanner.nextLine();
            System.out.print("새로운 전화번호를 입력해주세요 : ");
            numTemp = scanner.nextLine();
            while(true){
                if(Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", numTemp) && cf.checkDuplicate(list,numTemp)) break;
                System.out.print("전화번호 형식이 맞지 않거나, 중복되었습니다. 다시 입력해주세요(하이픈 '-' 포함): ");
                numTemp = scanner.nextLine();
            }
            list.remove(index);
            list.add(index, nameTemp +"/"+ numTemp);

            for(String item:list){
                writer.write(item+"\n");
                writer.flush();
            }
            System.out.println("** 수정 완료 **");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("***********************************************");
    }

    public void exit(){
        scanner.close();
    }
}
