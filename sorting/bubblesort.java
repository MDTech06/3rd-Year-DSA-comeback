public class bubblesort {
    public static void bubble(int arr[]){
        int n = arr.length;
        int swapCount = 0;
        for (int turn = 0; turn < n - 1; turn++){
            boolean swapped = false;
            for ( int j = 0; j < n - 1 - turn; j++){
                if (arr[j] > arr[j + 1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                    swapCount++;
                }
            }
            if (!swapped){
                break;
            }

        }
        System.out.println("Number of swaps: " + swapCount);
    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};
        bubble(arr);
        printArr(arr);
    }
}
