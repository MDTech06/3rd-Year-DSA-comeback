public class floyds_triangle {
    public static void floyds_triangle(int n){
        int counter = 1; 
        for ( int i = 1; i<= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(counter + " "); // printing the counter value
                counter++;
            }
            System.out.println();
        }
   
    }
    public static void main(String[] args) {
        floyds_triangle.floyds_triangle(6); // calling the method with 6 rows
    }
}

