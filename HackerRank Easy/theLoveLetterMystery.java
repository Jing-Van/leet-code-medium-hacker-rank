    // Complete the theLoveLetterMystery function below.
    static int theLoveLetterMystery(String s) {

        int minOpCount = 0;
        int strLen = s.length();
        for (int i = 0; i < strLen / 2; i++) {
            minOpCount += Math.abs(s.charAt(i) - s.charAt(strLen - i-1));
        }
        return minOpCount;
    }
