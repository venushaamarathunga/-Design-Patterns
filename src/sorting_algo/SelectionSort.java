package sorting_algo;

public class SelectionSort {
    public static void main(String[] args){

        int arr[] = { 55,64,3, 34, 25, 12, 22, 11, 90 };
        sorting(arr);

        System.out.print("Sorted array: ");
        SortedArrayPrint(arr);
    }

    static void sorting(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]< arr[min_index]){
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    static void SortedArrayPrint(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
