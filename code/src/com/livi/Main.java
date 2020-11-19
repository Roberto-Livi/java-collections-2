package com.livi;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<String>();
        ArrayList listTwo = new ArrayList();

        listOne.add("Rob");
        listOne.add("Tommy");
        listOne.add("John");
        listOne.add("Dan");
        listOne.add("Stan");

        listTwo.add("Cory");
        listTwo.add(100);
        listTwo.add(4.5);
        listTwo.add('Z');

        // Updating an element
        listOne.set(2, "Tanner");
        System.out.println(listOne);
        System.out.println("==============");

        // Get an element from a list
        String name = listOne.get(1);
        System.out.println("My name is " + name);
        System.out.println("===============");

        // Removing an element from a list
        listOne.remove(4);
        System.out.println("After removing an element, the list now contains " + listOne);
        System.out.println("=================");

        // To remove every element from a list
//        listTwo.clear();

        // Contains method
        if(listOne.contains("Tanner")) {
            System.out.println("This list contains Tanner");
        }
        else {
            System.out.println("No Tanner here");
        }

        System.out.println("Iterating with a for loop");
        for(int i = 0; i < listOne.size(); i++) {
            System.out.println(listOne.get(i));
        }

        System.out.println("====================");

        System.out.println("Iterating with Iterator");
        Iterator<String> itr = listOne.iterator();

        System.out.println(itr.next());
        System.out.println(itr.next());

        while(itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
            if(str.equals("Jack")) {
                itr.remove();
            }
        }

        System.out.println("====================");





    }

}
