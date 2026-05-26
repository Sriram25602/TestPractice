package Page;


// exception handling is to run the end to end code even a exception error occurs between the code.
// Throw - We can mention before it on a method and call it on try catch.



public class ExceptionHandling {

    static void check(int age){
        if(age<18){
            throw new ArithmeticException("Age is not eligible");
        }
    }

    public static void main (String[] args) {

        int a = 10;
        int b = 0;


        try {
            System.out.println(a/b); // By default it will throw a error and the next code will not run.
                                     // So we use the try catch. It will chcek if error, then show the line from catch and continue to run the next code

        }

        catch (ArithmeticException e){
            System.out.println("Unable to divide by zero");
        }

        try {
            check(17);
        }

        catch (ArithmeticException E){
            System.out.println(E.getMessage()); // We will get only entered message (The default message from system won't be shown)
        }

        System.out.println("Completed");
    }
}







