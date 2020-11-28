import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // time limit exceeded
    private static int findMin (int[] A)
    {
        int min = A[0];
        for (int i =1; i<A.length; i++)
        {
            if (A[i] < min)
            {
                min = A[i];
            }
        }
        return min;
    }
    
    private static int countNonZeros (int[] A)
    {
        int zeros = 0;
        for (int i =0; i<A.length; i++)
        {
            if (A[i] == 0)
            {
                zeros++;
            }
        }
        int nonZeros = A.length - zeros;
        return nonZeros;
    }
        
    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        
        ArrayList<Integer> r=new ArrayList<>();
        int nums = countNonZeros(arr);
        r.add(nums);
        while (nums > 0)
        {
            int mins = findMin(arr);
            System.out.println(mins);
            for (int j = 0; j<arr.length; j++)
            {
                arr[j]=arr[j]-mins;
            }
            nums = countNonZeros(arr);
            System.out.println(nums);
            r.add(nums);
        }
        
        int[] result=new int[r.size()];
        return r.stream().mapToInt(i->i).toArray();
    
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

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
