package com.bjpowernode.jedis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");

       /* for (String item : list) {
            if ("2".equals(item)){
                list.remove(item);
            }
            System.out.println(item);
        }*/

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
            if ("1".equals(next)){
                iterator.remove();
            }
            System.out.println("-------------");
            System.out.println(next);
        }
    }
}
