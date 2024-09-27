public class SubString {

    public static String getSubstring(String str, int startIndex, int endIndex){

        int strLength = str.length();
        String subStr = "";

        for(int iter = startIndex; iter < endIndex; iter ++){

            subStr +=str.charAt(iter);
        }
        return subStr;
    }

    public static void main(String[] args) {
        
        String str = "HelloWorld";

        System.out.println(getSubstring(str, 3, 5));

    }
}