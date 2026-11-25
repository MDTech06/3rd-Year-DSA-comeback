import java.util.*;
public class search {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Element not found in the matrix.");
        return false;
    }

    public static void largestelement(int[][] matrix) {
        int largest = Integer.MIN_VALUE;
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("The largest element in the matrix is: " + largest);
    }

    public static void smallestElement(int[][] matrix) {
        int smallest = Integer.MAX_VALUE;
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("The smallest element in the matrix is: " + smallest);
    }

    public static void main(String args []){
        int matrix [][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        // output 
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        largestelement(matrix);
        smallestElement(matrix);
        System.out.println("Enter the element to search: ");
        int target = sc.nextInt();  
        searchMatrix(matrix, target);

        sc.close();
    }
}
