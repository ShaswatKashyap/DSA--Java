public class UpdateBit {
    public static int updateBit(int num, int i, int val) {
        // Step 1: Clear the ith bit
        int mask = ~(1 << i);
        num = num & mask;

        // Step 2: Set ith bit to 'val'
        int updatedNum = num | (val << i);

        return updatedNum;
    }

    public static void main(String[] args) {
        int num = 10; 
        int i = 1;    
        int val = 1;  

        int result = updateBit(num, i, val);
        System.out.println("Updated number: " + result);
    }
}
