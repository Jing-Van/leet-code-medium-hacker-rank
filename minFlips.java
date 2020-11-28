class Solution {
    // observer summarize rules
    public int minFlips(int a, int b, int c) {
        int res = 0;
        int n1 = a, n2 = b, n3 = c;
        while(n1 != 0 || n2 != 0 || n3 != 0) {
            int r1 = n1%2, r2 = n2%2, r3 = n3%2;
            if(r3 == 0) {
                res += (r1 + r2);
            }else {
                if(r1 + r2 == 0)
                    res += 1;
            }
            n1/=2;
            n2/=2;
            n3/=2;
        }
        return res;        
    }
}