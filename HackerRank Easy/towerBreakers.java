    // Complete the towerBreakers function below.
	// n number of towers, m height of towers
    static int towerBreakers(int n, int m) {
        return (n % 2 == 0 || m == 1) ? 2 : 1;

    }