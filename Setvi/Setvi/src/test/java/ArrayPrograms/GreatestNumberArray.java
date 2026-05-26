package ArrayPrograms;

public class GreatestNumberArray {

    public static void main(String[] args) {
        int [] arr = {62, 12, 34, 678, -12, 34, 124};

        int largest = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
