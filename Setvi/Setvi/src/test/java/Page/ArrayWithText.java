package Page;

public class ArrayWithText {

    public static void main(String[] args) {
        /*char[] text = new char[6];
        text[0] = 'S';
        text[1] = 'R';
        text[2] = 'I';
        text[3] = 'R';
        text[4] = 'A';
        text[5] = 'M';*/

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


        //System.out.println(text);

        for(int i = 0; i <3;i++){

            for(int j = 0; j <3;j++){

                System.out.print(matrix[i][j]); // Removed the "In" near print to run it to straight line
            }
             System.out.println();  // again give In - to print it as per code.
        }


    }



}
