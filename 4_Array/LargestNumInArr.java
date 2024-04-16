//import java.util.*;

public class LargestNumInArr{

    public static int largeOne(int arr[]){

        int max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
        int arr[] = {5,3,6,1,0,10,66,32,64,83,2};
        int largest = largeOne(arr);
        System.out.println(largest);
    }
}