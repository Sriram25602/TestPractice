package Java;

public class Constructor {

// Constructor is a default method which has name as class name.

// It assigns default values for variables which doesn't have any values

// There are 2 types of constructor - Normal and parameterized

    //Constructor is a case-sensitive as same as Class name

    //Constructor can be overloaded

     String name;
     int age;

    Constructor(){
        name = "Walter White";
        age = 52;
    }

    Constructor(String str, int num){
        name = str;
        age = num;
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
    }

    public void Constructor(){ //Just a method even it has class name
        System.out.println("Test");
    }

}


class two{


    public static void main(String[] args) {
        Constructor obj = new Constructor();

        Constructor obj2 = new Constructor("Jesse PinkMan", 30);

    }
}
