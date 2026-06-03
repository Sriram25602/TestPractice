package StringPrograms;

import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {
        anagramCheckUsingSort();
        checkAnagramAfterRemovingSpace();
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

    // Real interview questions:
    public static void checkAnagramAfterRemovingSpace(){
        String one = "Listen";
        String two = "Sil ent";

        //So, the string may have spaces but still it's anagram. We need to remove the spaces before do anything

        char[] arr1 = one.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = one.replaceAll("\\s", "").toLowerCase().toCharArray();

        //Then start sorting

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }

    //MOST Important first rule: We need to check index of both string, if it's not, it should not be anagram
    // Don't use sorting - Use HashMap
    //Remove special characters first
}
