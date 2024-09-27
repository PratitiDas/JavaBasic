/*
 * Question 1:
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input:
nums = [1, 2, 3, 1]
Output:
   true 
Example 2:
Input:
nums = [1, 2, 3, 4]
Output:
   false 
Example 3:
Input:
nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output:
   true 
*/

public class Problem1 {

    public static boolean checkArray(int num[]){
        
        for(int i = 0; i<num.length; i++){
            for(int j = i+1; j< num.length; j++){
                if(num[i] == num[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int nums[] = {1,1,1,3,3,4,3,2,4,2};
        boolean status = checkArray(nums);
        System.out.println("Status is:"+status);
    }
}