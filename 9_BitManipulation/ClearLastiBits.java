// Clear last i bits in a number

public class ClearLastiBits {

    public static int clearLastBits(int number, int pos){

        int bitMask = ~(0) << pos;

        return number & bitMask;
    }

    public static void main(String[] args) {
        
        int num = 15;
        int pos = 2;
        System.out.println(clearLastBits(num, pos));
    }
}