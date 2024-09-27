public class PalindromeString {

    public static boolean isPalindrome(String str){

        int strLength = str.length();

        for(int iter = 0; iter < strLength/2; iter++){
            if(str.charAt(iter) != str.charAt(strLength-iter-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        String str = "loop";
        System.out.println(isPalindrome(str));
    }
}