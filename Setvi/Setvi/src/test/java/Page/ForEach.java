package Page;



// This is used to run the arrays with single line of code

public class ForEach {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;


        for(int run : numbers){ // Assigned all number values to run(Input name)

            System.out.println(run); // Just call the run
        }

        for (int[] runTwo : matrix){// user [] for call the matrix array (Two dimentional)


            for(int runThree : runTwo){    // assigned to another values for matrix to call without []
                System.out.print(runThree+ " ");
            }

            System.out.println();

        }

    }
}
