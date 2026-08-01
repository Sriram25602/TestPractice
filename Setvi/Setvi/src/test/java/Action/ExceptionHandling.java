package Action;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ExceptionHandling {


    public static void main(String[] args) {

        //ExceptionHandling.exampleCode();
        ExceptionHandling.handleArthmeticException();
        ExceptionHandling.handleInputMismatchException();
        ExceptionHandling.defaultException();

    }

    public static void exampleCode() {

        System.out.println("Enter the number a");

        Scanner sc = new Scanner(System.in); // Just create scanner for input
        int num = sc.nextInt();
        int a = num % 0; // No one numbers will be divided by 0. So it will fail with exception

        System.out.println(a); // Just call it

        System.out.println("Completed"); // This line for for knowledge that the coda has completed or not
    }

//Type 1: Arithmetic Exception:

    public static void handleArthmeticException() {
        System.out.println("Type 1: Enter the number");
        Scanner sc = new Scanner(System.in); // Just create scanner for input
        int num = sc.nextInt();
        try {
            int a = num % 0;
            System.out.println(a);
        }catch (ArithmeticException e){
            System.err.println("Divisible by 0 is not possible"); // err is used to print the error in red color
        }

        System.out.println("Completed");
    }

    // Type 2: Inputmismatch Exception:

    public static void handleInputMismatchException(){
        System.out.println("Type2 2: Enter the number");
        Scanner sc = new Scanner(System.in);

        try {
            int num = sc.nextInt();
            int a = num % 0;
            System.out.println(a);
        }catch (InputMismatchException e){
            System.err.println("Input type must be number");

        } catch (ArithmeticException e){
            System.err.println("Divisible by 0 is not possible"); // err is used to print the error in red color
        }

        System.out.println("Completed Type2");

    }

    //Type 3: Exception

    public static void defaultException(){
        int a=5;
        int b=0;

        try{
            int c = a/b;
            System.out.println("Type 3:");
            System.out.println(c);
        }catch (Exception e){
            System.out.println("Unknown error");
        }
    }
}