/*
 *     *****
 *    *****
 *   *****
 *  *****
 * *****
 */

public class Pattern11 {

    public static void main(String[] args) {
        int row = 5;
        solidRhombus(row);
    }

    private static void solidRhombus(int row) {

        for(int i = 1; i<= row; i++){
            for(int j = 1; j<=row-i; j++){
                System.out.print(" ");
            }
            for(int j= 1; j <=row; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}