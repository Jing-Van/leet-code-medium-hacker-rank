import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the anagram function below.
    static int anagram(String s) {
        int n=s.length();
        if(n%2==1){
            return -1;
        }
        
        int minNoOfChanes = 0;
        // if ((s.length() & 1) == 1)
        //     return -1;
        int charFreq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (i < s.length() / 2) {
                charFreq[index]++;
            } else {
                charFreq[index]--;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (charFreq[i] > 0) {
                minNoOfChanes += charFreq[i];
            }

        }
        return minNoOfChanes;       

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = anagram(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
