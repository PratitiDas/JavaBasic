public class BinarySearch {

    public static int biSearch(int a[], int num){

        int start = 0, end = a.length-1;

        while(start<=end){
            int mid = (start + end)/2;
            if(a[mid] == num){
                return mid;
            }
            if(a[mid] < num){
                start = mid;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr [] = {2,5,7,11,15,16,19};
        int key = 15;

        int index = biSearch(arr,key);
        if(index == -1){
            System.out.println("Not found");
        }
        else{
            System.out.println(index);
        }
    }
}