public class Bitmanipulation {
    
    public static int getIthBit(int n ,int i){
        int BitMask=1<<i;
        if((n&BitMask)==0){
            return 0;
        }else{
        return 1;
        }

    }

    public static int setIthBit(int n ,int i){
        int BitMask=1<<i;
        
        return n|BitMask;
    }

    public static int ClearIthBit(int n,int i){
          int BitMask= ~(1<<i);
           return n&BitMask;

    }

    public static boolean isPowerOfTwo(int n){
        return  (n&(n-1))==0;
    }

    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){ ///chck our lsb
                count++;
            }
           n= n>>1;
        }
        return count;
    }
    public static void main(String args[]){
                 System.out.println(ClearIthBit(10, 1));
                 System.out.println(isPowerOfTwo(8));
    }
}
