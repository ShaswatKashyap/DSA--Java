public class KadanesAlgorithm {
    public static int maxsubarray(int arr[]){
        int CurrSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            CurrSum += arr[i];
            if(CurrSum > MaxSum){
                MaxSum = CurrSum;
            }
            if(CurrSum < 0){
               CurrSum= 0 ;
            }

        }
        return MaxSum;
    }
    public static void main(String[] args) {
        int numbers[]={-2,1,-3,4};
        System.out.println("Max Subarray Sum is "+maxsubarray(numbers));
    }
    
}
