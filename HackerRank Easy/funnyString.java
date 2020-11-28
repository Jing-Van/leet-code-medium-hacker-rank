import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the funnyString function below.
    // 3 cases failed run time error
    static String funnyString(String s) {
        String rev = reverse(s);
        boolean stillEq = true;
        for (int i = 1; i < s.length() && stillEq; ++i)
        {
            int comp = (int)s.charAt(i) - (int)s.charAt(i-1);
            int comp2 = (int)rev.charAt(i) - (int)rev.charAt(i-1);
            stillEq = Math.abs(comp) == Math.abs(comp2);
        }

        if (stillEq)
            return "Funny";
        else
            return "Not Funny";
    }

    private static String reverse (String s)
    {
        if (s.length() > 0)
            return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
        else
            return "";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
