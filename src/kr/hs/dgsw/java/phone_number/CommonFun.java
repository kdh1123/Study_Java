package kr.hs.dgsw.java.phone_number;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CommonFun {
    public void commandHelp(){
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
    public List<String> getList(File file){
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
    public boolean checkDuplicate(List<String> list, String num){
        for(String item:list){
            if(item.substring(item.lastIndexOf("/")+1).equals(num)){
                return  false;
            }
        }
        return true;
    }
}
