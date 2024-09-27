public class SearchInSortedMatrix {

    //Bruteforce method to find the key

    public static void bruteForce(int arr2d[][], int key){

        int rows = arr2d.length, cols = arr2d[0].length;
        
        for(int row = 0; row < rows; row++){
            for(int col = 0; col < cols; col++){

                if(arr2d[row][col] == key){
                    System.out.println("location is: ["+row+", "+col+"]");
                }
            }
        }
        System.out.println("Key not found");

    }


    //Row wise binary search

    public static void rowWiseSearch(int arr2d[][], int key){

        int rows = arr2d.length;

        for(int row = 0; row < rows; row++){
            int start = 0, end = arr2d[0].length;

            while(start <= end){
                int mid = (start + end) / 2;

                if(arr2d[row][mid] == key){
                    System.out.println("location is: ["+row+", "+mid+"]");
                }

                if(arr2d[row][mid] < key){
                    start = mid;
                }
                if(arr2d[row][mid] > key){
                    end = mid-1;
                }
            }
        }

        System.out.println("key not found in row wise search.");
    }


    //Stair case method

    public static boolean stairCase(int arr2d[][], int key){

        int row = 0, col = arr2d[0].length - 1;
        
        while(row < arr2d.length && col >= 0){
            if(arr2d[row][col] == key){
                System.out.println("location is: ["+row+", "+col+"]");
                return true;
            }
            else if(arr2d[row][col]>key){
                col --;
            }
            else{
                row ++;
            }
        }

        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};

        int key = 39;

        //bruteForce(matrix, key);
        //rowWiseSearch(matrix, key);

        stairCase(matrix, key);
    }
}