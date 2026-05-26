package MapAndTypes;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountWordFrequencyUsingHashMap {

    public static void main(String[] args) {
        String sentence = "java python java mysql python java";

        String[] words = sentence.split(" ");

        Map<String, Integer> wordCount = new TreeMap<>();
        for(String word: words) {
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word) + 1);
            }else {
                wordCount.put(word, 1);

            }
        }

        System.out.println(wordCount);
    }
}
