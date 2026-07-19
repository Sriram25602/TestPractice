package ArrayPrograms;

public class SecondLargestValueInArray {

    public static void main(String[] args){

        int[] num = {1, 23, 12, 343, 343, 433, 233};

        int max = Integer.MIN_VALUE;    
        int max2 = Integer.MIN_VALUE;

        for(int i=0; i < num.length; i++){
            if(num[i] > max){
                max2 = max;
                max = num[i];
            } else if(num[i] > max2 && num[i] != max){
                max2 = num[i];
            }
        }
        if(max2 == Integer.MIN_VALUE){
            System.out.println("There is no Second largest value");
        } else{
            System.out.println("Second largest value" + max2);
        }

    }
}
