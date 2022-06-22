package kr.hs.dgsw.java.K0511;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FileStudy {
    public void studyFileData() throws Exception{
        File file1 = new File("C:/Users/DGSW/Documents/GitHub/Study_Java/sample.txt");
        File file2 = new File("C:/Users/DGSW/Documents/GitHub/Study_Java/void.txt");
        File file3 = new File("C:/Users/DGSW/Documents/GitHub/Study_Java");

        /*파일의 존재 여부*/
        boolean exist = false;
        System.out.println();
        System.out.println("파일의 존재 여부 확인");
        System.out.println(file1.getName() + " " + file1.exists());
        System.out.println(file2.getName() + " " + file2.exists());
        System.out.println(file3.getName() + " " + file3.exists());

        /*파일의 경로*/
        String path = file1.getPath();
        String absolutePath = file1.getAbsolutePath();
        String canonicalPath = file1.getCanonicalPath();
        System.out.println();
        System.out.println("파일의 경로");
        System.out.println(file1.getName());
        System.out.println(" path : " + path);
        System.out.println(" absolutepath : " + absolutePath);
        System.out.println(" canonicalpath : " + canonicalPath);

        /*파일의 크기*/
        long  size = file1.length();
        System.out.println();
        System.out.println("파일의 크기 확인");
        System.out.println(file1.getName() + " " + size);
        System.out.println(file2.getName() + " " + file2.length());
        System.out.println(file3.getName() + " " + file3.length());


        /*수정된 시각*/
        long modifiedTime = file1.lastModified();
        Date date = makeData(modifiedTime);
        System.out.println();
        System.out.println("파일의 마지막 수정시간");
        System.out.println(file1.getName() + " " + formatDate(date));
        System.out.println(file2.getName() + " " + makeData(file2.lastModified()));
        System.out.println(file3.getName() + " " + makeData(file3.lastModified()));

        /* 파일과 디렉토리 구분 */
        boolean bFile = file1.isFile();
        boolean bDir = file1.isDirectory();
        System.out.println();
        System.out.println("파일, 디렉토리 구분");
        System.out.println(file1.getName() + " " + bFile + " " + bDir);
        System.out.println(file2.getName() + " " + file2.isFile() + " " + file2.isDirectory());
        System.out.println(file3.getName() + " " + file3.isFile() + " " + file3.isDirectory());

    }

    public void studyManage() throws Exception {
        File file = new File("C:/Users/DGSW/Documents/GitHub/Study_Java/hello.txt");

        /*파일 만들기*/
        boolean created = file.createNewFile();
        System.out.println();
        System.out.println("파일 만들기");
        System.out.println(file.getName() + " " + created);

        /*파일 삭제하기*/
        boolean deleted = file.delete();
        System.out.println();
        System.out.println("파일 삭제하기");
        System.out.println(file.getName() + " " + deleted);

        /*파일 이름 바꾸기*/
        File file1= new File("C:/Users/DGSW/Documents/GitHub/Study_Java/sample.txt");
        File newFile= new File("C:/Users/DGSW/Documents/GitHub/Study_Java/second.txt");
        boolean renamed = file1.renameTo(newFile);
        System.out.println();
        System.out.println("파일 이름바꾸기");
        System.out.println(file1.getName() + " " + renamed);

    }


    public void studyDirectory(){
        /* 디렉토리 만들기 */
        File dir = new File("C:/Users/DGSW/Documents/GitHub/Study_Java/child");
        boolean created = dir.mkdir();
        System.out.println();
        System.out.println("디렉토리 만들기");
        System.out.println(dir.getName()+" "+created);

        /*디렉토리 삭제하기 */
        boolean deleted = dir.delete();
        System.out.println();
        System.out.println("디렉토리 삭제하기");
        System.out.println(dir.getName()+" "+deleted);

        /* 디렉토리 만들기 2 */
        File dir2 = new File("C:/Users/DGSW/Documents/GitHub/Study_Java/sub/images");
        dir2.mkdir();
        System.out.println();
        System.out.println("디렉토리 만들기 2");
        System.out.println(dir2.getName()+" "+created);

    }

    public void studyList(){
        File dir = new File("C:/");

        String[] list = dir.list();
        File[] listFiles = dir.listFiles();

        /*for (String item: list){
            System.out.println(list);
        }*/

        for(File file : listFiles){
            System.out.println(file.getName());
        }
    }

    public void inputFileName() throws  Exception{
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        File file = new File("C:/Users/DGSW/Documents/GitHub/Study_Java/"+name);
        boolean created = file.createNewFile();
        System.out.println(file.getName()+" "+created);
    }
    public Date makeData(long  unixTime){
        return new Date(unixTime);
    }

    public String formatDate(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(date);
    }

    public static void main(String[] args) throws Exception{
        FileStudy fileStudy = new FileStudy();
        //fileStudy.studyFileData();
        //fileStudy.studyManage();
        //fileStudy.inputFileName();
        //fileStudy.studyDirectory();
        fileStudy.studyList();
    }
}
