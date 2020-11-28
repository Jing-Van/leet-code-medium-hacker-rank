    // Complete the maximizingXor function below.
    // brute force
    static int maximizingXor(int l, int r) {

        int maxXor = 0;
        // i+1, so i<r i+1<-r
        for (int i = l; i < r; i++) {
            int temp;
            temp = i ^ (i + 1);
            if (temp > maxXor) {
                maxXor = temp;
            }
        }

        return maxXor;
    }