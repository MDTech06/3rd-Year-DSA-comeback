public class diamond {
    public static void dia(int n) {
        for (int i = 1; i <= n; i++) // upper half of the diamond
            {
            for (int j = 1; j <= n - i; j++)// spaces
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)// stars
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) // lower half of the diamond
             {
            for (int j = 1; j <= n - i; j++)// spaces
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)// stars
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond.dia(5); // calling the method with 5 rows
    }
}
