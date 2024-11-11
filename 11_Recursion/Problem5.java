// Print Nth fibonacci number

public class Problem5 {

    public static int fibbo(int num){
        if(num == 0 || num ==1){
            return num;
        }
        else if(num > 1){
            return fibbo(num - 1) + fibbo(num - 2);
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        int num = 8;
        System.out.println(fibbo(num));
    }
}