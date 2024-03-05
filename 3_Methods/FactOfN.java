import java.util.*;

public class FactOfN{

    public static int fact(int n){
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int facto = fact(num);
        System.out.println("The factorial is: "+ facto);

    }
}