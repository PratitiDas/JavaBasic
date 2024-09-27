/*
 * Question 4 :
Determine if 2 Strings are anagrams of each other.
What are anagrams?
If two strings contain the same characters but in a different order, 
they can be said to be anagrams. Consider race and care. In this case, 
race's characters can be formed into a study, or care's characters can 
be formed into race. Below is a java program to check if two strings are 
anagrams or not.
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class Problem4 {

    public static void isAnagrams( String str1, String str2){

        //convert strings into lowercase, so that we don't have to check separately for lower and uppercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //check, if the lengths are same
        if(str1.length() == str2.length()){

            //convert strings into character array
            char str1CharArray[] = str1.toCharArray();
            char str2CharArray[] = str2.toCharArray();

            //sort the letters in the char arrays
            Arrays.sort(str1CharArray);
            Arrays.sort(str2CharArray);

            //if the sorted arrays are identical then the actual strings are anagram
            boolean result = Arrays.equals(str1CharArray, str2CharArray);

            if(result){

                System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
            }
            else{

                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        }
        else{

            System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
 
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "caree";

        isAnagrams(str1, str2);
    }
 }