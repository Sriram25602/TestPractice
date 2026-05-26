package Page;



// A parent class has parent class (Grand Parent)

public class MultilevelInheritance {

    public static void main (String[] args){
        Son ram = new Son();
        System.out.println(ram.gender);
        ram.method();
    }
}

class GrandParent {

    String gender = "male";

    void method(){
        System.out.println("This is from Grandparent class");
    }
}

class Father extends GrandParent{

    char gender = 'M';

    void method(){
        System.out.println("This is from Father calss");
    }
}

class Son extends Father{

}