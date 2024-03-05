import java.util.*;

public class CheckPrime{

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("is the no prime?" +isPrime(num));
    }
}