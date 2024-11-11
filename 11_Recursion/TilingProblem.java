public class TilingProblem{

    public static int tiling(int n){                //floor size is 2 * n

        //base case
        if(n == 0 || n == 1){
            return 1;
        }

        // Vertical choice
        int verticalTiles = tiling(n - 1);

        //HOrizontal choice 
        int horizontalTiles = tiling(n - 2);

        int totalWays = verticalTiles + horizontalTiles;

        return totalWays;
    }

    public static void main(String[] args) {

        int n = 2;
        System.out.println(tiling(n));
    }
}