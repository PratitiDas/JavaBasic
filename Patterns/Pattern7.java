/*
 * 123456
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */

 import java.util.*;

 public class Pattern7{

    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int row = sc.nextInt();
        invertedHalfPyramidNum(row);
    }

    private static void invertedHalfPyramidNum(int row) {

        for(int i = 1; i<= row; i++){
            for(int j = 1; j<= row-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
 }