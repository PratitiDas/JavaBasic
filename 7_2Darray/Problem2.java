/*
 * Print out the sum of the numbers in the second row of the "nums" array.
 * 
 * i/p: {{1,4,9},{11,4,3},{2,2,3}}
 * o/p: 18
 */

 public class Problem2 {

    public static int sum2ndRow(int matrix[][]){

        int sum = 0;

        for(int col = 0; col < matrix[1].length; col++){
            sum += matrix[1][col];
        }
        return sum;
    }
 
    public static void main(String[] args) {
        
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};
        
        System.out.println("Sum of the numbers in the 2nd row is:"+ sum2ndRow(nums));
    }
 }