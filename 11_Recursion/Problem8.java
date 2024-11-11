// WAF to find the last occurence of an element in an array

public class Problem8 {

    public static int lastOccurnence(int arr[], int key, int index){

        if(index == arr.length){
            return -1;
        }

        int isFound = lastOccurnence(arr, key, index + 1);
        if(isFound == -1 && arr[index] == key){
            return index;
        }
        return isFound;
    }

    public static void main(String[] args) {
        
        int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastOccurnence(arr, 1, 0));
    }
}