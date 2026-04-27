package javaBasics.dataStructures.HashSetXTreeSetXLinkedHashSet;

import java.util.*;

public class Main {
    static void main(String[] args) {

        List<String> ninjaList = new ArrayList<>();


        ninjaList.add("Naruto Uzumaki");
        ninjaList.add("Minato Namikaze");
        ninjaList.add("Kushina Uzumaki");
        ninjaList.add("Hiruzen Sarutobi");
        ninjaList.add("Akamaru");
        ninjaList.add("Orochimaru");
        ninjaList.add("Konohamaru Sarutobi");
        ninjaList.add("Kushina Uzumaki");
        ninjaList.add("Naruto Uzumaki");
        ninjaList.add("Hiruzen Sarutobi");

        for (Object listNinjas : ninjaList){
            System.out.println(listNinjas);
        }


        System.out.println("===============================================================");
        Set<String> ninjaSet = new HashSet<>(ninjaList);
        System.out.println("Printing list without duplicates: " + ninjaSet);

        System.out.println("===============================================================");
        Set<String> ninjaTSet = new TreeSet<>(ninjaList);
        System.out.println("Printing list without duplicates in alphabetical order:" + ninjaTSet);

        System.out.println("===============================================================");
        Set<String> ninjaLHSet = new LinkedHashSet<>(ninjaList);
        System.out.println("Printing list without duplicates in creation order:" + ninjaLHSet);











    }
}
