package Arrays;

public class linear_search {
    public static int lin_search( int numbers [], int key){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    
    
}
public static void main(String[] args)
{
    int numbers [] = { 2 ,4,6,8,10,12,14,16,18,20};
    int key = 100; 

    int index = lin_search(numbers, key);
    if (index != -1){
        System.out.println("Element found at index: " + index);
    } else {
        System.out.println("Element not found in the array.");
    }
}
}

