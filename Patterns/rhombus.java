public class rhombus {
    public static void soild_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)// spaces
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++)// stars
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollow_rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)// spaces
            {
                System.out.print(" ");
            }
            //hollow rectangle logic
            for (int j = 1; j <= n; j++)// stars
            {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rhombus.soild_rhombus(5); // calling the method with 5 rows
        System.out.println();
        rhombus.hollow_rhombus(5); // calling the method with 5 rows
    }
}
