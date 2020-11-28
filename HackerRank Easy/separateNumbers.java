import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// fractional print of result, related to missing returns

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {

        if (s.charAt(0) == '0') {
            System.out.println("NO");
            return;
        }

        for (int length = 1; length * 2 <= s.length(); length++) {
            long firstNumber = Long.parseLong(s.substring(0, length));

            StringBuilder sequence = new StringBuilder();
            long number = firstNumber;
            while (sequence.length() < s.length()) {
                sequence.append(number);
                number++;
            }
            if (sequence.toString().equals(s)) {
                System.out.println("YES"+" "+firstNumber);
                continue;
            }else if (!sequence.toString().equals(s)){
                System.out.println("NO");
                continue;
            }
        }
        //System.out.println("NO");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}


public class Solution {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {

        if (s.charAt(0) == '0') {
            System.out.println("NO");
            return;
        }

        for (int length = 1; length * 2 <= s.length(); length++) {
            long firstNumber = Long.parseLong(s.substring(0, length));

            StringBuilder sequence = new StringBuilder();
            long number = firstNumber;
            while (sequence.length() < s.length()) {
                sequence.append(number);
                number++;
            }
            if (sequence.toString().equals(s)) {
                System.out.println("YES"+" "+firstNumber);
            }else{
                System.out.println("NO");
            }
        }
        //System.out.println("NO");
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}


/* 
Your Output (stdout)
YES 1
YES 9
YES 99
NO
Expected Output

Download
YES 1
YES 9
YES 99
NO
NO
NO
NO
not sure why
*/
public class Solution {

    // Complete the separateNumbers function below.
    static void separateNumbers(String s) {

        if (s.charAt(0) == '0') {
            System.out.print("NO");
        }

        for (int length = 1; length * 2 <= s.length(); length++) {
            long firstNumber = Long.parseLong(s.substring(0, length));

            StringBuilder sequence = new StringBuilder();
            long number = firstNumber;
            while (sequence.length() < s.length()) {
                sequence.append(number);
                number++;
            }
            if (sequence.toString().equals(s)) {
                System.out.println("YES"+" "+firstNumber);
            }
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            separateNumbers(s);
        }

        scanner.close();
    }
}
