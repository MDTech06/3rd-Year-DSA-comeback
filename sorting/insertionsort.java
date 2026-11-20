import java.util.*;
import java.util.Collections;

public class insertionsort {
    public static void insertion (Integer arr[]){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int curr = arr[i];
            int prev = i - 1; 
            while (prev >= 0 && arr[prev] > curr){
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }


    }
    public static void printArr(Integer arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Integer arr[] = {5, 4, 1, 3, 2};
        //insertion(arr);
       // Arrays.sort(arr);
       Arrays.sort(arr, Collections.reverseOrder());
        printArr(arr);
    }
}
