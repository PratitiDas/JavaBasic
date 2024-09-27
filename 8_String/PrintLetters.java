public class PrintLetters {

    public static void printLetter(String str){

        for(int iter = 0; iter < str.length(); iter++){

            System.out.print(str.charAt(iter)+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        String firstName = "Pratiti";
        String lastName = "Das";
        String fullName = firstName + " " + lastName;

        printLetter(fullName);
    }
}