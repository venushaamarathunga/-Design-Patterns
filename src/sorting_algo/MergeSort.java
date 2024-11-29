package sorting_algo;

public class MergeSort {
    public static void main(String args[]){
        int arr[] = {90, 23, 101, 45, 65, 12, 11, 13, 5, 6, 7, 28, 67, 89, 34, 29};

        sorting(arr, 0, arr.length-1);
        System.out.print("Sorted array: ");
        SortedArrayPrint(arr);
    }

    static void merge(int[] arr,int low, int mid, int high){
        int n1 = mid - low +1;
        int n2 = high - mid;

        // temp array
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for (int i = 0; i < n1; i++)
            arr1[i] = arr[low+i];
        for (int j = 0; j < n2; j++)
            arr2[j] = arr[mid + 1 + j];

        int i=0, j=0, k=low;

        while (i<n1 && j<n2){
            if(arr1[i] <= arr2[j]){
                arr[k] = arr1[i];
                i++;
            }else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i<n1){
            arr[k] = arr1[i];
            k++;
            i++;
        }

        while (j<n2){
            arr[k] = arr2[j];
            j++;k++;
        }

    }

    static void sorting(int[] arr, int low, int high){
        if(low < high){
            int mid = (low+high)/2;

            sorting(arr, low, mid);
            sorting(arr,mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    static void SortedArrayPrint(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
