package kr.hs.dgsw.java.CommandPrompt;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandLs extends AbstractCommand {

    public CommandLs(File currentDirectory, String commandLine) {
        super(currentDirectory, commandLine);
    }

    @Override
    public File executeCommand() {
        File dir = new File(currentDirectory.getAbsolutePath());
        File[] listFiles = dir.listFiles();

        for(File file : listFiles){
            if(file.isDirectory()) {
                System.out.printf(formatDate(makeData(file.lastModified())) + " " + " <Dir>" + "   %5s   "+file.getName()+"\n","");
            }
            else if(file.isFile()) {
                long val = file.length();
                String len;
                len = val + " B";
                if(val > 1024){
                    val /= 1024;
                    len = val+"KB";
                }
                if(val > 1024){
                    val /= 1024;
                    len = val+"MB";
                }
                if(val > 1024){
                    val /= 1024;
                    len = val+"GB";
                }
                System.out.printf(formatDate(makeData(file.lastModified())) + " " + "      " + "   %5s   " + file.getName()+"\n",len);
            }
        }
        return currentDirectory;
    }
    public Date makeData(long  unixTime){
        return new Date(unixTime);
    }

    public String formatDate(Date date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return dateFormat.format(date);
    }

}