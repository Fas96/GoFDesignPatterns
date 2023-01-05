package org.code.behaviorial.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        System.out.println("Iterator Demo");
        String[] namesRepository = {"Robert" , "John" , "Julie" , "Lora"};
        for (Iterator iter = Arrays.stream(namesRepository).iterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
        System.out.println("============== Arrays.asList====================");
        List<String> names = Arrays.asList(namesRepository);
        for (Iterator<String> iter = names.iterator(); iter.hasNext(); ) {
            String name = iter.next();
            System.out.println("Name : " + name);
        }
        List<String> ll = new LinkedList<>();
        ll.addAll(names);
        System.out.println("============== LinkedList====================");
        for (Iterator<String> iter = ll.iterator(); iter.hasNext(); ) {
            String name = iter.next();
            System.out.println("Name : " + name);
        }


    }
}
