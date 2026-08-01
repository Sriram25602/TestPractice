package StringPrograms;

public class CheckPalindrome {

    public static void main(String[] args) {
        //palindromeUsingReverse();
       // palindromeWithoutReverse();
        checkReverse();
    }


    public static void palindromeUsingReverse(){
        String original = "madam";

        String reversed = "";

        for (int i = original.length()-1; i>=0; i--){
            reversed += original.charAt(i);
        }

        if(original.equals(reversed)){
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }

    public static void palindromeWithoutReverse(){

        String str = "level";

        boolean isPalindrome = true;
        for(int i=0; i< str.length()/2; i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }

    public static void checkReverse(){

        String sentence = "I am a Software Tester";

        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();
            for (int i = sentence.length()-1; i>=0; i--){

                result.append(sentence.charAt(i));
            }
        System.out.println(result);
    }
}
