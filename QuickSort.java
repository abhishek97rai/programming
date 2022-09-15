public class QuickSort {
    
    //use pivot and find its correct position such that left side is all small and right side is all large, and thus sort recursively
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        }
    }
    
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return i+1;
    }
    
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 0, 11, 1, 2, 7, -3, 9};
        System.out.println("Quick sorting:");
        quickSort(nums, 0, nums.length-1);
        int k;
        for (k = 0; k < nums.length-1; k++) {
            System.out.print(nums[k] + ", ");    
        }
        System.out.print(nums[k]);
    }
    
}