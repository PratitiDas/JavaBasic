public class GetithBit {

    public static int getTheBit(int num, int position){

        int bitMask = 1;

        if((num & (bitMask << position)) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static void main(String[] args) {
        
        int num = 10;
        int iPos = 3;

        System.out.println("The "+iPos+"th bit in "+num+": "+ getTheBit(num, iPos));
    }
}