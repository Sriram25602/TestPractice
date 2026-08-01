package ArrayPrograms;

public class SecondLowestValueInArray {

    public static void main(String[] args){

        int[] num = {-1, -23, 12, 343, 343, -433, -233};

        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        System.out.println("Allocate num" + min);
        System.out.println("Allocate second num" + min2);

        for(int arr : num){
            if(arr < min){
                min2 = min;
                min = arr;
            } else if(arr < min2 && arr != min){
                min2 = arr;
            }
        }
        if(min2 == Integer.MAX_VALUE){
            System.out.println("There is no Second lowest value");
        } else{
            System.out.println("Second lowest value" + min2);
        }

    }
}
