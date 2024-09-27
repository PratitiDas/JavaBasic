public class SetithBit {

    public static int setTheBit(int number, int position){

        int bitMask = 1 << position;

        return number | bitMask;

    }
    public static void main(String[] args) {
        
        int num = 10;
        int iPos = 2;

        System.out.println(setTheBit(num, iPos));
    }
}