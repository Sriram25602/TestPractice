package StringPrograms;

public class RemoveSpaces {
    static String sentence = "    I am the Danger   ";

    public static void main(String[] args) {


        String[] words = sentence.split(" ");

        StringBuilder sentenceWithoutSpace = new StringBuilder();
        for (String word : words){
            sentenceWithoutSpace.append(word);
        }
        System.out.println(sentenceWithoutSpace);

        useReplace();
        useRegex();
        useForLoop();
        useTrim();
    }

    // Using replace function
    // Remove only space
    public static void useReplace(){
       String newSentence =  sentence.replace(" ", "");
        System.out.println("Sentence without spaces " + newSentence);
    }

    // Using regex - Best Way
//    removes:
//    spaces
//    tabs
//    newlines
    public static void useRegex(){
        String newSentence = sentence.replaceAll("\\s", "");
        System.out.println(newSentence);
    }

    //Using loop
    public static void useForLoop(){
        StringBuilder result = new StringBuilder();
        for(int i=0; i < sentence.length(); i++) {

            if(sentence.charAt(i) != ' '){
                result.append(sentence.charAt(i));
            }
        }
        System.out.println(result);
    }

    // Trim() - Used to remove spaces only on front and end of the sentence
    public static void useTrim(){
        String newSentence = sentence.trim();
        System.out.println(newSentence);
    }
}
