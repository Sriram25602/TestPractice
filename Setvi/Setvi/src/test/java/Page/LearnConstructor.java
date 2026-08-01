package Page;


// Constructor is a default method which has name as class name.

// It assigns default values for variables which doesn't have any values

// There are 2 types of constructor - Normal and parameterized

public class LearnConstructor {

    int rollNo;
    String name;


    //Default constructor
   //public LearnConstructor() {

   //     System.out.println("This is the default from constructor");
   // }

    //Parameterized constructor
    public LearnConstructor(int number, String firstName){
        rollNo = number;
        name = firstName;
    }
}

class Constructor{
    public static void main(String[] args) {
        LearnConstructor obj = new LearnConstructor(136, "Sriram"); // pass parameters
        System.out.println(obj.name);
        System.out.println(obj.rollNo);
    }
}
