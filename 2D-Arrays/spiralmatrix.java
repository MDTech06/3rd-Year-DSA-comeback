public class spiralmatrix {
    public static void printsprial( int matrix [][]){
        int n = matrix.length; 
        int m = matrix[0].length;
        int startrow = 0; 
        int startcln = 0;; 
        int endrow = n - 1; 
        int endclm = m - 1;

        while ( startrow <= endrow && startcln <= endclm){
            //top 
            for( int j = startcln; j<=endclm; j++){
                System.out.print(matrix[startrow][j] + " ");
            }
            // right 
            for (int i = startrow + 1; i <= endrow; i++){
                System.out.print(matrix[i][endclm] + " ");
            }
            //bottom 
            for( int j = endclm - 1; j>=startcln; j-- ){
                if (startrow == endrow){
                    break ;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //left 
            for ( int i = endrow - 1; i >= startrow +1; i--){
                 if (startcln == endclm){
                    break ;
                }
                System.out.print(matrix[i][startcln] + " ");
            }
            
            startcln++;
            startrow++;
            endclm--;
            endrow--;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int matrix [] [] = { { 1 , 2 , 3, 4},
                             { 5 , 6 , 7, 8},
                             { 9 , 10 , 11 , 12 },
                            { 13 , 14 , 15 , 16}};
        printsprial(matrix);
    }
}
