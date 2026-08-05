public class StarPattern {
    public static void main(String[] args) {
// // Loop through each line       
//         for (int line =1; line <= 4; line++){
// // Loop through each star in the current line            
//             for (int star = 1; star<= line; star++){
//                 System.out.print("*");
//             }
//             System.out.println(); // Move to the next line after each row
//         }
int n = 4; // Number of lines
for (int line = 1; line <= n; line++){

    for (int star = 1; star <= n-line+1; star++){
        System.out.print("*");
    }
    System.out.println(); // Move to the next line after each row
}


}
}