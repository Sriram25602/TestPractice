package ArrayPrograms;

public class ArraySortingBubble {

    public static void main(String[] args) {
        int [] arr = {23, 45, 12, 644, 7853, 2, 1,23, 3, 4, 5};

        boolean swapped = false;

        for(int i=0; i<arr.length-1; i++){
            for (int j=0; j< arr.length-i-1; j++){
                if(arr[j] > arr[j+1]) { //check first and second element and swap if wrong order unstil sorted
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
                }

            if(!swapped){
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//Interview Questions:
//1) why we used n-1?
//After n-1 passes, the array is guaranteed sorted. Each pass puts one largest element at the end

//2) Why we used arr.length-i-1?at
////-i avoids re-checking elements already sorted the end.

//3) What is bubble sort?
//Bubble sort repeatedly compares adjacent elements and swaps them if they are in the wrong order until the array is sorted.

//4) Why is it called Bubble Sort?
//Because after each pass, the largest element “bubbles up” to the end of the array.

//3️⃣ What is the time complexity of Bubble Sort?
//Best case: O(n) (when optimized and array is already sorted)
//Average case: O(n²)
//Worst case: O(n²)

//5️⃣ Is Bubble Sort stable?
//Answer:
//Yes, Bubble Sort is stable because it does not change the relative order of equal elements.

//6️⃣ How do you optimize Bubble Sort?
//
//Answer:
//By using a boolean flag to stop the algorithm early if no swaps occur in a full pass.