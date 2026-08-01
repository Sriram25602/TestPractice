package Page;



// Interface class - Use "Interface" keyword instead of "Class"
// It can contains only abstract class which don't have defenition
// We have to use "Implements" keyword instead of "Extends" to inherit to another class
// Interface is the only way to implement multiple inheritance ( One child class has two parent class)
// Because two parent classes methods don't have defenition (So it won't be confused to which parent's method will be call)


public class Interface {

    public static void main(String[] arge){
        callInterface obj = new callInterface();
        obj.methodOne();
        obj.methodTwo();

    }

}

interface FatherOne {

    abstract void methodOne(); // interface class contains only abstract class

    abstract void methodTwo();
}

interface MotherOne {

    abstract void methodOne(); // interface class contains only abstract class

    abstract void methodTwo();
}

 class callInterface implements FatherOne, MotherOne { // Multiple inheritance


     public void methodOne() {

         System.out.println("methodOne");
     }

     public void methodTwo() {
         System.out.println("methodTwo");

     }

 }