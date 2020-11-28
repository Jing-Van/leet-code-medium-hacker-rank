    // Complete the beautifulBinaryString function below.
    static int beautifulBinaryString(String b) {

            int stepsCount=0;
            String tmpStr=b;
            while(tmpStr.indexOf("010")!=-1){
                tmpStr=tmpStr.replaceFirst("010", "011");
                stepsCount++;
            }
            return stepsCount;
    }
