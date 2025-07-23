public class searchsorted {
    public static boolean staircsesearch(int matrix[][] , int key){
        int n = matrix.length;
        int m = matrix[0].length;
        int i = 0 ; 
        int j = m-1;
        while(i<n && j>=0){
            if(matrix[i][j]==key){
                System.out.println("Element found at index :"+"("+i+" "+j +")");
                return true;
            }
            
            else if(key<matrix[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("key not found");
        return false;
    }
     public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };

        int key = 29;
        staircsesearch(matrix, key);
    }
}
