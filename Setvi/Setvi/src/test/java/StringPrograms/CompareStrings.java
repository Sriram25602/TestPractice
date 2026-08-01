package StringPrograms;

public class CompareStrings {

    public static void main (String[] args){

        CompareStrings.checkEqualTo();
        CompareStrings.checkEqualIgnoreCase();
        CompareStrings.checkDoubleEqual();
        CompareStrings.checkCompareTo();

    }

public static void checkEqualTo(){
        String S1 = "Sriram";
        String S2 = "Sriram";

        if(S1.equals(S2)){
            System.out.println("The Strings are qual");
     } else {
            System.out.println("The Strings are not equal");
        }
}

public static void checkEqualIgnoreCase(){
    String S1 = "Sriram";
    String S2 = "srIraM";

    if(S1.equalsIgnoreCase(S2)){
        System.out.println("The Strings are qual");
    } else {
        System.out.println("The Strings are not equal");
    }
}

public static void checkDoubleEqual(){
    String s1 = new String("hello");
    String s2 ="hello";

    if (s1 == s2) {
        System.out.println("Same object");
    } else {
        System.out.println("Different objects");
    }
}

public static void checkCompareTo(){
        String s1 = "catfish";
        String s2 = "Catfish";

        int result = s1.compareTo(s2);

    System.out.println(result);

    if (result == 0){
        System.out.println("String are equal");
    } else if(result > 0){
        System.out.println("String 2 can be before String 1");
    } else {
        System.out.println("String 1 can be before String 1");
    }
}
}
