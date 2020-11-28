import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gameOfStones function below.
    static String gameOfStones(int n) {
    String[] memory = new String[101];
    Arrays.fill(memory, "");
    return winner(n, memory);
}

private static String winner(int n, String[] memory){

    if(n == 1){
        return "Second";
    }

    if(2 <= n  && n <= 5){
        return "First";
    }

    if(memory[n] == ""){
        if(winner(n - 5, memory) == "First"
                && winner(n - 3, memory) == "First"
                && winner(n - 2, memory) == "First"){
            memory[n] = "Second";
        }
        else{
            memory[n] = "First";
        }
    }

    return memory[n];

}
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = gameOfStones(n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
