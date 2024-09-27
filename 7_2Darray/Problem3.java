/*
 * Transpose of the matrix
 */

 public class Problem3 {

    public static void printMatrix(int matrix[][]){

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    public static void transposeMatrix(int matrix[][]){

        int transpose[][] = new int[matrix[0].length][matrix.length];

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                transpose[col][row] = matrix[row][col];
            }
        }

        printMatrix(transpose);
    }
 
    public static void main(String[] args) {
        
        int matrix[][] = {{1,2,3},{4,5,6}};
        printMatrix(matrix);
        transposeMatrix(matrix);
    }
 }