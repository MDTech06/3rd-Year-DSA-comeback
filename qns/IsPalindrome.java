package qns;

public class IsPalindrome {
    public static boolean isPalindrome(int n){
        int palindrome = n;
        int reverse = 0;

        while ( palindrome !=0 ){
            int reminder = palindrome % 10 ; // Get the last digit
            reverse = reverse *10 + reminder; // Build the reverse number 
            palindrome /= 10; // Remove the last digit from the original number
    
        }
        if (n == reverse){
            return true; 
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 121; // Example number
        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
    }
}
