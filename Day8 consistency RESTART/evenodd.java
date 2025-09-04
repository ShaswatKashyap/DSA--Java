
public class evenodd{
    public static void OddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }


    public static void main (String args[]){
        OddOrEven(3);
        OddOrEven(11);
        OddOrEven(14);
    }
}
