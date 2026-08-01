package Page;

public class JumbStatement {

    public static void main(String[] args) {
       /* for(int i=1;i<=10;i++){

            if(i==5){
                break; // it will be break the run after print 4
                continue; // it will be skip only 5 and print next values
            }

            System.out.println(i);

        }*/



        //nested if - first the value i will run and go to next for lool (j)
        // next it will print 1 until the j complete (Condition)

        for(int i=1;i<=4;i++){

            for(int j=1;j<=3;j++){

                System.out.println(i + " " + j);
            }
        }

    }


}
