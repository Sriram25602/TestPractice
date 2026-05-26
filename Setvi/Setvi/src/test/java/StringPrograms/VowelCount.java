package StringPrograms;

public class VowelCount {

    public static void main(String[] args) {
        String str = "Automation";
        String lowerCasestr = str.toLowerCase();

        int count = 0;
        for (int i=0; i<lowerCasestr.length(); i++){

           char letter = lowerCasestr.charAt(i);
           if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
               count ++;
           }
        }
        System.out.println(count);
    }




}
