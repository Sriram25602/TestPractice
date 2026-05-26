package StringPrograms;

public class DuplicateString {

    public static void main(String[] args) {
        char[] letters ={'a', 'b', 'b', 'A', 'c', 'b', 'a', 'd', 'c' };

        for (int i=0; i<letters.length; i++) {
            for (int j = i+1; j < letters.length; j++) {
                if(letters[i] == letters[j]) {
                    System.out.println(letters[j]);
                    break;
                }
            }
        }

    }


}
