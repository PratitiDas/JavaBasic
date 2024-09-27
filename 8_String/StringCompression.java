public class StringCompression {

    public static String compress(String str){

        String newStr = "";

        for(int iter = 0 ; iter < str.length(); iter++){
            Integer count = 1; 
            while(iter < str.length()-1 && str.charAt(iter) == str.charAt(iter+1)){
                count++;
                iter ++;
            }
            newStr += str.charAt(iter);
            if(count > 1){
               newStr += count.toString(); 
            }
        }
        return newStr;
    }

    public static void main(String[] args) {
        
        String str = "abcd";
        System.out.println(compress(str));
    }
}