public class clearithbit {
    public static int ClearIthBit(int num , int i){
        int bitMask = ~(1<<i);
        return num & bitMask ; 

    }
    public static void main(String[] args) {
        
        System.out.println(ClearIthBit(14, 1));
    }
    
}
