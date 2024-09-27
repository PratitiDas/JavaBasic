// Update ith bit

public class UpdateithBit {

    public static int clearBit(int number, int position){

        int bitMask = ~(1 << position);
        return number & bitMask;
    }

    public static int updateTheBit(int num, int pos, int newBit){

        num = clearBit(num, pos);
        int bitMask = newBit<<pos;
        return num|bitMask;

    }

    public static void main(String[] args) {
        
        int num = 15;       //actual number
        int pos = 2;        //the position, where the updation will be done
        int newBit = 0;

        System.out.println(updateTheBit(num, pos, newBit));
    }
}