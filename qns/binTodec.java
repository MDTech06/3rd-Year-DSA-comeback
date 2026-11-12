package qns;

public class binTodec {
    int MyNum;
    int pow = 0;
    int decNum = 0;

    public binTodec(int binNum) {
        MyNum = binNum;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum += lastDigit * Math.pow(2, pow);
            pow++;
            binNum /= 10;
        }
        System.out.println("Decimal equivalent of binary number " + MyNum + " is: " + decNum);
    }

    public static void main(String[] args) {
        int binNum = 1011; // Example binary number
        new binTodec(binNum);
    }
}