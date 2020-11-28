import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // compare to python, python has extra processing to render
    // the rounding of numbers

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int totalCostSharedItems = 0;
        int totalCostPerPerson = 0;
        for (int i = 0; i < bill.size(); i++) {
            int currentItem = bill.get(i);
            if (i != k) {
                totalCostSharedItems += currentItem;
            }
        }
        totalCostPerPerson = totalCostSharedItems / 2;

        if (totalCostPerPerson == b) {
            System.out.println("Bon Appetit");
            return;
        }
        int overchargedPrice = b - totalCostPerPerson;
        System.out.println(overchargedPrice);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] nk = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        bonAppetit(bill, k, b);

        bufferedReader.close();
    }
}
