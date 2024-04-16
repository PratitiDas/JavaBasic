/*Find the pairs in array
[2,4,6,8]
pairs are {2,4},{2,6},{2,8},{4,6},{4,8},{6,8}
*/

public class PairsInArray {

    public static void pair(int a[]){

        for(int i = 0; i< a.length; i++){
            for(int j = i+1; j< a.length; j++){
                System.out.print("("+a[i]+","+ a[j]+"), ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {2,3,1,6,4};
        pair(arr);
    }
}