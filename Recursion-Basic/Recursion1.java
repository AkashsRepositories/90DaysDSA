
public class Recursion1{

    // public static void PrintNum(int n)
    // {
    //     if(n == 6)
    //     {
    //         return;
    //     }
    //     System.out.println(n);
    //     PrintNum(n + 1);
    //     // System.out.println(n);          //while returning back
    // }

    // public static void sumFirstN(int i, int n, int sum) {
    //     if(i == n) {
    //         sum += i;
    //         System.out.println(sum);
    //         return;
    //     } 
    //     sum += i;
    //     sumFirstN(i+1, n, sum); 
    //     //System.out.println(i);
    // }


    // public static int calcFactorial(int n){
    //     if(n < 0){
    //         System.out.println("Enter a number more than 0.");
    //         return 0;
    //     }
    //         if(n == 1 || n == 0){
    //             return 1;
    //         }
    //     int fact_nm1 = calcFactorial(n-1);
    //     int fact_n = n * fact_nm1;
    //     return fact_n;
    // }

    // public static void printFib(int a, int b, int n){
    //     /* a = second last term 
    //         b = last term */
    //     if(n == 0){
    //         return;
    //     }
    //     System.out.print(a+b+" ");
    //     printFib(b, a+b, n-1);
        
    // }

    // public static int calcPower(int x, int n){
    //     //base conditions
    //     if(n == 0){         //base case 1
    //         return 1;
    //     }
    //     if(x == 0){            //base case 2
    //         return 0;
    //     }
    //                         //"kaam"
    //     int xPowernm1 = calcPower(x, n - 1);
    //     int xPowern = x * xPowernm1;
    //     return xPowern; 
    // }


    public static int calcPowerLogn(int x, int n){
            //base conditions
            if(n == 0){         //base case 1
                return 1;
            }
            if(x == 0){            //base case 2
                return 0;
            }
                                //"kaam"
            //if n is even
            if(n % 2 == 0){
                return calcPowerLogn(x, n/2)*calcPowerLogn(x, n/2);
            } else{     //if n is odd
                return calcPowerLogn(x, n/2)*calcPowerLogn(x, n/2)*x;   
            }
            
        }
        
    public static void main(String args[]) {
            // PrintNum(5);    //n = 5

            // sumFirstN(1, 5, 0);

        //     int n = 2;
        //     int ans = calcFactorial(n);
        //     System.out.println(ans);

                // int n = 7;
                // int a = 0;
                // int b = 1;
                // System.out.print(a+" ");
                // System.out.print(b+" ");
                // printFib(0, 1, n - 2);
        

                // int power = calcPower(2, 5);
                // System.out.println(power);

                int power = calcPowerLogn(2, 11);
                System.out.println(power);
    }
}