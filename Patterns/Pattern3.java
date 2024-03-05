/*
1
12
123
1234
12345
*/
import java.util.*;

public class Pattern3{

    public static void main(String args[]){

        int line = 5;
        for(int i = 1; i <= line; i++){
            for(int num = 1; num <= i; num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}