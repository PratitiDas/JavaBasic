public class LargestString {

    public static String getLargest(String strArr[]){

        String largest = strArr[0];
        for(int iter = 0; iter < strArr.length; iter++){
            if(largest.compareTo(strArr[iter]) < 0){
                largest = strArr[iter];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        
        String fruits[] = {"apple", "banno", "Banana"};

        System.out.println("The largest string is: " + getLargest(fruits));
        
    }
}