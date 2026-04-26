package javaBasics.dataStructures.Queue;


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static void main(String[] args) {

        Queue<String> ninjaQueue = new LinkedList<>();
        ninjaQueue.add("Naruto");
        ninjaQueue.add("Sasuke");
        ninjaQueue.add("Kakashi");

        // Show Queue
        System.out.println("Ninjas in queue: " + ninjaQueue);

        // Poll: Remove item from Queue -- remove the 'head', the first one in queue
        ninjaQueue.poll();
        System.out.println("Ninjas in queue after poll: " + ninjaQueue);

        // Peek: Show the first one in the Queue
        String ninjaPeek = ninjaQueue.peek();
        System.out.println("First one: " + ninjaPeek);

        // Delete loop then verify if its empty

        while(!ninjaQueue.isEmpty()) {
            System.out.println("Deleting.. " + ninjaQueue.poll());
        }

        if (ninjaQueue.isEmpty()){
            System.out.println("There is no one left in the Queue");
        }






























    }


}
