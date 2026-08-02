package Loops;
import java.util.Scanner;
public class ForLoop {
    public static void main(String args[]) {
        // for( int i = 1; i <= 10; i++){ //code to print Hello World 10 times
        // System.out.println("Hello World");
        // }
        // for ( int line = 1; line<=4; line++){ // code to print a pattern
        // System.out.println("****");
        // }
        // int n = 1234 ; // code to print the digits of a number in reverse order
        // while (n>0){
        // int lastDigit = n%10;
        // System.out.print(lastDigit + " ");
        // n = n/10;
        // }
        // System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10 ) + lastDigit;
            n = n / 10;
        }
        System.out.println("The reverse of the number is: " + rev);
    }
}
