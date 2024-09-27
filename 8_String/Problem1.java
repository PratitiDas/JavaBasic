import java.util.Scanner;

/**
 * Count how many times lowercase vowels occurred in a String entered by the user.
 */
public class Problem1 {

    public static int lowerCaseVowel(String str){

        int count = 0;

        for(int iter = 0; iter < str.length(); iter++){
            char ch = str.charAt(iter);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        System.out.println("The no of lowercase vowels in the above string is: "+lowerCaseVowel(str));
    }
}