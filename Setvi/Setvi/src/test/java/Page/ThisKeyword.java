package Page;


//It will use to call the instance variable.

public class ThisKeyword{

    public static void main(String[] args){
        callOne obj = new callOne();
        obj.print(36,"Sriram");

        System.out.println(obj.name);
        System.out.println(obj.rollNo);
    }

}

class callOne {

    int rollNo;
    String name;

    public void print(int rollNo, String name){

     this.rollNo = rollNo;
     this.name = name;

    }
}


