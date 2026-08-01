package Page;

public class DuplicateNumber {


    public static void main(String[] args) {
        int[] arr = {1, 5, 5, 8, 9, 7, 8}; //Array values

        int n = arr.length; //Get count of the array

        int[] uniqueArr = new int[n]; // Another array to assign fisrt value and compare it to current array
        //EX:

        int uniqueIndex = 0; // Created value for unique arr index values


        for (int i = 0; i < n; i++) { // run it from 0th index to end

            boolean isDuplicate = false;


                for (int j = 0; j < uniqueIndex; j++) {
                    if (arr[i] == uniqueArr[j]) {
                        isDuplicate = true;
                        break;
                    }
                }

            if (!isDuplicate) {
                uniqueArr[uniqueIndex] = arr[i];
                uniqueIndex++;
            }
        }
            System.out.println("After removing duplicates");
            for (int i = 0; i < uniqueIndex; i++) {
                System.out.print(uniqueArr[i] + "");
            }
        }
    }