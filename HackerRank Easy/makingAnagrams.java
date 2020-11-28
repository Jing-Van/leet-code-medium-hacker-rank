import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makingAnagrams function below.
    // cdeabc
    // l1+l2-2*b operations
    static int makingAnagrams(String s1, String s2) {
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
        int length = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (hmap.containsKey(c)) {
                hmap.put(c, hmap.get(c) + 1);
            } else {
                hmap.put(c, 1);
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (hmap.containsKey(c) && hmap.get(c) != 0) {
                hmap.put(c, hmap.get(c) - 1);
                length += 2;
            }
        }
        return (s1.length() + s2.length() - length);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = makingAnagrams(s1, s2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
