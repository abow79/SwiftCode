package org.example;

import java.io.File;
import java.nio.file.Files;
import java.util.*;
import java.util.regex.Pattern;

public class IO {
    static final String hashLinePatternString = "^#$";
    static final Pattern hashlinePattern=Pattern.compile(hashLinePatternString,Pattern.MULTILINE);  //這邊是指比對多行文字
    public static List<File> getSwiftFiles(String Folder)
    {
        List<File> resultlist=new ArrayList<>();
        try {
            File folder =new File(Folder);
            File[] listOfFiles=folder.listFiles();
            if(listOfFiles==null)
                throw new Exception("listOfFiles is null");
            for(File file: listOfFiles){
                if(file.isFile() && file.getAbsolutePath().toLowerCase().endsWith(".swi")){
                    resultlist.add(file);
                }
            }
        }catch (Exception e){
            System.out.println("getSwiftFiles Failed");
        }
        return resultlist;
    }
    public static void main(String[] args){
        List<File> swiftFiles=getSwiftFiles("C:\\Users\\st1\\Desktop\\電文檔資料夾");
        for (File file:swiftFiles) {
            System.out.println("---------------------------");
            System.out.println(file.getName());
            System.out.println("---------------------------");
            String content="";
            try {
                List<String> lines= Files.readAllLines(file.toPath());
                lines.removeIf(s -> hashlinePattern.matcher(s).matches());  //matcher= 方法指定要比對的字串,matches=比對是否存在
                content=String.join("\n",lines);
            }catch (Exception e){
                System.out.println(file.getName()+"Failed");
                System.out.println(e.getMessage());
            }
            splitSwift(content);
        }


        //System.out.println(swiftFiles.toString());
    }

    private static void splitSwift(String content) {
        if(content.indexOf("\u0001",1)!=-1){    //不存在的的話等於-1,!=-1代表如果有的話

        }
    }
}
