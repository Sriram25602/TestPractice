package Page;

public class SwapTwoNumbers {



    public static void main(String[] args){

        int a=5;
        int b=6;
        a=a+b; //5+6=11 - value of a
        b=a-b; //11-6=5 - value of b
        a=a-b; //11-5 - final value of a

        System.out.println("The values of a is " + a);
        System.out.println("The values of b is " + b);
    }




}
