public class invert_half_pyramid{
    public static void int_halfpyramid(int n){
        for ( int i = 1; i<= n; i++){ // outer loop
            for ( int j = 1; j<= n-i; j++) {
                System.out.print(" "); // printing spaces
            
            } 
            for (int j = 1 ; j<= i; j++){
                System.out.print("*"); // printing stars
            }
            System.out.println(); // moving to the next line

        }
    }

    public static void main(String[] args) {
        invert_half_pyramid.int_halfpyramid(5); // calling the method with 5 rows
    }
}