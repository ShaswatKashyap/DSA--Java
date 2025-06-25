public class MaxSubarrayPrefix {
    public static int maxsubarray(int arr[]){

        int n = arr.length;

        //creating prefix array
        int prefix[] = new int[n];
        prefix[0]=arr[0];
        for(int i=1 ; i<n ; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }


        int MaxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n ; j++){
                 int CurrSum;
                 if(i==0){
                    CurrSum = prefix[j];
                 }
                 else{
                    CurrSum = prefix[j] - prefix[i-1];
                 }
                 if(CurrSum>MaxSum){
                    MaxSum = CurrSum;
                 }

            }

        }
        return MaxSum;
    }
    public static void main(String[] args) {
        int numbers[]={-2,1,-3,4};
        System.out.println("Max Subarray Sum is "+maxsubarray(numbers));
    }
    
}
