import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingSort function below.
    // 1 case failed
    /* maybe not max value, but 100?
    in put n is number of items in arr, 
    not max +1 

nput (stdin)

Download
100
63 54 17 78 43 70 32 97 16 94 74 18 60 61 35 83 13 56 75 52 70 12 24 37 17 0 16 64 34 81 82 24 69 2 30 61 83 37 97 16 70 53 0 61 12 17 97 67 33 30 49 70 11 40 67 94 84 60 35 58 19 81 16 14 68 46 42 81 75 87 13 84 33 34 14 96 7 59 17 98 79 47 71 75 8 27 73 66 64 12 29 35 80 78 80 6 5 24 49 82
Expected Output

Download
2 0 1 0 0 1 1 1 1 0 0 1 3 2 2 0 4 4 1 1 0 0 0 0 3 0 0 1 0 1 2 0 1 2 2 3 0 2 0 0 1 0 1 1 0 0 1 1 0 2 0 0 1 1 1 0 1 0 1 1 2 3 0 1 2 0 1 2 1 1 4 1 0 1 1 3 0 0 2 1 2 3 2 2 2 0 0 1 0 0 0 0 0 0 2 0 1 3 1 0
Sorting array, return sorted array uncomment below, all passed
    */

    static int[] countingSort(int[] arr) {

        int n=arr.length;
        if (n< 2) return arr;
        
        int[] sortedArray  =  new int[n];
        
        int maxNumber = Integer.MIN_VALUE;
        //O(n)
        for (int i =0; i< n ; ++i) {
            if (arr[i]> maxNumber) maxNumber = arr[i];
        }
        // +1 cause there is 0 at front
        // max number is 3, indexed to be 4;
        int[] howManyTimesEachNum = new int[maxNumber+1];
        // change to ->>>                   n, 
        // singel case failed but more tests failed
        
        //O(n)
        for (int i =0; i< n ; ++i) {
            ++howManyTimesEachNum[arr[i]] ;
        }
        
        return howManyTimesEachNum;
        // //O(n)
        // int  sortedArrayIndex =0;
        // for (int i =0; i< howManyTimesEachNum.length ; ++i) {
        //     for (int j = 1 ; j<= howManyTimesEachNum[i] ; ++j) {
        //         sortedArray[sortedArrayIndex++] =  i;
        //     }
        // }
        
        // return sortedArray;
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

        int[] result = countingSort(arr);

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
