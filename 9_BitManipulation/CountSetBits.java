// Count set bits(1) in a number

public class CountSetBits {

    public static int countSetBits(int number){

        int count = 0;
        while(number > 0){
            if((number & 1) != 0){
                count ++;
            }
            number >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        
        int num = 15;

        System.out.println(countSetBits(num));
    }
}