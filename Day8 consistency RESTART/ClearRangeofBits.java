public class ClearRangeofBits {
    public static int clearRangeBit(int i , int j , int num){
        int a = ((~0)<<(j+1));
        int b = ((1<<i)-1);
        int bitMask = a|b ;
        return num & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(clearRangeBit(2, 4, 10));
    }
    
}
