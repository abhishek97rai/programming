public class InsertionSort {
    
    //consider one item at a time and place it in its correct sorted position in the sorted part (until that point of time)
    static void insertionSort(int[] arr) {
        
        for (int i = 0; i < arr.length-1; i++) {
            int j = i+1;
            while (j > 0) {
                if (arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                j--;
            }
        }
            
        int k;
        for (k = 0; k < arr.length-1; k++) {
            System.out.print(arr[k] + ", ");    
        }
        System.out.print(arr[k]);
    }
    
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 0, 11, 1, 2, 7, -3, 9};
        System.out.println("Insertion sorting:");
        insertionSort(nums);
    }
    
}