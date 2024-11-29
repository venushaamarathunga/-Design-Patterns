package sorting_algo;

public class BubbleSort {

    public static void main(String[] args){
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        sorting(arr);
        System.out.print("Sorted array: ");
        SortedArrayPrint(arr);
    }

    static void sorting(int[] arr){
        boolean swaap;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            swaap = false;
            for (int j=0; j < n-i-1; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaap = true;
                }
            }
            if(swaap == false)
                break;
        }
    }

    static void SortedArrayPrint(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
