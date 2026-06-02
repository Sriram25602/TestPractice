package StringPrograms;

import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        anagramCheckUsingSort();
    }

    public static void anagramCheckUsingSort(){

//        //Steps:
//        1. Change string to lowerCase
//        2. Change string to character Array
//        3. Sory the array

        String one = "Listen";
        String two = "Silent";

        char[] arr1 = one.toLowerCase().toCharArray();
        char[] arr2 = two.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagram");
        } else {
            System.out.println(" Not Anagram");
        }

    }
}
