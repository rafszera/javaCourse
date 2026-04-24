package javaIntermediate.Generics;

public class Main {
    static void main(String[] args) {

        BagNinja<Object> bagNinja = new BagNinja<>();

        bagNinja.addItem(new Kunai("Flaming Kunai", 10));
        bagNinja.showItem();







    }
}
