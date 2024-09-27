public class BubbleSort{

    public static void sort(int unsortedArr[]){

        int l = unsortedArr.length;
        int swaps = 0;

        for(int i = 0; i < l-1; i++){
            for(int j = 0; j < l-1-i; j++){
                if(unsortedArr[j]>unsortedArr[j+1]){
                    int temp = unsortedArr[j];
                    unsortedArr[j] = unsortedArr[j+1];
                    unsortedArr[j+1] = temp;
                    swaps++;
                }
            }
        }
        System.out.println("Total swaps:"+swaps);
    }

    public static void main(String args[]){

        int arr[] = {5, 4, 1, 3, 2};

        System.out.println("The unsorted array is:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        sort(arr);

        System.out.println("The sorted array is:");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}