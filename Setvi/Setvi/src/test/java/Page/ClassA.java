package Page;

public class ClassA {
    int a;
    int b;

    public void function() {

        System.out.println(a + b);
    }

}

    class B extends ClassA {

    }

    class C {
        public static void main(String[] args) {
            B obj = new B();
            obj.a = 5;
            obj.b = 5;
            obj.function();
        }

    }


