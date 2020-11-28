import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumDistances function below.
    // 3/10 cases failed
    // 
    static int minimumDistances(int[] a) {
        int d=Integer.MAX_VALUE;
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]==a[i]){
                    d=Math.min(d,(j-i));
                }
            }
        }

        //return d;
        // all passed after changed to -1;
        return (d== Integer.MAX_VALUE) ? -1 : minDistance;
    }

    // Complete the minimumDistances function below.
    // all passed
    static int minimumDistances(int[] a) {
        int minDistance = Integer.MAX_VALUE;
        Map<Integer, Integer> value2lastIndex = new HashMap<Integer, Integer>();
        for (int i = 0; i < a.length; i++) {
            if (value2lastIndex.containsKey(a[i])) {
                minDistance = Math.min(minDistance, i - value2lastIndex.get(a[i]));
            }

            value2lastIndex.put(a[i], i);
        }

        return (minDistance == Integer.MAX_VALUE) ? -1 : minDistance;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int result = minimumDistances(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
