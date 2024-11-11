//Print sum of N natural numbers  O(n)  O(n)

public class Problem4 {

    public static int sumN(int num){

        if(num == 1){
            return 1;
        }
        else if(num > 1){
            return num + sumN(num - 1);
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        
        int num = 10;
        System.out.println(sumN(num));
    }
}