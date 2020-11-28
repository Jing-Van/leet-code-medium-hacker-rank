    static int beautifulDays(int i, int j, int k) {

        int beautiful = 0;
        for (int d = i; d <= j; d++) {
            int reverse = Integer.parseInt(new StringBuilder(String.valueOf(d)).reverse().toString());
            if (Math.abs(d - reverse) % k == 0) {
                beautiful += 1;
            }
        }
        return beautiful;
    }
