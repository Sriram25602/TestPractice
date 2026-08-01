package ArrayPrograms;

public class InsertionSort {

    public static void main(String[] args) {
        int [] arr = {7, 2, 5, 1, 89, 23, 34, 312, 4,1, 12};

        //Now we assume 1st element 7 is sorted

        for(int i=1; i<arr.length; i++){ // let's start from unsorted array from second element to end
            int key = arr[i]; //store unsorted element to key variable
            int j=i-1; // Means element that before to the i element (unsorted element we are going to check with last element of sorted)
            //Because we will shift i (Current position of Unsorted array) value to previous index (last element of the sorted array).
            // So, j is (i-1)

            while(j>=0 && arr[j] > key){
                //right shift
                arr[j+1] = arr[j]; // Shift last j value to next index (last)
                j--; // Now we have done right ship of the last element. Now we need to right shit remaining sorted elements. so we use this j--.
            }
            arr[j+1] = key; // Now set the key value to the correct position
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+ " ");
        }
    }}

//8️⃣ What is Insertion Sort?
//Insertion sort builds the sorted array one element at a time by inserting each element into its correct position in the already sorted part.

//9️⃣ Why does Insertion Sort start from index 1?
//Because the first element is assumed to be already sorted.

//🔟 What is the time complexity of Insertion Sort?
//Best case: O(n) (already sorted array)
//Average case: O(n²)
//Worst case: O(n²)

//1️⃣3️⃣ Why is Insertion Sort better than Bubble Sort?
//Insertion sort performs fewer swaps and works efficiently for small or nearly sorted arrays.

//1️⃣6️⃣ Which is faster for nearly sorted arrays?
//Insertion Sort is faster because it requires fewer comparisons and shifts.

//WHY INSERTION sort: (Important)
//Insertion sort is preferred over bubble sort in practice because it minimizes swaps and adapts well to nearly sorted data.