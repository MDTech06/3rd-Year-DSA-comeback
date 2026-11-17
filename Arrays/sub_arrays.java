package Arrays;

public class sub_arrays {
    public static void printSubArrays(int arr[]){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        //int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++){
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++){
                    
                    //System.out.print(arr[k] + " ");
                    currentSum += arr[k];
                }
                System.out.println(currentSum);
                if (currentSum > maxSum){
                    maxSum = currentSum;
                }
                // tp++;
                // System.out.println();
            }
            // System.out.println();
        }
        System.out.println("Maximum sum of subarrays: " + maxSum);
       // System.out.println("Total subarrays: " + tp);
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
       // System.out.println("Subarrays in the array:");
        printSubArrays(arr);
    }
}
