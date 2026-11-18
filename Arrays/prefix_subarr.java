public class prefix_subarr {
    public static void printmaxsubarr(int numbers[]){
        int currentSum = 0; 
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // Calculate the prefix sum array
        for (int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        // Find the maximum sum of subarrays
        for (int i = 0; i < prefix.length; i++){
            int start = i;
            for (int j = i; j < prefix.length; j++){
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
              
                if (maxSum < currentSum){
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maximum sum of subarrays: " + maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {-1, 9, 6, -7, 10};
        printmaxsubarr(numbers);
    }
}
