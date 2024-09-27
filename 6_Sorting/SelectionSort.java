public class SelectionSort {

    public static void sort(int unsortedArr[]){

        int l = unsortedArr.length;
        int swaps = 0;

        for (int i = 0 ; i < l-1; i++){

            int smallestPos = i;
            for(int j = i+1; j < l; j++){

                if(unsortedArr[smallestPos] > unsortedArr[j]){
                    smallestPos = j;
                }
            }

            int temp = unsortedArr[smallestPos];
            unsortedArr[smallestPos] = unsortedArr[i];
            unsortedArr[i] = temp;
            swaps++;
        }
        System.out.println("Total swaps:"+swaps);
    }

    public static void main(String[] args) {
        
        int arr[] = {5,4,1,3,2};

        System.out.println("The unsorted array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        sort(arr);

        System.out.println("The sorted array:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}