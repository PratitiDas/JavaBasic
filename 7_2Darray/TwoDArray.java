import java.util.Scanner;

public class TwoDArray {

    public static void searchElement(int arr2d[][], int key){

        for(int row = 0; row < arr2d.length; row++){
            for(int col = 0; col < arr2d[0].length; col++){

                if(arr2d[row][col] == key){
                    System.out.println("Index: ["+row+","+col+"]");
                }
                    
            }
        }
        System.out.println("key not found");
    }

    public static void main(String[] args) {
        
        int matrix[][] = new int[3][4];
        int rows = matrix.length, cols = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements:");
        for(int row = 0; row < rows; row++){
            for(int col = 0; col< cols; col++){
                matrix[row][col] = sc.nextInt();
            }
        }

        System.out.println("The matrix is: ");
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }

        int element = 12; 
        searchElement(matrix, element);
    }
}