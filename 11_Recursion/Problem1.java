//Print numbers from n to 1(Decreasing Order)

public class Problem1 {

    public static void printDec(int n){

        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }

    public static void main(String[] args) {
        int num = 10;
        printDec(num);
    }
}