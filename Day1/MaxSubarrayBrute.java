import java.util.*;

public class MaxSubarrayBrute{
    public static int maxsubarraysum(int arr[]){
        
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<arr.length ; i++){
            for(int j=i ; j<arr.length ; j++){
                
            int  CurrSum = 0;
            for(int k=i ; k<=j ; k++){
                CurrSum += arr[k];
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
        System.out.println("Max Subarray Sum is "+maxsubarraysum(numbers));
    }
}