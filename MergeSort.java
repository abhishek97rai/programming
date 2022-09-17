public class MergeSort {
    
    //keep dividing array into further halves until each element can be separated and compared individually, then combine them in a sorted fashion recursively
    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r-l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
    
    static void merge(int[] arr, int l, int m, int r) {
        
        int i,j,k;
        int n1 = m-l+1;
        int n2 = r-m;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        
        for (i = 0; i < n1; i++)
            leftArr[i] = arr[l+i];
        
        for (j = 0; j < n2; j++)
            rightArr[j] = arr[m+j+1];
        
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = leftArr[i];
            k++;
            i++;
        }
        
        while (j < n2) {
            arr[k] = rightArr[j];
            k++;
            j++;
        }
        
    }
    
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 0, 11, 1, 2, 7, -3, 9};
        System.out.println("Merge sorting:");
        mergeSort(nums, 0, nums.length-1);
        int k;
        for (k = 0; k < nums.length-1; k++) {
            System.out.print(nums[k] + ", ");    
        }
        System.out.print(nums[k]);
    }
    
}