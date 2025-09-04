public class setithbit {
    public static int SetIthBit(int num , int i ){
        int bitMask = 1<<i;
        return num|bitMask;

    }
    public static void main(String[] args) {
        System.out.println(SetIthBit(5, 01));
    }

    
}
