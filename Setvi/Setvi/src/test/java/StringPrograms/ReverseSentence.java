package StringPrograms;

public class ReverseSentence {

    public static void main(String[] args) {

        String sentence = "I'm a Software Test Engineer";

        String[] words = sentence.split( " ");

        String reverseWords = "";

        for(int i=words.length-1; i>=0; i--){
            reverseWords += words[i] + " ";
        }

        System.out.println(reverseWords.trim());

        ReverseSentence reverse = new ReverseSentence();
        reverse.reverseEachWordSamePosition();
        reverse.reverseWithoutSplit();
        reverseEachWord();


    }

    // 1) Reverse each word in the same position

    public void reverseEachWordSamePosition(){
        String sentence = "I'm a Software Test Engineer";
        String [] words = sentence.split(" ");
        String result = "";

        for(String word: words){
            String reversedWord = "";
            for(int i=word.length()-1; i>=0; i--){
                reversedWord = reversedWord + word.charAt(i);
            }
            result = result + reversedWord + " ";
        }
        System.out.println(result);
    }

    //2) Reverse sentence WITHOUT using split()

    public void reverseWithoutSplit(){
        String sentence = "I'm a Software Test Engineer";
        String result = "";
        String word = "";

        for(int i=0; i<sentence.length();i++){
            if(sentence.charAt(i) != ' '){
                word += sentence.charAt(i);
            } else {
                result = word +  " " + result;
                word="";
            }
        }
        result = word + " " + result;

        System.out.println(result.trim());
    }

    public static void reverseEachWord(){
        String str = "I am the danger";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i=words.length-1; i>=0; i-- ){
            result.append(words[i] + " ");
        }
        System.out.println(result);
    }
}

//🧠 Tricky Interview Questions (MUST KNOW)
//❓ Q1: Difference between reverse string and reverse sentence?
//Reverse string → reverses characters
//Reverse sentence → reverses words

//❓ Q2: What if there are multiple spaces?
//Example:
//"I   am   Tester"
//💡 Better approach:
//String[] words = sentence.trim().split("\\s+");
//2️⃣ What is \\s?
//\s means any whitespace
//space, tab, newline
//⚠️ In Java:
//\ is an escape character
//So we write it as \\s
//3️⃣ What does + mean?
//+ means one or more
//So \\s+ means:
//one or more whitespace characters


//⭐ Senior Tester Tip
//Say this in interview 👇
//“I would clarify whether we need to preserve multiple spaces or normalize them.”
//That line alone shows experience 💯



