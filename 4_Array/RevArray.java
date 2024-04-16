//Reverse an array

public class RevArray {

    public static void reverse(int a[]){

        int start = 0, end = a.length-1;
        while(start<end){

            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

    }
     public static void main(String[] args) {
        
        int arr[] = {5,4,7,1,3,8};
        reverse(arr);

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
     }
}