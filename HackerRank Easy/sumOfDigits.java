import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kaprekarNumbers function below.
    static void kaprekarNumbers(int p, int q) {
        //System.out.println(p+"->"+q);
        
        for(int i=p;i<=q;i++){
            if(checkNum(i)){
                System.out.print(i+" ");
            }
        }

    }


    // less cases failed but 4/7 failed still
    private static boolean checkNum(int num) {       
        
        int result = (int)Math.pow(num, 2);     
        String stringResult = String.valueOf(result);  
                
        if (stringResult.length() == 1) {
            if(num==1){
                return true;
            }else{
                return false;
            }
            
        } else {
        
            for (int i = 1; i < stringResult.length(); i++) {

                String s1 = stringResult.substring(0, i);
                String s2 = stringResult.substring(i, stringResult.length());
                int num1 = Integer.parseInt(s1);
                int num2 = Integer.parseInt(s2);
                int sum = num1 + num2;

                if (sum == num) {      
                    
                    if (num1 == 0 || num2 == 0) {
                        return false;     
                        
                    } else {                       
                        return true;                      
                    }
                }
            }
        }
        
        return false;
    }
    static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
            // n/=10 equivalent
        }
        return sum;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        kaprekarNumbers(p, q);

        scanner.close();
    }
}
