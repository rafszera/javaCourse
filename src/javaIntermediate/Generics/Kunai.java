package javaIntermediate.Generics;

public class Kunai {

    private int size;
    private String name;

    public Kunai(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Kunai: " + name + ", size: " + size;
    }
}
