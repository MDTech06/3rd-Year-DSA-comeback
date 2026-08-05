public class half_pyramid {
    public static void main(String[] args) {
    // int n = 4; // Number of lines
    // for (int line = 1; line<= n; line++){
    //     for (int number = 1; number <= line; number++){
    //         System.out.print(number);
    //     }
    //     System.out.println();
    // }

    int n= 4; // Number of lines
    char ch = 'A'; // Starting character
    for (int line = 1; line <= n; line++){
        for (int character = 1; character <= line; character++){
            System.out.print(ch);
            ch++; // Move to the next character in the alphabet
        }
        System.out.println(); // Move to the next line after each row
    }

    
}
}

