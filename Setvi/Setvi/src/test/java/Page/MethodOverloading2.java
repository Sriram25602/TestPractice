package Page;

public class MethodOverloading2 {

    public static void main(String[] arge) {

        methodOverloading_ obj = new methodOverloading_();
        obj.menthodOne(18);
        obj.methodOne(23);

    }

}

    class methodOverloading_ {


        public void methodOne(int number) {
            System.out.println(number);
        }

        String menthodOne(int number) {
            System.out.println(number);
            return String.valueOf(number);
        }

    }



