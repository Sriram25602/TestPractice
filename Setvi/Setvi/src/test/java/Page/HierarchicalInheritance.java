package Page;



// A parent class has two child class

public class HierarchicalInheritance {

    public static void main (String[] args){
        Daughter Sree = new Daughter();
        System.out.println(Sree.gender);
        Sree.methodH();

        SonH Ram = new SonH();
        System.out.println(Ram.gender);
        Ram.methodH();
    }

}

class Parent {
     String gender = "Male";

     void methodH(){
         System.out.println("This is from parent class");
    }
}

 class Daughter extends Parent {

    String gender = "Female";
}

class SonH extends Parent{

}