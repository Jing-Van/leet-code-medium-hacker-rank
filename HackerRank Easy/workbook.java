    /*
    5 3  
    4 2 6 1 10 
    */
    // wrong answer
    static int workbook(int n, int k, int[] arr) {
        int count=1;
        int numPages=1;
        for(int i=1;i<=n;i++){
            numPages+=arr[i-1]/k+1;
            if(numPages==i){
                count++;
            }
        }
        return count;


    }