package searching_algo;

public class JumpSearch {
    public static void main (String[] args){
        int[] arr = {0, 6, 12, 14, 19, 22, 48, 66, 79, 88, 104, 126};
        int targetVal = 22;
        int result  = searching(arr, targetVal);

        if (result != -1)
            System.out.println("Value " + targetVal+ " found at index "+ result);
        else
            System.out.println("Target not found in array.");

    }

    static int searching(int[] arr, int val){
        int first=0, n = arr.length;
        int m = (int)Math.sqrt(n);
        while (arr[m]<=val && m<n){
            first = m;
            m += m;
            if(m > n-1){
                return -1;
            }
        }
        for(int j = first; j<m; j++) {
            if(arr[j] == val)
                return j;
        }
        return -1;
    }
}
