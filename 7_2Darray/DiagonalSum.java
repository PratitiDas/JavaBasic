import java.util.Scanner;

public class DiagonalSum {

    public static int diaSum(int arr2D[][]){

        int len = arr2D.length;
        
    
        int diagoSum = 0; // initialize the diagonal sum
    
        for(int row = 0; row < len; row++){
            for(int col = 0; col< len; col++){
                //primary diagonal
                if(row == col){
                    diagoSum += arr2D[row][col];
                }
    
                //Secondary diagonal
                else if(row + col == len-1){
                    diagoSum += arr2D[row][col];
                }
            }
        }
    
        return diagoSum;
    }
    
    public static int diaSumOptimized(int arr2d[][]){
    
        int len = arr2d.length;
    
        int diagoSumOpti = 0;
    
        for(int iter = 0; iter < len; iter++){
            //primary diagonal
            diagoSumOpti += arr2d[iter][iter];
    
            //Secondary diagonal 
            if(iter != len-1-iter){
               diagoSumOpti += arr2d[iter][len-1-iter];
            }
        }
    
        return diagoSumOpti;
    
    }
    

    public static void main(String[] args) {
        
        int matrix[][] = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};

        System.out.println("Diagonal sum = "+diaSum(matrix));

        System.out.println("Diagonal sum optimized: "+diaSumOptimized(matrix));
        
    }
}