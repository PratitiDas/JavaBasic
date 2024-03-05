import java.util.*;

public class BinomialCoefficient{

    public static int fact(int n){
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int calBinoCo(int n, int r){
        int ncr = fact(n)/(fact(r)*fact(n-r));
        return ncr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        System.out.print("Enter r:");
        int r = sc.nextInt();
        int ncr = calBinoCo(n,r);
        System.out.println("ncr = "+ncr);
    }
}