import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // test 8 failed
    
    static private String classifyCloud(int cloud) {
        switch (cloud) {
            case 0:
                return "CUMULUS";
            case 1:
                return "THUNDERHEAD";
            default:
                return "UNKNOWN";
        }
    }

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c, int k) {
        int totalEnergy = 100;
        // jump through clouds reducing energy based on cloud type
        for (int i = k; i < c.length; i += k) {
            String cloudType = classifyCloud(c[i]);

            totalEnergy -= 1;
            if (cloudType.equals("THUNDERHEAD")) {
                totalEnergy -= 2;
            }
        }

        // return to initial cloud
        String initialCloudType = classifyCloud(c[0]);
        if (initialCloudType.equals("THUNDERHEAD")) {
            totalEnergy -= 3;
        } else {
            totalEnergy -= 1;
        }

        return totalEnergy;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

     
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

