public class SelectionSort {
    
    //select/find minimum in each iteration, and swap it with first element of the unsorted array
    static void selectionSort(int[] arr) {
        
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
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
        System.out.println("Selection sorting:");
        selectionSort(nums);
    }
    
}
