import java.util.*;

public class Matrices {
    

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        Scanner Sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Sc.nextInt();
            }
        }
             
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
        }

    }
}