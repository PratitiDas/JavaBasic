//Clear int bits of a given position range

public class ClearRangeOfBits {

    public static int clearBits(int number, int pos1, int pos2){

        int left = ~(0) << (pos2 + 1);
        int right = (1 << pos1) - 1;

        int bitMask = left | right;

        return number & bitMask;
    }

    public static void main(String[] args) {
        
        int num = 10;
        int pos_1 = 2, pos_2 = 4;

        System.out.println(clearBits(num, pos_1, pos_2));
    }
}