package MapAndTypes;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesUsingHashSet {

    public static void main(String[] args) {

        String str = "programming";

        Set<Character> set = new HashSet<>();

        StringBuilder result = new StringBuilder();

        for(char ch: str.toCharArray()){
            if(set.add(ch)){ //If character already exists, it will return false
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}
