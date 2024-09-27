public class OddEven {

    public static void checkNum(int number){

        int bitMask = 1;

        if((number & bitMask) == 0){
            System.out.println("Number is even.");
        }
        else{
            System.out.println("Number is odd.");
        }
    }

    public static void main(String[] args) {
        
        int num = 8;

        checkNum(num);
    }
}