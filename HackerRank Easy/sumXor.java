 
 // 5/13 test cases failed :(
    static long sumXor(long n) {
        int count=0;
        for(int i=0;i<n;i++){
            if((i+n)==(i^n)){
                count++;
            }
        }

        return count;
    }

// all passed
    static long sumXor(long n) {
        if (n == 0) {
            return 1;
        }
        int c = 0;
        String num = Long.toBinaryString(n);
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
                c++;
            }
        }
        return (long) Math.pow(2.0, c);
    }