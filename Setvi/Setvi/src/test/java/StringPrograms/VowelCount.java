package StringPrograms;

public class VowelCount {

    public static void main(String[] args) {
        String str = "Test";
        String lowerCaseStr = str.toLowerCase();

        int count = 0;
        for (int i=0; i<lowerCaseStr.length(); i++){

           char letter = lowerCaseStr.charAt(i);
           if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
               count ++;
           }
        }
        System.out.println(count);
        countVowelAndConsonants();
    }

    //Way 2: Best for Interview

    public static void countVowelAndConsonants(){

        String str = "Automation Testing";
        int vowel = 0;
        int Consonants = 0;

        for (char ch: str.toLowerCase().toCharArray()){
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch) !=-1){
                    vowel++;
                } else {
                    Consonants++;
                }
            }
        }
        System.out.println("Vowels " + vowel);
        System.out.println("Consonants " + Consonants);
    }




}
