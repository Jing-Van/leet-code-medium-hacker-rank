    // Complete the introTutorial function below.
    static int introTutorial(int V, int[] arr) {
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==V){
                return i;
            }
        }
        return -1;

    }

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the camelcase function below.
    static int camelcase(String s) {
        int c=0;
        for(char ch:s.toCharArray()){
            if(Character.isUpperCase(ch)){
                c++;
            }
        }
        return c+1;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
    