public class BubbleSort {
    
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }                    
            }
            if (!swap)
                break;
        }
        int k;
        for (k = 0; k < arr.length-1; k++) {
            System.out.print(arr[k] + ", ");    
        }
        System.out.print(arr[k]);
    }
    
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 0, 11, 1, 2, 7, -3, 9};
        System.out.println("Bubble sorting:");
        bubbleSort(nums);
    }
    
}