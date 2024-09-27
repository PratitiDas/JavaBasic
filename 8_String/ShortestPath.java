public class ShortestPath {

    public static double calculatePath(String str){

        int strlength = str.length();
        int x = 0, y = 0;
        for(int iter = 0; iter < strlength; iter ++){

            char dir = str.charAt(iter);

            if(dir == 'S'){
                y--;
            }
            else if (dir == 'N') {
                y++;
            }
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }

        return Math.sqrt((x*x)+(y*y));
    }

    public static void main(String[] args) {
        
        String path = "WNEENESENNN";

        System.out.println("Shortest path: " + calculatePath(path));

    }
}