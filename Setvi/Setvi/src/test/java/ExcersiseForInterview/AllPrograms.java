package ExcersiseForInterview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AllPrograms {

    public static void main(String[] args){
        /* Program 01: Reverse a String O(n) time and Space complexity */
        reverseWord();

        /* Program 02: Find first unique character in the String
        *   If there is no any unique character print -1*/
        findFirstRepetativeCharacter();
    }

    /* Program 01: Reverse a String O(n) time and Space complexity */

    public static void reverseWord(){
      String str = "IBM";
      StringBuilder reversed = new StringBuilder();

      for(int i=str.length()-1; i>=0; i--) {
          reversed.append(str.charAt(i));
      }
      System.out.println(reversed);
    }

    /* Program 02: Find first unique character in the String
     *   If there is no any unique character print -1*/
    public static void findFirstRepetativeCharacter(){
        String str = "Swwiiss";

        //Change all string to lowercase since Map is case-sensitive
        String name = str.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for(char letter: name.toCharArray()){
            if(map.containsKey(letter)){
                map.put(letter, map.get(letter) +1);
            } else {
                map.put(letter, 1);
            }
        }

        for(char ch: name.toCharArray()){
            if(map.get(ch) ==1){
                System.out.println(ch);
                return;
            }
        }
        System.out.println("-1");
    }
}


















