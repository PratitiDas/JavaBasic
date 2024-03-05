import java.util.*;

public class PrimesinRange{

    public static boolean isPrime(int n){
        boolean isPrime = true;

        //Only for n>=2
        if(n == 2)
        {
            return true;
        }
        else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
        return isPrime;
        }
    }

    public static void primeRange(int num){
        for(int i = 2; i <=num; i++){
            if(isPrime(i) == true){
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int range = sc.nextInt();
        primeRange(range);
    }
}