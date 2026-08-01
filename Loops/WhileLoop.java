package Loops;
import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
//         int counter = 0; // code to print "Hello World" 100 times
//         while (counter < 100) {
//             System.out.println("Hello World");
//             counter++;
//         }
//System.out.println("The loop has ended");


    //    int counter = 1;  // code to print numbers from 1 to 10
    //    while (counter <= 10) {
    //        System.out.println(counter);
    //        counter++;
    //    }

    // int counter = 1; // code to printnumbers from 1 to n
    // Scanner sc = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // int number = sc.nextInt();
    // while (counter <= number) {
    //     System.out.print(counter + " ");
    //     counter++;
    // }
    // System.out.println();
    
    Scanner sc = new Scanner(System.in); //sum of first n natural numbers
    System.out.print("Enter a number: ");
    int n = sc.nextInt();
    int sum = 0;
    int i = 1;
    while (i <= n) {
        sum += i;
        i++;
    }
    System.out.print("Sum is: " + sum);
}
}