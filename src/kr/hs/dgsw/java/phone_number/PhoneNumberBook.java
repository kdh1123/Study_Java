package kr.hs.dgsw.java.phone_number;

import kr.hs.dgsw.java.K0504.FileWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class PhoneNumberBook {
    String name;
    String phoneNum;
    String[] phoneNumArr;
    public Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        PhoneNumberBook book = new PhoneNumberBook();
    }
    public void savePhoneNum(){
        FileWriter writer = new FileWriter("C:\\Users\\DGSW\\Documents\\PhoneNum.txt");
        System.out.print("이름을 입력해주세요 : ");
        name = scanner.next();
        System.out.print("전화번호를 입력해주세요 (하이픈 '-' 포함): ");
        phoneNum = scanner.nextLine();
        phoneNum = phoneNum.trim();
        phoneNumArr = phoneNum.split("-");
        
        writer.write();
    }
    public void searchUseName(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DGSW\\Documents\\PhoneNum.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void searchUseNum(){

    }
    public void deletePhoneNum(){

    }
    public void updatePhoneNum(){

    }
}
