package Page;

import java.awt.desktop.SystemEventListener;



public class Keywords{

  public static void main(String[] args){

      Sub object = new Sub();
      object.methodP();

  }
}

class ParentOne {

   final char gender = 'M'; // So we cannot assign any more values for gender

    void methodP(){    // Same for method. If add final here, then won't be overriding. This will be call

        System.out.println("This is from parent class");

    }
}

class Sub extends ParentOne{

    char gender = 'F';
    void methodP(){
        System.out.println("This is from sub class");
        super.methodP(); // now it will call the parent class's methods
        System.out.println(super.gender); // This will call the parent class's variable
    }

}