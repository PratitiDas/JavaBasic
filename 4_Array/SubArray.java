/*
 * Print the sub arrays of the array
 * arr = [2, 4, 6, 8]
 * subarrays:[2][2,4][2,4,6][2,4,6,8][4][4,6][4,6,8][6][6,8][8]
 */
public class SubArray {

    public static void sub(int a[]){

        for(int i = 0; i< a.length; i++){

            int start = i;
            for(int j = i; j< a.length; j++){
                
                int end = j;
                for (int k = start; k<= end; k++){

                    System.out.print(+a[k]+",");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[] = {2, 3,4,6,8};
        sub(arr);
    }
}