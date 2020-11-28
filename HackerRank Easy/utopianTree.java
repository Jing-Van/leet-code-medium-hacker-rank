    // Complete the utopianTree function below.
    static int utopianTree(int n) {
        
        int height = 1;
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 > 0) {
                // odd i.e. spring
                height *= 2;
            } else {
                // even i.e. summer
                height += 1;
            }
        }
        return height;

    }
