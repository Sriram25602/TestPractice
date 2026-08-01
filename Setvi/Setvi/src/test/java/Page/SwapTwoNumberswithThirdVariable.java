package Page;

public class SwapTwoNumberswithThirdVariable {

    public static void main(String[] args){

        int a=5;
        int b=6;

        int temp=a;  // Assigned a to a tempravary value
        a=b;         // Assign a value as b
        b=temp;      // Assign b value as temp (a), Because if we assign b as a,it will be b since it's a already assign to b

        System.out.println("The values of a is " + a +  "The values of b is "+b);
    }
}






