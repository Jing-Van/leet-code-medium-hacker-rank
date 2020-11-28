// reference:
// https://github.com/Koutarouu/HackerRank-Algorithms
// /blob/645878fc73c54d55414593cadb78fcae52e4de65/betweenTwoSets.py
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

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */


    public static int getTotalX(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int aLen = a.size();
        int bLen = b.size();
        int res = 0;
        
        //a, b 정렬
        Collections.sort(a);
        Collections.sort(b);
        
        //i가 두개의 Set 사이의 수 일때, 두 조건을 만족하는 값 찾기 
        //조건1 : (i+1)가 a Set 요소들로 나누어 떨어지는지            (i+1) % a == 0 
        //조건2 : (i+1)가 b Set 요소들을 나누어 떨어지게 하는지         b % (i+1) == 0
        
        //조건1에 만족하는 값 result에 넣기
        for(int i=a.get(aLen-1); i<=b.get(0); i++) {  //4~16
            int cnt = 0;
            for(Integer f:a) {
                if(i%f!=0) break;
                cnt++;
            }
            if(cnt==a.size()) result.add(i); 
        }
        
        //result 리스트에서 조건2 만족하는 값 찾기
        for(Integer r:result) {
            int cnt = 0;
            for(Integer f:b) {
                if(f%r != 0) break;
                cnt++;
            }
            if(cnt==b.size()) res++;
        }
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
