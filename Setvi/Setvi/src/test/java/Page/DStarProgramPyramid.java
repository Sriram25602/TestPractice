package Page;

public class DStarProgramPyramid {


    public static void main(String[] args) {

        DStarProgramPyramid mainClass = new DStarProgramPyramid();
        LeftStarPattern patternTwo = mainClass.new LeftStarPattern();
        patternTwo.leftPattern();

        RightStarPattern patternThree = mainClass.new RightStarPattern();
        patternThree.rightPattern();


        int  rows = 5;

        for(int i=1;i<=rows;i++){

            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=(2*i-1);j++){

                System.out.print("*");
            }

            System.out.println();
        }

    }

    public class LeftStarPattern{

        public void leftPattern() {
            int rows = 5;
            for (int i = 1; i <= rows; i++) {

                for (int j = 1; j <= (2 * i - 1); j++) {

                    System.out.print("*");
                }

                System.out.println();
            }
        }

    }

    public class RightStarPattern{

        public void rightPattern() {
            int rows = 5;

            for (int i = 1; i <= rows; i++) {

                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");
                }

                for (int j = 1; j <= i; j++) {

                    System.out.print("*");
                }

                System.out.println();
            }
        }

    }

}
