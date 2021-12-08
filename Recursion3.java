package recursion_adv;

import java.util.ArrayList;

public class Recursion3 {

    // //problem 1
    // public static void printPerm(String str, String permutation) {
    //     if(str.length() == 0) {
    //         System.out.println(permutation);
    //         return;
    //     }
    //     for(int i = 0; i < str.length(); i++) {
    //         char currChar = str.charAt(i);
    //         //"abc" = "bc" for i = 0
    //         String newStr = str.substring(0, i) + str.substring(i + 1);
    //         printPerm(newStr, permutation+currChar);
    //     }
    // }


    // //problem 2
    // public static int countPaths(int i, int j, int n, int m) {
    //     //for corner cases where only one direction is legal
    //     if(i == n || j == m) {
    //         return 0;
    //     }
    //     //for the destination reached
    //     if(i == n-1 && j == m-1) {
    //         return 1;
    //     }

    //     //if moving downwards 
    //     int downPaths = countPaths(i + 1, j, n, m);
        
    //     //if moving rightwards
    //     int rightPaths = countPaths(i, j+1, n, m);

    //     return rightPaths + downPaths;
    // }


    
    // //problem 3
    // public static int placeTiles(int n, int m) {

    //     //base case 1
    //     if(n == m) {
    //         return 2;
    //     } 

    //     //base case 2
    //     if(n < m) {
    //         return 1;
    //     }

    //     //vertically placed
    //     int vertPlacements =  placeTiles( n - m, m);

    //     //horizontally placed 
    //     int horPlacements = placeTiles( n - 1, m);

    //     return vertPlacements + horPlacements;
    // }


    // //problem 4
    // public static int callGuests(int n) {

    //     //Base case
    //     if(n <= 1) {
    //         return 1;
    //     }

    //     //1st way - single
    //     int ways1 = callGuests(n - 1);

    //     //2nd way - pairing
    //     int ways2 = (n-1)*callGuests(n - 2);

    //     return ways1 + ways2;
    // }



    // // problem 5
    public static void printSubsets(int n, ArrayList<Integer> subset) {

        if(n == 0) {
            System.out.println(subset);
            return;
        }
        //if wanna add
        subset.add(n);
        printSubsets(n - 1, subset);

        //if doesn't add
        subset.remove(subset.size()-1);     //removing integer added for upper task
        printSubsets(n - 1, subset);
    
    }


    public static void main(String[] args) {
        
        // //problem 1
        // String str = "abc";
        // printPerm(str, "");

        
        // //problem 2
        // int n = 3, m = 3;
        // int totalPaths = countPaths(0, 0, n, m);
        // System.out.println(totalPaths); 


        // //problem 3
        // int n = 4, m = 2;
        // System.out.println(placeTiles(n, m));


        // //problem 4
        // int n = 4;
        // System.out.println(callGuests(n));
    

        // //problem 5
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        printSubsets(n, subset);


    }
}
