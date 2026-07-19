package Java;

public class OperatorsAndTypeCasting {

    public static void main(String[] args) {

        //Binary Operators
        //These are all binary operators since we are using 2 variables into the operation
        int a = 10;
        int b=4;

        int c= a+b;
        int d= a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;

        //-------------------------------------------------------------------------------------------------------

        //Unary Operators
        //These are unary operators since we are using singe variable for operation

        int num1 = 10;

        /* PostIncrement Operator */
        System.out.println(num1++);
        //This will still print the num1 value as 10. Because we used postIncrement

        System.out.println(num1);
        //Now this will print num1 as 11 since the value increased already


        /* PreIncrement Operator */
        System.out.println(++num1);
        //This will first increase the value and then print.

        System.out.println(num1);
        //Now this will print the value after decrement which we printed already

        //-------------------------------------------------------------------------------------------------------

        //TypeCasting

        int value = a/b;
        System.out.println(value);

        //We divided two int values and store it in int variable - Result 2

        float value1 = a/b;
        System.out.println(value1);
        //Now This will just change the return int value into float - Result already 2 -> 2.0 float

        float value2 = (float) a/b;
        System.out.println(value2);
        //Now this will divide the whole float value and return 2.5 and store it in float value
    }
}
