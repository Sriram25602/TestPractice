package ArrayPrograms;

public class SumOfArray {

    public static void main(String[] args) {
        int [] arr = {1, 2, 1};
        int sum =0;

        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(sum);

        SumOfArray odd = new SumOfArray();
        odd.addOddNum();
    }

    // Add only odd numbers
    public void addOddNum(){
        int [] arr = {6, 1, 3, 13, 5,12, 66, 13, 57, 1, 2, 21, 21};
        int sumOfOadd = 0;
        int sumOfEven = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 != 0){
                sumOfOadd = sumOfOadd + arr[i];
            } else {
                sumOfEven = sumOfEven + arr[i];
            }
        }
        System.out.println("Sum of Odd numbers: " + sumOfOadd);
        System.out.println("Sum of Even numbers: " + sumOfEven);
    }
}

//🏆 BEST ONE-LINE ANSWER (Memorize This)
//“I iterate through the array once, use the modulus operator to identify even and odd numbers, and add them to separate sum variables.”

//2️⃣ Is zero even or odd?
//Zero is an even number because 0 % 2 = 0.

//4️⃣ What if the array contains negative numbers?
//The logic still works.

//5️⃣ Why did you initialize evenSum and oddSum to zero?
//Because zero is the neutral value for addition and avoids incorrect results.

//6️⃣ Can this logic work if numbers are very large?
//Yes, but for very large values we may need long instead of int to avoid overflow.

//9️⃣ What is the time complexity of this solution?
//O(n) because we are iterating through the array only once.

//🔟 Can you do this without using a loop?
//No, because we need to check each element individually to determine whether it is even or odd.

//1️⃣1️⃣ Why not use two separate loops—one for even and one for odd?
//Using one loop is more efficient and easier to maintain.

//1️⃣3️⃣ What if the array has duplicate values?
//Duplicates will be added normally.
//This logic sums values, not unique numbers.