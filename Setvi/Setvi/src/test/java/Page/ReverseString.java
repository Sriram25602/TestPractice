package Page;



public class ReverseString {

    public static void main(String[] args) {
        String str = "Eminence";
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) // get the characters as reverse
            reversed += str.charAt(i);  // assigned the printed values to the variable, chartAt(i) is used to splict the characters to the horizondel
        System.out.println(reversed); // print the variable

    }

}


