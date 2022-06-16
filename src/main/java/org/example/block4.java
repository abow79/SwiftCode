package org.example;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class block4 {

    public static void capture(List<String> lines){
        String splits[]=null;
        String content="";
        String content2="";
        int start;
        int end;
        for (String telecom:lines) {

            telecom=telecom.replaceAll("\\r\\n","");
            if(telecom.indexOf("\u0003\u0001",1)!=-1){
                telecom=telecom.replace("\u0003\u0001","\n");

            }
            content+=telecom;
        }
        splits=content.split("\n");
        System.out.println("");
        System.out.println("==========Block4資訊===========");
        for(String a:splits) {
            try {
                if (a.contains("{4:")) {
                    start = a.indexOf("{4:");
                    end = a.indexOf("-}", start);
                    content2 = a.substring(start, end + 2);
                    System.out.println("第4區Text Block的內容如下");
                    System.out.println(content2);
                }
            }catch (Exception e){
                System.out.println("block4 Capture Failed!");
                e.printStackTrace();
            }
        }

    }
}
