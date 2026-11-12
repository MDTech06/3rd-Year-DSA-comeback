package qns;

public class decTobin {
    //conttructor method
    // int MyNum;
    // int pow = 0;
    // int binNum = 0;

    // public decTobin( int decNum ) {
    //     MyNum = decNum;
    //     while (decNum > 0) {
    //         int lastDigit = decNum % 2;
    //         binNum += lastDigit * (int) Math.pow(10, pow);
    //         pow++;
    //         decNum /= 2;
    //     }
    //     System.out.println("Binary equivalent of decimal number " + MyNum + " is: " + binNum);
    // }

    // public static void main(String[] args) {
    //     int decNum = 16; // Example decimal number
    //     new decTobin(decNum);
    // }
    public static void decToBin (int decNum) {
    int pow = 0;
    int binNum = 0;
    while (decNum > 0) {
        int lastDigit = decNum % 2;
        binNum += lastDigit * (int) Math.pow(10, pow);
        pow++;
        decNum /= 2;
    }
    System.out.println("Binary equivalent of decimal number is: " + binNum);
}
public static void main(String[] args) {
    int decNum = 16; // Example decimal number
    decToBin(decNum);
}
}


