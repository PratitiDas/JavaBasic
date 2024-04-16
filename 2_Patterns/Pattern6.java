/*
 *     *
 *    **
 *   ***
 *  ****
 * *****
 */

 import java.util.*;

 public class Pattern6{

    public static void inverterRotatedHalfPyramid(int num){

        for(int i = 1; i<= num; i++){
            for(int j = 1; j<= num; j++){
                if(i+j> num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int row = sc.nextInt();
        inverterRotatedHalfPyramid(row);
        
    }
 }