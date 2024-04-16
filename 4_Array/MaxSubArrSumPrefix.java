/*
 * Maximum of subarray sum using prefix array
 */
public class MaxSubArrSumPrefix {

    public static void prefixArraySum(int a[]){

        int prefixArr[] = new int[a.length];
        int maxSum = Integer.MIN_VALUE;
        int currsum;

        //calculate prefix sum array
        prefixArr[0] = a[0];
        for(int i = 1; i < a.length; i ++){
            prefixArr[i] = prefixArr[i-1] + a[i];
        }

        //calculate maximum sum of subarrays
        for(int i = 0; i< a.length; i++){    //define the starting of the subarray
            for(int j = i; j< a.length; j++){   // define the ending of the subarray
                currsum = i == 0 ? prefixArr[j]:prefixArr[j] - prefixArr[i - 1];
                if(maxSum < currsum){
                    maxSum = currsum;
                }
            }
        }
        System.out.println(maxSum);
    }

     public static void main(String[] args) {
        
        int arr[] = {1, -2, 6, -1, 3};
        prefixArraySum(arr);
     }
}