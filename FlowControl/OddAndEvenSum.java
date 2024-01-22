import java.util.*;

public class OddAndEvenSum{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        char choice;
        int evenSum = 0;
        int oddSum = 0;

        do{
            System.out.println("Enter the number: ");
            int num = sc.nextInt();

            if(num % 2 == 0){
                evenSum += num;
            }
            else{
                oddSum += num;
            }

            System.out.println("Continue? Y or n: ");

            choice = sc.next().charAt(0);

        }while( choice == 'Y' || choice == 'y');

        System.out.println("Sum of odd numbers: " +oddSum);
        System.out.println("Sum of even numbers: " + evenSum);
    }
}