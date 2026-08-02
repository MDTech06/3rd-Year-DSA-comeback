package Loops;
import java.util.Scanner;
public class Dowhile {
    
    public static void main(String args[]) {
    // Scanner sc = new Scanner(System.in);  // code to print the entered number until the last digit is 10
    // do {
    //     System.out.print("Entered number is: ");
    //     int n = sc.nextInt();
    //     if ( n % 10 == 0){
    //         break;
    //     }
    //     System.out.println("The number is: " + n);
    // } while (true);

    Scanner sc = new Scanner(System.in);
    do{
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if (n % 10 == 0) {
            continue;
        }
       System.out.println("The number is: " + n);
    }while ();
      

    }
}

