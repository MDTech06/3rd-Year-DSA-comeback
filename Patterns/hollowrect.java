public class hollowrect {
    public static void hollwrect(int totrows, int totcols) {
        for (int i = 1; i <= totrows; i++) { // outer loop
            for (int j = 1; j <= totcols; j++) { // inner loop
                if (i == 1 || i == totrows || j == 1 || j == totcols) { // condition for printing stars
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
 
    public static void main(String[] args) {
        hollowrect.hollwrect(5, 10); // calling the method with 5 rows and 10 columns
    }
