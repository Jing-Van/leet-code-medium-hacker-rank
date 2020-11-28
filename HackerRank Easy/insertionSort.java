
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the runningTime function below.


    static int runningTime(int[] arr) {
        return insertionSort(arr);
        
    }
    // one in 7 failed
    // 2 1 3 1 2
    public static int insertionSort(int[] array)
    {
        int totalShifts = 0;
        int nSorted = 1; // the first n items are sorted
        int n = array.length; // total number of items in the array
        while (nSorted < n)
        {
            // get the next item
            int newInt = array[nSorted];
            int i = 0;
            // locate its position in smaller array
            // equivalent to for (int i)
            // thus can't use i for a different loop
            for (i = 0; i < nSorted; i++){

                // if you find a smaller item in there, exchange the two
                if (array[i] > newInt){
                    array[nSorted] = array[i];
                    array[i] = newInt; 
                    // make sure exchanging the two didnt make a new imbalance, continue searching through
                    newInt = array[nSorted];
                    totalShifts++;
                }
            	nSorted++;
        	}
        }
        // print total number of shifts
        System.out.print(totalShifts);
        return totalShifts;
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

        int result = runningTime(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
