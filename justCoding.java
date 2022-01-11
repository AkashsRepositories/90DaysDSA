import java.util.Arrays;
import java.util.Scanner;

class justCoding{

    // public static boolean ifAnagrams(String str1, String str2) {
    //     //check if both strings are of same length; only then they can be anagrams of each other
    //     if(str1.length() != str2.length()) 
    //         return false;
    //     char []charArr1 = str1.toCharArray();
    //     char []charArr2 = str2.toCharArray();
    //     //sorting arrays in ascending order
    //     Arrays.sort(charArr1);
    //     Arrays.sort(charArr2);

    //     for(int i=0; i<charArr1.length; i++) {
    //         if(charArr1[i] != charArr2[i])
    //             return false;
    //     }
    //     return true;
    // }

    // public static void vowelsAndConsonants(String str) {
    //     str = str.toLowerCase();   //assuring str to be lowercase 
    //     System.out.println(str);
    //     int vowelsCount = 0;
    //     int consonantsCount = 0;
    //     // int whiteSpacesCount = 0;
    //     char c = 'x';   //let currenCharacter be x 
    //     for(int i=0; i<str.length(); i++) {
    //         c = str.charAt(i);
    //         if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u') 
    //             vowelsCount++;
    //         // else if(c == ' ')
    //         //     whiteSpacesCount++;
    //         else 
    //             consonantsCount++;
    //     }

    //     System.out.println("Vowels count in String is: "+vowelsCount+" and Consonants Count is: "+consonantsCount);
    // }

    
    // public static void getMatchingElements(int []arr) {
    //     // int count = 0;
    //     for(int i=0; i<arr.length; i++) {
    //         for(int j=i+1; j<arr.length; j++) { 
    //             if(arr[i] == arr[j]){
    //                 System.out.print(arr[i]+" ");
    //                 // count++;
    //             }
    //         }
    //     }
    //     // if(count == 0){
    //     //     System.out.println("No match found!");
    //     // }
    // }
                                                    //Main Program

    public static void main(String []args) {
        System.out.println("Hello");    

        Scanner myScanner = new Scanner(System.in);
        
                        //Playing with Strings
        // //reverse a string
        // String str = "abbcbba";
        // String rev = "";
        // for(int i = 0; i<str.length(); i++) {
        //     rev = str.charAt(i) + rev;
        // }
        // System.out.println("Reversed String is: "+rev);

        // //determine if a string is a palindrome
        // if(str.equals(rev)) {
        //     System.out.println("str is a palindrome");
        // } else {
        //     System.out.println("str is not a palindrome!");
        // }

        // //find the number of occurrences of a character in a String
        // int counter = 0;
        // System.out.println("Please input a character to search in String: ");
        // char character = myScanner.next().charAt(0);    //as scanner reads String
        // for(int i=0; i<str.length(); i++) {
        //     if(str.charAt(i) == character)
        //         counter++;
        // } 
        // System.out.println("Number of times given character occured in String: "+ counter);

        //find if given two strings are Anagrams or not
        // String str1 = "fgabced";
        // String str2 = "abgcdef";
        // boolean result = ifAnagrams(str1, str2);
        // System.out.println("str1 and str2 are Anagrams: "+result);


        // //calc number of vowels and consonants in a String
        //     vowelsAndConsonants(" Akash Jangra ");


                                // playing with Arrays
        // //get matching elements in an array
        // int arr[] = {1,2,4,3};
        // getMatchingElements(arr);


        // code bubble sort algorithms
        

        myScanner.close();
    }
}