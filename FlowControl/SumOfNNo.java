import java.util.*;

public class SumOfNNo{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");

        int n = sc.nextInt();       //taking input

        int i = 1, sum =  0;
        while(i <= n){
            sum +=i;
            i++;
        }

        System.out.println("The sum of " + n +"nafirst natural numbers is:"+ sum);
    }
}