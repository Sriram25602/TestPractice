package Page;

public class CheckStringHasVowels {

    public static void main(String[] args) {


        String name = "Srrm";
        boolean vowels = false;

        name = name.toLowerCase(); // change the string to lowercase to compare both upper and lower case with vowels

        for(int i=0; i<name.length();i++){
            char letter = name.charAt(i); //split each letters and assign the variable "letter" using charAt

            if (letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
                vowels = true;
                break;
            }
        }
        if(vowels) {
            System.out.println("The given string contains vowels");
        }
        else {
            System.out.println("The given string does not contain vowels");
        }

        }



}
