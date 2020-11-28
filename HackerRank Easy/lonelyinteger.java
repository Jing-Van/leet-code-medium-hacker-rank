    // Complete the lonelyinteger function below.
    static int lonelyinteger(int[] a) {
        int tmp = a[0];
        for (int i = 1; i < a.length; i++) {
            tmp ^= a[i];
        }
        return tmp;


    }
/*
so smart, when equal, offset to 0, 
left to be the unique one

(decimal)    (binary)
     5     =  101
     6     =  110
------------------ xor
     3     =  011

 */