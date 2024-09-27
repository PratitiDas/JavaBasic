public class InsertionSort {

    public static void insertion(int unsortedArray[]){

        int length = unsortedArray.length;

        for(int i = 1; i < length; i++){
            int curr  = unsortedArray[i];
            int prev = i-1;

            // finding the currect position for the element
            while(prev >= 0 && unsortedArray[prev] > curr){
                unsortedArray[prev + 1] = unsortedArray[prev];
                prev --;
            }

            // Insertion of the element
            unsortedArray[prev+1] = curr;
        }

    }

    public static void main(String[] args) {
        
        int arr[] = {5, 4, 1, 3, 2};      //array

        // print unsorted array 

        System.out.println("The unsorted array:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        // call insertion sorting method

        insertion(arr);


        //print sorted array

        System.out.println("Sorted array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}