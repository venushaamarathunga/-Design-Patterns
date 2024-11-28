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

        int result1 = searching(arr, targetVal, left, right);

        if (result != -1)
            System.out.println("Value " + targetVal+ " found at index "+ result1);
        else
            System.out.println("Target not found in array.");
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

    static int searching(int arr[], int val, int left, int right){
        int result = -1;
        while (left<=right) {
            int midVal = left + (right - left) / 2;
            if (val == arr[midVal]){
                return  midVal;
            }else if (val > arr[midVal]){
                left = midVal+1;
            }else {
                right = midVal - 1;
            }
        }
        return  result;
    }

}
