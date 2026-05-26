package Page;



// Don't need to create an object to call the static method. we can call it directly or mention with class name.

public class StaticMethod {

    public void normalMethod(){
        System.out.println("Simple Method");
    }

    public static void method(){
        System.out.println("Static Method");
    }



    public static void main(String args[]){
        StaticMethod.method();

        StaticMethod normal = new StaticMethod();
        normal.normalMethod();
    }
}



