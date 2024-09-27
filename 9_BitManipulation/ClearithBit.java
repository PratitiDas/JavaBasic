public class ClearithBit {

    public static int clearBit(int number, int position){

        int bitMask = ~(1 << position);
        return number & bitMask;
    }

    public static void main(String[] args) {
        
        int num = 10;
        int pos = 1;
        
        System.out.println(clearBit(num, pos));
    }
}