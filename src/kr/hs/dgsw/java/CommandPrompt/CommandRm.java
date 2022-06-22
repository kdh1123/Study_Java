package kr.hs.dgsw.java.CommandPrompt;

import java.io.File;

public class CommandRm extends AbstractCommand {

    public CommandRm(File currentDirectory, String commandLine) {
        super(currentDirectory, commandLine);
    }

    @Override
    public File executeCommand() {
        String newDir = commandLine.substring(commandLine.lastIndexOf(" ")+1);
        String path = currentDirectory.getAbsolutePath();
            File file = new File(path + "\\"+ newDir);
            try{
                file.delete();
            }catch (Exception e){
                System.out.println("존재하지 않는 파일입니다.");
            }
            return currentDirectory;
    }
}
