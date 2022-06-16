package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.collections4.MultiMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.*;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.dom4j.*;

import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.*;


public class Main2 {
    public static void main(String[] args) throws Exception {
        String telecom = null;
        //Map<String,ArrayList<String>> multivaluemap=new HashMap<String, ArrayList<String>>();

        String splits[];
        int length = 0;
        //List<File> swiftFiles = Get_Files.getSwiftFiles("C:\\Users\\st1\\Desktop\\電文檔資料夾");

        //int i=0;
        //for (File filelist : swiftFiles) {
            File f=new File("C:\\Users\\st1\\Desktop\\電文檔資料夾\\24151434.SWI");
            List<String> lines= Files.readAllLines(f.toPath());
            Scanner sc = new Scanner(f);
            System.out.println("=======Block1&Block2資訊=======");
            while (sc.hasNextLine()) {
                telecom=sc.nextLine();

                if(telecom.contains("{1:")||telecom.contains("{2:")){
                    decoder.splitswifts(telecom);
                }
            }
            block3.capture(lines);
            block4.capture(lines);
            block5.capture(lines);

            //System.out.println("總共行數為: "+telecom.length());
        /*
        for (int i = 0; i < list.size(); i++) {
            System.out.println("銀行代號: "+list.get(i)+",電文號碼: MT"+list2.get(i));
        }
        */
        /*

        */
        /*
        for (int i = 0; i < list.size(); i++) {
            System.out.print("銀行代號: "+list.get(i)+" ");
        }
        */

        /*

        }
        */

        /*
        for(String out: map.keySet()){
            System.out.println("銀行名: "+out+", 電文編號: "+map.get(out).toString()); //鍵值對列印
        }
        */


            //}
        /*
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        */

            //System.out.println(sc.nextLine());
            //telecom = sc.nextLine();
            //System.out.println(telecom);


        /*
        public static void SwiftIdentify(;){
            //ArrayList<String> list2 = new ArrayList<String>();
            //ArrayList<String> list1 = new ArrayList<String>();
            if (content.contains("{1:")) {
                int num = content.indexOf("{1:");
                bank_name = content.substring(num + 6, num + 10);
                list.add(bank_name);
                //System.out.println(ans);
            }
            if (content.contains("{2:")) {
                int num2 = content.indexOf("{2:");
                message_num = content.substring(num2 + 4, num2 + 7);
                list2.add("MT" + message_num);
            }

            for (int i = 0; i < list.size(); i++) {
                System.out.print("銀行代號: " + list.get(i) + " ");
            }
            for (int i = 0; i < list2.size(); i++) {
                System.out.print("銀行代號: " + list2.get(i) + " ");
            }
        }
         */
        }
        /*
        System.out.println("銀行代號總數: "+list1.size());
        System.out.println("電文號碼總數: "+list2.size());
        map.put(list1.toString(),list2.toString());
        for (Map.Entry<String, String> entry : map.entries()) {
            System.out.println("銀行代號: "+entry.getKey());
            System.out.println("電文號碼: "+entry.getValue());
        }

        /*
        for (int i = 0; i < list1.size(); i++) {
            System.out.print("銀行代號: " + list1.get(i) + " ");
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.print("銀行代號: " + list2.get(i) + " ");
        }
        */
}
