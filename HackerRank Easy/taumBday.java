   public static long taumBday(int b, int w, int bc, int wc, int z) {
    // Write your code here
        if(bc<wc){
            if(bc+z<wc){
                wc = bc+z;
            }
        }else{
            if(wc+z<bc){
                bc = wc+z;
            }
        }
        return (long)((long)wc*w + (long)bc*b);
    }
