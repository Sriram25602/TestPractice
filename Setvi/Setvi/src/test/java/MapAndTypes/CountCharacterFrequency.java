package MapAndTypes;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountCharacterFrequency {
    public static void main(String[] args) {
        String word = "tenet";

        Map<Character, Integer> letterCount = new TreeMap<>();
            for (char letter: word.toCharArray()) {
                if(letterCount.containsKey(letter)){
                    letterCount.put(letter, letterCount.get(letter) + 1);
                    System.out.println(letter); // print duplicated characters
            } else {
                    letterCount.put(letter, 1);
                }
        }
        System.out.println(letterCount);
    }
}
