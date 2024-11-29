package sorting_algo;

public class QuickSort {
    public static void main(String args[]){
    int arr[] = {90,23,101,45,65,28,67,89,34,29};

    sorting(arr, 0, arr.length-1);
    System.out.print("Sorted array: ");
    SortedArrayPrint(arr);
    }

    static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sorting(int[] arr, int low, int high){
        if(low < high){
            int par = partition(arr, low,high);

            sorting(arr, low, par-1);
            sorting(arr,par+1, high);
        }
    }
    static void SortedArrayPrint(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
