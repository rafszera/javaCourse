package javaIntermediate.Generics;

import java.util.ArrayList;
import java.util.List;

public class BagNinja<T> {

    //Creating a Generic Array
    private List<T> items;
    //Constructor
    public BagNinja(){
        this.items = new ArrayList<>();
    }


    // Add items to array
    public void addItem(T item){
        items.add(item);

    }
    public void showItem(){
        for (T item : items){
            System.out.println(item);
        }
    }







}
