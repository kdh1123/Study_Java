package kr.hs.dgsw.java.K0504;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReadStudy {
    public static void main(String[] args){
        try{
            File file = new File("C:\\hello.txt");
            FileInputStream is = new FileInputStream(file);

            byte[] buffer = new byte[1024];

            int index = 0;
            while(is.available() > 0){
                buffer[index++] = (byte)is.read();
            }
            String str = new String(buffer,0,index,"UTF-8");
            System.out.println(str);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
