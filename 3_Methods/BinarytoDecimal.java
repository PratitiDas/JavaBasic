import java.util.*;

public class BinarytoDecimal{
    public static int biToDeci(int bi){

        int deci = 0;
        int power = 0;
        while(bi > 0){
                deci += (bi % 10) * Math.pow(2, power);
                bi /= 10;
                power++;
        }
        return deci;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        int bi = sc.nextInt();
        System.out.println("The decimal is: " +biToDeci(bi));
    }
}