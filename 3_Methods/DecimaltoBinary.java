import java.util.*;

public class DecimaltoBinary{

    public static int deciToBi(int num){

        int bi = 0;
        int power = 0;
        while(num > 0){
            bi += (num % 2) * Math.pow(10, power);
            num /= 2;
            power++;
        }
        return bi;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int num = sc.nextInt();
        System.out.println("The binary for is: " +deciToBi(num));
    }
}