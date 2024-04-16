/*
 * print the maaximum subarray sum of an array
 * arr = [1,-2,6,-1,3]
 * maximum of subarray sum = 8
 */
public class MaxSubArraySum {

    public static int maxSum(int a[]){

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i< a.length; i++){
            
            for(int j = i; j< a.length;j++){
                sum = 0;
                for(int k= i; k<= j; k++){
                    sum +=a[k];
                }
            }

            if(max < sum){
                max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        
        int arr[] = {1,-2,6,-1,3};
        int max = maxSum(arr);
        System.out.println(max);
    }
}