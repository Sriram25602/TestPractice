package Page;

import java.util.Scanner;

public class ScannerOne {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in); // we have to create a
        /*System.out.println("Enter tha value a");
        int a = input.nextInt();
        System.out.println(a);*/

        /*System.out.println("Enter tha name");
        String name = input.nextLine();
        System.out.println(name);*/

        System.out.println("Enter the sentence");
        char sentence = input.next().charAt(4);
        System.out.println(sentence);

        System.out.println("Enter the float value");
        float floatvalue = input.nextFloat();

    }
}
