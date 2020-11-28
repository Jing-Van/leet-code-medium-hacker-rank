import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    // https://www.geeksforgeeks.org/quick-sort/
    // Complete the quickSort function below.
    // arr[] = {10, 80, 30, 90, 40, 50, 70}
    static int partition(int arr[], int begin, int end) {
        int pivot = arr[end];
        int i = (begin-1);
    
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
    
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
    
        int swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;
    
        return i+1;
    }

    static int[] quickSort(int[] arr) {
        int begin=0;
        int end=arr.length-1;
        
        quickS(arr,begin, end);
        return arr;

    }
    static void quickS(int[] arr, int begin, int end){
            
        if (begin < end) {
        int partitionIndex = partition(arr, begin, end);
 
        quickS(arr, begin, partitionIndex-1);
        quickS(arr, partitionIndex+1, end);

        } 
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

        int[] result = quickSort(arr);

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
