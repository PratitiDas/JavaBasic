public class SpiralMatrix {

    public static void spiralMatrixTraverse(int arr2D[][]){

        //Define staring and ending row and columns 
        int startRow = 0;
        int startCol = 0;
        int endRow = arr2D.length-1;
        int endCol = arr2D[0].length-1;

        while(startRow <= endRow && startCol <= endCol){

            // Top row 
            for(int col = startCol; col <= endCol; col++){
                System.out.print(arr2D[startRow][col]+", ");
            }

            //Right col
            for(int row = startRow+1; row <= endRow; row++){
                System.out.print(arr2D[row][endCol]+", ");
            }

            //Bottom row
            for(int col = endCol-1; col >= startCol; col --){
                if(startRow == endRow){
                    break;
                }
                System.out.print(arr2D[endRow][col]+", ");
            }

            //Left col
            for(int row = endRow-1; row >= startRow+1; row --){
                if(startCol == endCol){
                    break;
                }
                System.out.print(arr2D[row][startCol]+", ");
            }
            
            //Update the starting and ending rows and column
            startCol++;
            startRow++;
            endCol--;
            endRow--;

            

        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int matrix[][] = {{1, 2, 3, 4, 5},
                          {6, 7, 8, 9, 10},
                          {11, 12, 13, 14, 15},
                          {16, 17, 18, 19, 20}};

        spiralMatrixTraverse(matrix);
    }
}