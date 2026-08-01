package ArrayPrograms;

public class FindUniqueNumberInArray {
    public static void main(String[] args) {

            int [] arr = {12, 1, 12, 1};

            for(int i=0; i<arr.length; i++){
                int count =0;
                for(int j=0; j<arr.length; j++){
                    if(arr[i] == arr[j]){
                        count++;
                    }
                }
                 if(count == 1){
                     System.out.println("The unique numbers: " + arr[i]);
                 }
            }
        }
}

//🔹 How to Explain This in an Interview (QA Style)
//“For each number in the array, I count how many times it appears.
//If the count is 1, then that number is unique.”

//2️⃣ Why did you use a count variable?
//To track how many times a number appears in the array.

//3️⃣ Why are you using two loops?
//One loop selects a number and the second loop compares it with all elements to count occurrences.

//5️⃣ What happens if all numbers are duplicated?
//The program will not print anything because no number appears only once.



