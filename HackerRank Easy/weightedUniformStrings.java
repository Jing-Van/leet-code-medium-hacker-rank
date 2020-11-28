import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the weightedUniformStrings function below.
    // 
    static String[] weightedUniformStrings(String s, int[] queries) {
        
        Set<Integer> sumList = new HashSet<>();
        char prev = s.charAt(0);
        sumList.add(prev - 'a' + 1);
        int sum = prev - 'a' + 1;
        for (int i = 1; i < s.length(); i++) {
            char next = s.charAt(i);
            if (next == prev) {
                sum += (prev - 'a' +1);
                sumList.add(sum);
            } else {
                sumList.add(next - 'a' + 1);
                prev = next;
                sum = prev - 'a' + 1;
            }
        }

        List<String> result=new ArrayList<String>();
        
       for (int num: queries) {


            if (sumList.contains(num))
                result.add("Yes");
            else
                result.add("No");
        }
        return result.toArray(new String[0]);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] queries = new int[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        String[] result = weightedUniformStrings(s, queries);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(result[i]);

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
