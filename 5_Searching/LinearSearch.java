public class LinearSearch{

    public static int liSearch(int arr[], int num){

        for(int i = 0; i< arr.length; i++){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        
        int arr[] ={5,6,3,0,10,23,2,4};
        final int key = 7;
        
        int index = liSearch(arr, key);
        if(index == -1){
            System.out.println("not found");
        }
        else{
            System.out.println("The index is:" +index);
        }
    }
}