package qns;

public class IsPalindrome {
    public static boolean isPalindrome(int n){
        int palindrome = n;
        int reverse = 0;

        while ( palindrome !=0 ){
            int reminder = palindrome /10 ; 
            reverse = reverse *10 + reminder;
            palindrome /= 10;
    
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
