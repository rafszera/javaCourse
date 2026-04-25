package javaBasics.dataStructures.Stack;

import java.util.Stack;

public class Main {
    static void main(String[] args) {

        Stack<String> ninjaStack = new Stack<>();

        ninjaStack.add("Naruto");
        ninjaStack.push("Minato");
        System.out.println(ninjaStack);
        String stackPeek = ninjaStack.peek();
        System.out.println(stackPeek);
        int stackSize = ninjaStack.size();
        System.out.println(stackSize);
        ninjaStack.push("Itachi");
        ninjaStack.push("Nagato");
        System.out.println("Current Stack: " + ninjaStack);
        ninjaStack.pop();
        System.out.println("Stack after pop: " + ninjaStack);


    }

}
