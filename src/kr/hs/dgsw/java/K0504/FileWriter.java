package kr.hs.dgsw.java.K0504;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class FileWriter  implements Writer{
    public final String path;

    public FileWriter(String path){
        this.path = path;
    }


    @Override
    public void write(String value) {
        try {
            File file = new File(this.path);
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            fileOutputStream.write(value.getBytes("UTF-8"));

            fileOutputStream.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
