package kr.hs.dgsw.java.CommandPrompt;

import java.io.File;
import java.util.Scanner;

public class CommandRm extends AbstractCommand {

    public CommandRm(File currentDirectory, String commandLine) {
        super(currentDirectory, commandLine);
    }

    @Override
    public File executeCommand() {
        String newDir = commandLine.substring(commandLine.lastIndexOf(" ")+1);
        String path = currentDirectory.getAbsolutePath();
        Scanner scanner = new Scanner(System.in);
            File file = new File(path + "\\"+ newDir);
            try{
                if(file.exists()){
                    System.out.println("정말 삭제하시겠습니까? Y/N : ");
                    if(scanner.nextLine().trim().equals("Y")) {
                        if (file.delete()) {
                            System.out.println("삭제를 성공하였습니다.");
                        } else {
                            System.out.println("삭제를 실패하였습니다.");
                        }
                    }else{
                        System.out.println("삭제를 취소하셨습니다.");
                    }
                }
            }catch (Exception e){
                System.out.println("존재하지 않는 파일입니다.");
            }
            return currentDirectory;
    }
}
