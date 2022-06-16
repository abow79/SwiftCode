package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Get_Files {

    public static List<File> getSwiftFiles(String folder) throws Exception {
        List<File> result=new ArrayList<>();
        try {
            File directory = new File(folder);
            File[] listOfFile = directory.listFiles();
            if (listOfFile == null)
                throw new Exception("No File in directory");
            for (File f: listOfFile) {
                if(f.isFile()&&f.getAbsolutePath().toLowerCase().endsWith("swi")){
                    result.add(f);
                }
            }
        }catch (Exception e){
            System.out.println("Get Files Failed!");
        }
        return result;
    }
}
