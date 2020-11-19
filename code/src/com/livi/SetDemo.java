package com.livi;

import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {

//        HashSet<String> set = new HashSet<String>();
        TreeSet<String> set = new TreeSet<String>();  // Data is unordered but alphabetically sorted

        set.add("Rob");
        set.add("Leo");
        set.add("Fabio");
        set.add("Dan");
        set.add("Mario");

        System.out.println(set);
        System.out.println("======");

        Iterator<String> itr = set.iterator();
        while(itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
        }

        set.remove("Dan");

        if(set.contains("Leo")) {
            System.out.println("Leo is in the set");
        }

        System.out.println("Set size is: " + set.size());

    }
}
