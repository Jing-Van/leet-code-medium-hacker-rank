import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    // Complete the flatlandSpaceStations function below.
    // all passed
    static int flatlandSpaceStations(int n, int[] c) {

        Arrays.sort(c);
        for(int num:c){
            System.out.print(num+" ");
        }
        // 0 4
        // 1st last one 
        // 5 2 n =5
        // c.length=2;
        // 5-1-c[1]
        // 5-1-4-0;
        // not sure about this line
        int maxDistance = Math.max(c[0], n - 1 - c[c.length - 1]);
        // IF CHANGED TO 
        // int maxDistance=Integer.MIN_VALUE;
        // 9/20 test cases fail
        // 
        for (int i = 0; i + 1 < c.length; i++) {
            maxDistance = Math.max(maxDistance, (c[i + 1] - c[i]) / 2);
        }
        return maxDistance;
    }

    // time limit exceeded
    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
        int ans=Integer.MIN_VALUE;
        if (n==countOnes(c)){
            return 0;
        }
        int l=c.length;
        for(int i=0;i<l;i++){
            ans=Math.max(ans,furthest(i,c));
        }
        return ans;

    }
    
    static int furthest(int i, int[] arr){
        int r=Integer.MIN_VALUE;
        int n=arr.length;
        for(int j=0;j<n;j++){
            while(j!=i){
                r=Math.max(r,Math.abs(j-i));
            }
        }
        return r;
    }
    static int countOnes(int[] arr){
        int count=0;
        for(int num: arr){
            if(num==1){
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
