// Check if a number is  a power of 2 or not

public class PowerOfTwo {

    public static void checkPowerOfTwo(int number){

        if((number & (number - 1)) == 0){
            System.out.println("The number is a power of 2");
        }
        else{
            System.out.println("The number is not a power of 2");
        }
    }

    public static void main(String[] args) {
        
        int num = 32;
        checkPowerOfTwo(num);
    }
}