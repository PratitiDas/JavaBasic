// Print factorial of a number n  O(n)  O(n)

public class Problem3 {

    public static int fact(int num){

        if(num == 0){
            return 1;
        }
        else if(num > 0){
            return num * fact(num-1);
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        
        int num = 6;
        System.out.println(fact(num));
    }
}