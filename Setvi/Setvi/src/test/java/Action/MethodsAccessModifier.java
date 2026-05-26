package Action;

public class MethodsAccessModifier {

    public static void main(String[] args) {

        MethodsAccessModifier sd = new MethodsAccessModifier();
        sd.print();

    }

    public int addition(int a, int b){
        return a+b;
    }

    private void print(){
        System.out.println("Code executed");
    }
}
