package Arrays;

public class pairs {
    public static void printPairs(int arr[]) {
        int total_pairs = 0;
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i + 1; j < arr.length; j++) {
                
                System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
                total_pairs ++; 
            }
            System.out.println();
            
        }
        System.out.println("Total pairs: " + total_pairs);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("Pairs in the array:");
        printPairs(arr);
    }
    

}
