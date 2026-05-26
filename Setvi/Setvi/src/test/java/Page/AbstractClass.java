package Page;


// Abstract class - Cannot be create object directly and call it's methods. So we extend it to another class and call it.
// A abstract class contains minimum one abstract method. and it allows normal method also.
// Abstract method - It shouldn't have defenition. We have to add defenition(Overrid) for it on inherit class.

public class AbstractClass {

    public static void main(String[] args) {

        One objOne = new One();
        objOne.abstractMethodOne();
        objOne.abstractMethodTwo();
        objOne.normalMethod();

        Two objTwo = new Two();
        objTwo.abstractMethodOne();
        objTwo.abstractMethodTwo();
        objTwo.normalMethod();

    }

}

abstract class AbstractAbstractClass {

    abstract void abstractMethodOne();

    abstract void abstractMethodTwo();

    void normalMethod(){
        System.out.println("AbstractAbstractClass.normalMethod");
    }

    }

    class One extends AbstractAbstractClass {

       void abstractMethodOne() {
           System.out.println("This is from class one");
       }

       void abstractMethodTwo() {
           System.out.println("This is from class One");
       }

    }

    class Two extends AbstractAbstractClass {

       void abstractMethodOne(){
           System.out.println("This is from class Two");
       }

        void abstractMethodTwo() {
            System.out.println("This is from class two");
        }
    }

