package org.example;

import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

import java.util.ArrayList;
import java.util.Map;

public class decoder {
    public static void splitswifts(String telecom) {
        MultiValuedMap<String,String> map=new ArrayListValuedHashMap<>();
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        String bank_name;
        String message_num;
        if (telecom.contains("{1:")) {
            int num = telecom.indexOf("{1:");
            bank_name = telecom.substring(num + 6, num + 10);
            list.add(bank_name);
            //System.out.println(ans);
        }
        if (telecom.contains("{2:")) {
            int num2 = telecom.indexOf("{2:");
            message_num = telecom.substring(num2 + 4, num2 + 7);
            list2.add("MT" + message_num);
        }
        /*
        for (int i = 0; i < list.size(); i++) {
            System.out.print("銀行代號: " + list.get(i) + " ");
        }
        for (int i = 0; i < list2.size(); i++) {
            System.out.print("銀行代號: " + list2.get(i) + " ");
        }
        System.out.println(list);
        System.out.println(list2);
        */

        map.put(list.toString(),list2.toString());
        for(Map.Entry<String,String> entry: map.entries()){
            System.out.print("銀行代號: "+entry.getKey()+" ");
            System.out.println("電文號碼: "+entry.getValue());
        }



    }
}
