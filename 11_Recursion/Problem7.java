// WAF to find the first occurence of an element in an array

public class Problem7 {

    public static int firstOccurence(int arr[], int key, int index){

        if(index == arr.length){
            return -1;
        }

        if(arr[index] == key){
            return index;
        }

        return firstOccurence(arr, key, index + 1);

    }

    public static void main(String[] args) {
        
        int arr[] = {8, 3, 6, 2, 3, 10, 2, 5, 3};
        System.out.println(firstOccurence(arr, 1, 0));
    }
}