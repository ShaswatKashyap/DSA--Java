public class ClearLastBit {
    public static int clearLastBit(int num , int i){
        int BitMask = (~0<<i);
        return (num & BitMask);
    }
    public static void main(String[] args) {
        System.out.println(clearLastBit(15, 2));
    }
    
}
