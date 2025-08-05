package com.prep.prep.Collections;

import java.util.*;

public class Classes {
    public static void main(String [] args){
        System.out.println(Arrays.toString(args));

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println("List Size: " + list.size());

        list.forEach(System.out::println);

        List<String> linkedListList = new LinkedList<>();
        linkedListList.add("Hello");
        linkedListList.add("World");
        System.out.println("List Size: " + linkedListList.size());

        linkedListList.forEach(System.out::println);


        Set<String> set = new HashSet<>();
        set.add("Surya");
        set.add("Surya");
        System.out.println(set.toString());

        Set<String> stringLinkedHashSet= new LinkedHashSet<>();
        stringLinkedHashSet.add("Surya");
        stringLinkedHashSet.add("Surya");
        System.out.println(stringLinkedHashSet.toString());
    }

}
