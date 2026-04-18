package javaIntermediate.Polymorphism;

 class Uchiha extends Ninja{
    void activateSharingan(){
        System.out.println(name + "... SHARINGAN !!!!");
    }


    @Override
    void specialAbility(){
        System.out.println("My name is " + name + " and this is my special Uchiha fire ability");
    }
}
