package Page;


// This helps in reusing code, Inherit the to inherit attributes and methods from an existing class, called a superclass

public class Inheritance {

    int salary = 10;

    public void inherit() {
        System.out.println("I can inherit");
    }



}

class Me extends Inheritance{

    String name = "sriram";
    int salary = 5;
}

class call{

    public static void main(String[] args){

        Me obj = new Me();
        System.out.println(obj.name);
        System.out.println(obj.salary);
        obj.inherit();

    }

}