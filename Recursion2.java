package recursion_intermediate;

public class Recursion2 {

    // public static void towerOfHanoi(int n, String source, String helper, String destination)
    // {
    //     if(n == 1){
    //         System.out.println("transfer disk "+n+" from "+source+" to "+destination);
    //         return;
    //     }
    //     towerOfHanoi(n-1, source, destination, helper);
    //     System.out.println("transfer disk "+n+" from "+source+" to "+destination);
    //     towerOfHanoi(n-1, helper, source, destination);
    // }


    // public static void printRev(String str, int idx) {
    //     if(idx == 0){
    //         System.out.println(str.charAt(idx));
    //         return;
    //     }
    //     System.out.print(str.charAt(idx));
    //     printRev(str, idx - 1);
    // }


    // public static int first = -1;
    // public static int last  = -1;

    // public static void findOccurance(String str, int idx, char element) {
    //     if(idx == str.length()) {
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }

    //     char currChar = str.charAt(idx);
    //     if(currChar == element){
    //         if(first == -1){
    //             first = idx;
    //             last = idx;
    //         } else {
    //             last = idx;
    //         }
    //     }

    //     findOccurance(str, idx + 1, element);
    // }



    // public static boolean isSorted(int arr[], int idx)  {
        
    //     //arr.length-1 because we are using idx+1 in next if statement
    //     if(idx == arr.length - 1) {
    //         return true;
    //     }

    //     // if(arr[idx] < arr[idx + 1]){
    //     //     //array is strictly sorted until now then do a recursive call to check remaining elements 
    //     //     return isSorted(arr, idx + 1);        
    //     // } else{
    //     //     return false;
    //     // }

    //     if(arr[idx] >= arr[idx + 1]){
    //         return false;
    //     } 
            
    //     return isSorted(arr, idx+1);
        
    // }



    // public static void printXatEnd(String str, int idx, int count, String newString) {
    //     if(idx == str.length()) {
    //         for(int i = 0; i < count; i++) {
    //             newString += 'x';
    //         }
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(currChar == 'x') {
    //         count++;
    //         printXatEnd(str, idx+1, count, newString);
    //     } else {
    //         newString += currChar;      //newString = newString + currChar
    //         printXatEnd(str, idx+1, count, newString);
    //     }
    // }



    // public static boolean[] map = new boolean[26];
//map can be directly accessed inside function()
    // public static void removeDuplicates(String str, int idx, String newString) {
    //     if(idx == str.length()) {
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);
    //     if(map[currChar - 'a']) {
    //         removeDuplicates(str, idx+1, newString);
    //     } else {
    //         newString += currChar;
    //         map[currChar - 'a'] = true;
    //         removeDuplicates(str, idx+1, newString);
    //     }
    // }


/*****/
    // public static void subsequences(String str, int idx, String newString) {

    //     if(idx == str.length()) {
    //         System.out.println(newString);
    //         return;
    //     }
    //     char currChar = str.charAt(idx);

    //     //to come in string
    //     subsequences(str, idx+1, newString+currChar);
        
    //     //to not come in string
    //     subsequences(str, idx+1, newString);
    // }


    public static void main(String[] args) {
        // int n = 3;
        // towerOfHanoi(n, "S", "H", "D");


        // String str = "abcd";
        // printRev(str, str.length()-1);


        
        // String str = "abaacdacfaah";
        // findOccurance(str, 0, 'a');


        // int arr[] = { -1, 0, 2, 5};
        // boolean result = isSorted(arr, 0);
        // System.out.println(result);


        // String str1 = "axbcxxd";
        // printXatEnd(str1, 0, 0, "");


        // String str2 = "abbccda";
        // removeDuplicates(str2, 0, "");


        // String str3 = "abc";
        // subsequences(str3, 0, "");
    }
}
