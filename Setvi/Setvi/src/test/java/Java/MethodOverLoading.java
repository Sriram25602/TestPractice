package Java;

import javax.sound.midi.Soundbank;
import java.util.Objects;

public class MethodOverLoading {

    public int sum(int a, int b){
        return a + b;
    }

    public boolean sum(String a, String b){
        if(a.length() == b.length());
        return true;
    }

    public void sum(){
        String a = "5";
        String b = "5";
        String c = a.intern();

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }

    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        obj.sum();
//        int c = obj.sum(5, 5);
//        System.out.println(c);
//        boolean isEqual = obj.sum("TEST", "TETS");
//        System.out.println(isEqual);

    }
}
