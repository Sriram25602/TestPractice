package StringPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {
//        anagramCheckUsingSort();
//        checkAnagramAfterRemovingSpace("listen", "Sil ent");
//        checkIndexCountOfString();
        System.out.println(anagramCheckUsingHashMap("TESTING", "gintset"));
        System.out.println(anagramCheckUsingArray("Te@sting", "esti!tng"));
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
    public static void checkAnagramAfterRemovingSpace(String one, String two){

        //So, the string may have spaces but still it's anagram. We need to remove the spaces before do anything

        char[] arr1 = one.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = two.replaceAll("\\s", "").toLowerCase().toCharArray();

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
    public static void checkIndexCountOfString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String one");
        String str1 = sc.nextLine();
        System.out.println("Enter the String two");
        String str2 = sc.nextLine();

        System.out.println(str1.length() == str2.length());
    }

    // Don't use sorting - Use HashMap
    //Remove special characters first

    public static boolean anagramCheckUsingHashMap(String s1, String s2){

        //First remove spaces, tabs, etc -> Also change into lowercase to validate each other
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Check both strings have same length
        if(s1.length() != s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c: s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c: s2.toCharArray()){
            if(!map.containsKey(c)) return false;
            map.put(c, map.get(c)-1); //Check if map has first letter of str2, if yes remove count 1. if l=2 => l=1

            //Important check - If count becomes below than 0, it's not anagram

            if(map.get(c) < 0) return false;
        }
        return true;

    }

    //Important for Interview - Anagram using Array

    public static boolean anagramCheckUsingArray(String s1, String s2){
        //First remove spaces, tabs, etc -> Also change into lowercase to validate each other
        s1 = s1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        s2 = s2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Check both strings have same length
        if(s1.length() != s2.length()) return false;~

        int[] count = new int[26];

        for(int i=0; i < s1.length();i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;

        }

        for (int val: count){
            if(val!=0) return false;
        }
        return true;
    }
    
}
