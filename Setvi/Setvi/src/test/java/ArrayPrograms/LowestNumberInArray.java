package ArrayPrograms;

public class LowestNumberInArray {

    public static void main(String[] args) {
        int [] arr = {46, -12, -62, 87, 1,0, 2};

        int lowest = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] < lowest){
                lowest = arr[i];
            }
        }
        System.out.println(lowest);
    }
}
