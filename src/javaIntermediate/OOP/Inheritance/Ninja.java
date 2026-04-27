package javaIntermediate.OOP.Inheritance;

class Ninja {

    String name;
    String village;
    int age;



    /*
     * void method don`t return value
     * */
        /*
     * string method must return a string
     * */
    public String myname() {
        return "Hi, im " + name;
    }



    /*
    * int method must return a int
    * */
  public int ageToHokage(int hokageMinimumAge){
        return hokageMinimumAge - age;
  }


}



