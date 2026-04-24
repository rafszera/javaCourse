package javaIntermediate.Lists;

import java.util.ArrayList;
import java.util.List;

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









    }
}
