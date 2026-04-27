package javaBasics.dataStructures.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {
    static void main(String[] args) {
        List<String> ninjaList = new ArrayList<>();


        ninjaList.add("Naruto Uzumaki");
        ninjaList.add("Minato Namikaze");
        ninjaList.add("Kushina Uzumaki");
        ninjaList.add("Hiruzen Sarutobi");
        ninjaList.add("Orochimaru");
        ninjaList.add("Konohamaru Sarutobi");
        System.out.println(ninjaList);

        ninjaList.set(3, "Jiraiya");
        ninjaList.set(4, "Kakashi Hatake");
        ninjaList.remove(5);
        ninjaList.add("Hinata Hyuga");
        ninjaList.add("Boruto Uzumaki");
        System.out.println("Naruto's Family: " + ninjaList);
        System.out.println();
        ninjaList.add(1, "Nagato");
        System.out.println("Index 3 is: " +ninjaList.get(3));
        System.out.println("Hinata index is: " + ninjaList.indexOf("Hinata Hyuga"));
        for(Object list : ninjaList){
            System.out.println(list);
        }













    }
}
