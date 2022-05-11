package kr.hs.dgsw.java.K0511;

import java.io.File;

public class CommandCd extends AbstractCommand {

    public CommandCd(File currentDirectory, String commandLine) {
        super(currentDirectory, commandLine);
    }

    @Override
    public File executeCommand() {
        String newDir = commandLine.substring(commandLine.lastIndexOf(" ")+1);
        String path = currentDirectory.getAbsolutePath();

        if(newDir.equals("..")){
           try{
               String str = path.substring(path.lastIndexOf("\\")+1);
               System.out.println(str);
               return new File(path.replace(str,""));
           }catch (Exception e){
               return currentDirectory;
           }
        }
        else{
            File file = new File(path + "\\"+ newDir);
            if(file.exists()){
                return file;
            }
            else{
                return currentDirectory;
            }
        }
    }
}