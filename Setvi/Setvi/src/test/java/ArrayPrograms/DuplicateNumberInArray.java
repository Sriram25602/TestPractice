package ArrayPrograms;

public class DuplicateNumberInArray {

    public static void main(String[] args) {
        int [] arr = {12, 23, 12, 24, 23, 45, 5, 2, 12, 4, 23, 5, 6, 2, 2, 1, 45};

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[j]);
                    break;
                }
            }
        }
    }
}

//Interview Questions:

//🔹 How to Explain This in an Interview (Very Important for QA)?
//“I used two for loops.
//The first loop picks one number, and the second loop compares it with the remaining numbers.
//If both numbers are equal, then it is a duplicate.”

//1️⃣ Why did you use two loops?
//Because I need to compare each number with all other numbers to find duplicates.

//2️⃣ What is the time complexity of this code?
//Time complexity is O(n²) because we are using nested loops.

//3️⃣ What happens if the array has no duplicates?
//The program will not print anything because the condition arr[i] == arr[j] never becomes true.

//4️⃣ Why did you use break inside the loop?
//To avoid printing the same duplicate number multiple times.

//5️⃣ Can you find duplicates without writing code? (QA mindset)
//Yes. I can validate duplicates using:
//Sorting the array and checking adjacent values
//Comparing input vs expected output
//Using test data with known duplicates

//7️⃣ Is this logic valid for negative numbers?
//Yes, because comparison works the same for negative values.

