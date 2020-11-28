    // Complete the saveThePrisoner function below.
    static int saveThePrisoner(int n, int m, int s) {
        int remainder = (m - 1) % n;
        int prisoner = remainder + s;

        while (prisoner > n) {
            prisoner -= n;
        }

        return prisoner;

    }