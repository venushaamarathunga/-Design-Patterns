package sorting_algo;

public class InsertionSort {
    public static void main(String[] args){

        int arr[] = { 55,64,3, 34, 25, 12, 22, 11, 90 };
        sorting(arr);

        System.out.print("Sorted array: ");
        SortedArrayPrint(arr);
    }
    static void sorting(int[] arr){
        int j, temp;
        for (int i = 1; i < arr.length; i++) {
            j=i;
            while (j>0 && arr[j-1] > arr[j]){
                temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    static void SortedArrayPrint(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
