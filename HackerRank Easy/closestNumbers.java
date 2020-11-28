import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int min1 = 0;
        int min2 = 0, minIndex = -1;

        //String result = "";
        int t=arr.length;
        List<Integer> list=new ArrayList<>();
        for (int i = 1; i < t; i++) {
            int diff = Math.abs(arr[i] - arr[i - 1]);
            if (diff < minDiff) {
                minDiff = diff;
                min1 = arr[i - 1];
                min2 = arr[i];
                minIndex = i;
                // very important, otherwise, each new closest pair will be added into
                list.clear();
                list.add(min1);
                list.add(min2);
                //result = min1 + " " + min2;
            }
        }
        for (int i = minIndex + 1; i < t; i++) {
            if (minDiff == Math.abs(arr[i] - arr[i - 1])) {
                list.add(arr[i-1]);
                list.add(arr[i]);
                //result = result + " " + a[i - 1] + " " + a[i];
            }
        }
        
        //System.out.println(result);
        return list.stream().mapToInt(i->i).toArray();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
