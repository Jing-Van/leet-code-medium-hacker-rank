import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // map {1=3, 2=1, 3=2}
    // list [2, 3, 1]
    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int n=p.length;
        HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
        int j=1;
        for(int num:p){
            mp.put(num,j);
            j++;
        }

        List<Integer> list =new ArrayList<>();
        for(int i=1;i<=n;i++) {
            list.add(mp.get(mp.get(i)));
        }
            
        return list.stream().mapToInt(i->i).toArray();


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

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
