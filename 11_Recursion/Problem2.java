// Print numbers from 1 to n(increasing order)

public class Problem2 {

    public static void printInc(int n){

        if(n == 1){
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        
        int num =10;
        printInc(num);
    }
}