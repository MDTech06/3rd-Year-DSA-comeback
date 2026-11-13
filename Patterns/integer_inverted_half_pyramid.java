public class integer_inverted_half_pyramid {
    public static void int_inverted_halfpyramid(int n){
        for( int i = 1; i<=n; i++){
            for(int j = 1; j<= n-i+1; j++){
                System.out.print(j); // printing numbers
            }
            System.out.println(); // moving to the next line
        }
    }
    public static void main(String[] args) {
        integer_inverted_half_pyramid.int_inverted_halfpyramid(5); // calling the method with 5 rows
    }
}
