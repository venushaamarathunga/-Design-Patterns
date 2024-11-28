package searching_algo;

public class LinearSearch {
    public static void main(String args[]){
        int targetVal = 12;
        int[] arr = {10,2,3,12,43,56,31,56,9,8,4,275,34,12};
        int result = search(arr, targetVal);
        if (result != -1)
            System.out.println("Value " +targetVal + " found at index " +result);
        else{
            System.out.println("Value "+ targetVal+ " not found");
        }
    }

    static int search(int arr[], int val){
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == val){
                return i;
            }
        }
        return -1;
    }

}
