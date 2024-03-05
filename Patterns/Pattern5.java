/*
 * *****
 * *   *
 * *   *
 * *****
 */
import java.util.*;
 public class Pattern5{

    public static void hollowRec(int r, int c){

        for(int i = 1; i <= r; i++){
            for (int j = 1; j <= c; j++){
                if(i == 1 || i == r || j== 1 || j== c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row no:");
        int row = sc.nextInt();
        System.out.println("Enter the col no:");
        int col = sc.nextInt();
        hollowRec(row, col);

    }
 }