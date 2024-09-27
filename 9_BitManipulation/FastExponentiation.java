public class FastExponentiation {

    public static int fastExpo(int number, int expo){

        int ans = 1;

        while(expo > 0){
            if((expo & 1) !=0){
                ans *= number;     
            }
            number *= number;
            expo >>= 1;
        }
         return ans;
    }

    public static void main(String[] args) {
        
        int num = 5;
        int expo = 3;

        System.out.println(fastExpo(num, expo));
    }
}