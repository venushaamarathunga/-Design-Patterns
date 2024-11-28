package searching_algo;

public class BinarySearch {
    public static void main(String args[]){
        int[] arr  = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int targetVal = 13;
        int left = 0;
        int right = arr.length - 1;

        int result = search(arr, targetVal, left, right);

        if (result != -1)
            System.out.println("Value " + targetVal+ " found at index "+ result);
        else{
            System.out.println("Target not found in array.");
        }
    }


    static int search(int[] arr, int val, int left, int right){
        int mid = (left + (right-left)/2);

        if(left > right){
            return -1;
        }

        if(val == arr[mid]){
            return mid;
        }else if(val < arr[mid]){
            return search(arr, val, left, mid-1);
        }
        else{
            return search(arr, val, mid+1, right);
        }
    }

}
