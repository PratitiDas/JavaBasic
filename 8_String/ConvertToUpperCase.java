public class ConvertToUpperCase {

    public static String upperCase(String str){
        
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));

        sb.append(ch);
        for(int iter = 1; iter < str.length(); iter ++){
            if(str.charAt(iter) == ' ' && iter < str.length()){
                sb.append(str.charAt(iter));
                iter++;
                sb.append(Character.toUpperCase(str.charAt(iter)));
            }
            else{
                sb.append(str.charAt(iter));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        
        String str = "hi, i am pratiti";
        System.out.println(upperCase(str));

    }
}