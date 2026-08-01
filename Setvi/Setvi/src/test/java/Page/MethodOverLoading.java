package Page;




// it's nothing but, we can create 2 methods with same name but different signature.

public class MethodOverLoading {

    public static void main (String[] args) {

        MethodOverLoading obj1 = new MethodOverLoading();
        obj1.menthodOne(19);
        obj1.menthodOne(101, 40);
        obj1.menthodOne(102, 50);
        obj1.menthodOne(103,70);
        obj1.menthodOne(104, 39);
        obj1.menthodOne(105, 101);

    }

    public void menthodOne(int age){
        if(age>18){
            System.out.println("Your are eligible for vote");
        }
        else {
            System.out.println("Your are not eligible for vote");
        }
    }

    // Two methods with same name but different forms (Data type or parameter count)

    public void menthodOne(int rollnumber, int mark){

        if (mark >= 70 && mark <= 100){
            System.out.println("rollnumber " + rollnumber + " is Grade A");
        }
        else if(mark <=60 && mark >= 50){
            System.out.println("rollnumber " + rollnumber + " is Grade B");
        }
        else if (mark < 50 && mark >=40 ){
            System.out.println("rollnumber " + rollnumber + " is Grade c");
        }
        else if(mark < 40) {
            System.out.println("rollnumber " + rollnumber + " is Fail");
        }
        else if(mark > 100) {
            System.out.println("Wrong mark entered");
        }

    }
}
