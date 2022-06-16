package org.example;

import java.util.List;

public class block5 {
    public static void capture(List<String> lines) {
        System.out.println("");
        System.out.println("==========Block5資訊===========");
        for (String content : lines) {
            if (content.contains("{5:")) {
                int start = content.indexOf("{5:");
                int end = content.indexOf("}}", start);
                content = content.substring(start, end+2);
                System.out.println("第5區User Header Block的內容如下");
                System.out.println(content);
            }

        }
    }
}

