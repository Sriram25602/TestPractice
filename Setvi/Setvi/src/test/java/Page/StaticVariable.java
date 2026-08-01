package Page;




// instance variable belongs to the method, the static variable blongs to the class

public class StaticVariable {

    int x = 0;
    static int y = 0;

    public void Static(){
        x++;
        y++;
        System.out.println("non-static =>" + x + "static =>" + y);
    }

    public static void main(String args[]){

       StaticVariable staticValue = new StaticVariable();
       staticValue.Static();
        staticValue.Static();

        StaticVariable staticValu2 = new StaticVariable();
        staticValu2.Static();
        staticValu2.Static();

    }
}
