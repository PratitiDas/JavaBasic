/*
 * Print the number of 7's that are in the 2d array.
 * i/p: {{4,7,8}{8,8,7}}
 * o/p: 2
 */

import java.util.Scanner;

public class Problem1 {

    public static int findNo(int matrix[][], int num){

        int count = 0;
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                if(matrix[row][col] == num){
                    count++;
                }
            }
        }
        return count;
    }
 
    public static void main(String[] args) {
        
        int matrix[][] = {{4,7,8},
                          {8,8,7}};
        
        int num = 7; 

        System.out.println("No of 7 in the matrix is :"+findNo(matrix, num));
    }
 }