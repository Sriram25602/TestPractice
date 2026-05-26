package StringPrograms;

public class ReverseString {

    public static void main(String[] args) {

        String name = "automation";
        String reversed = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reversed += name.charAt(i);
        }
        System.out.println(reversed);

        reverseUsingLoop();
        reverseUsingStringBuilder();
        reverseSentence();

    }

//❓ Q1: What is the drawback of this approach?

//String is immutable → creates multiple objects
//Not memory efficient for large strings

//❓ Q2: How to improve performance?
//Use StringBuilder
//String reversed = new StringBuilder(str).reverse().toString();

//❓ Q3: Can you reverse without using loop?
//Yes, using StringBuilder or recursion.

//❓ Q4: What happens if the string is empty or null?
//Empty → returns empty
//Null → NullPointerException (must handle it)


//⭐ Interview Tip
//If interviewer says:
//“Reverse string”

//👉 First ask or clarify:
//Can I use built-in methods?
//What about null or spaces?

    //Reverse string using loop
    public static void reverseUsingLoop() {

        String str = "Testing Team";
        String reversed = "";
        for (int i= str.length()-1; i>=0; i--){

            reversed = reversed + str.charAt(i);
            //or reversed.append(str.charAt(i)); -- String buffer
        }
        System.out.println(reversed);
    }

    //Reverse using string builder - without loop
    public static void reverseUsingStringBuilder(){

        String str = "Testing using string builder";

        //or StringBuilder reversed = new StringBuilder(str).reverse();
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(reversed);
    }

    //Reverse using recursion
    public static void reverseUsingRecursion(){
    }

    public static void reverseSentence(){
        String sentence = "I am the Danger";
        String[] words = sentence.split(" ");
        String reversed = "";

        for( int i = words.length-1; i>=0; i--) {

            reversed += words[i] + " ";
        }

        System.out.println(reversed);
    }

    }







