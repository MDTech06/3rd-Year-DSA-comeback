public class butterfly_pattern {
    public static void butterfly(int n){
        // 1st or upper half of butterfly
        for ( int i = 1; i <= n; i++){
            for (int j=1; j<=i; j++) //stars{
                System.out.print("*");
           
           for (int j=1; j<=2*(n-i); j++)//spaces{
                System.out.print(" ");
            
            for (int j=1; j<=i; j++) //stars{
                System.out.print("*"); 
            
            System.out.println();
        }
            
        // 2nd or lower half of butterfly
        for ( int i = n; i >= 1; i--){
            for (int j=1; j<=i; j++) //stars{
                System.out.print("*");
           
           for (int j=1; j<=2*(n-i); j++)//spaces{
                System.out.print(" ");
            
            for (int j=1; j<=i; j++) //stars{
                System.out.print("*"); 
            
            System.out.println();
        }
           
         }
          public static void main(String[] args) {
        butterfly_pattern.butterfly(5); // calling the method with 5 rows 
        }
    }

    


            
        
    

