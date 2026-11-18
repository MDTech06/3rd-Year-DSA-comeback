

public class kadanes {
    public static void printmaxsum(int num[]){
        // Check if all elements are negative
        boolean allNegative = true;
        int maxNegative = Integer.MIN_VALUE;
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] >= 0) {
                allNegative = false;
                break;
            }
            maxNegative = Math.max(maxNegative, num[i]);
        }
        
        // If all elements are negative, print the least negative number and return
        if (allNegative) {
            System.out.println("Maximum sum of subarrays: " + maxNegative);
            return;
        }

        //kadane's algorithm
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < num.length; i++){
            cs = cs + num[i];
            if (cs < 0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Maximum sum of subarrays: " + ms);

    }
    public static void main(String[] args) {
        int num[] = {-1, -9, -6, -7, -10};
        printmaxsum(num);
    }
}
