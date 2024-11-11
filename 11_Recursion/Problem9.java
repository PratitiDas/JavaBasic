// print x^n

public class Problem9 {

    public static int xPowern(int x, int n){                //O(n)

        if(n == 0){
            return 1;
        }
        return x * xPowern(x, n-1);
    }


    public static int xPowernOptimized(int x, int n){               //O(log(n))

        if(n == 0){
            return 1;
        }
        int halfPower = xPowernOptimized(x, n/2);
        int halfPowersq = halfPower * halfPower;

        if(n % 2 != 0){
            halfPowersq *= x;
        }
        return halfPowersq;
    }

    public static void main(String[] args) {
        
        int x = 2;
        int n = 3;
        System.out.println(xPowernOptimized(x, n));
    }
}