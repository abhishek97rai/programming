public class BinarySearch {
    
    //binary search method
    static int binarySearch(int[] arr, int low, int high, int value) {
        if (low <= high) {
            int mid = (low+high)/2;
            if (arr[mid] == value)
                return mid;
            else if (arr[mid] > value)
                return binarySearch(arr, low, mid-1, value);
            else
                return binarySearch(arr, mid+1, high, value);
        } else
            return -1;
    }
    
    public static void main(String[] args) {
        int[] nums = {-3, 0, 1, 2, 4, 5, 7, 9, 11};
        System.out.println("Binary Search:");
        int knownNum = 9;
        System.out.println("Searching for 9 in the list...");
        int index = -1;
        index = binarySearch(nums, 0, nums.length-1, knownNum);
        if (index == -1)
            System.out.println("9 not found in the given list...");
        else
            System.out.println("9 found at index: " + index);
        int unknownNum = 8;
        System.out.println("Searching for 8 in the list...");
        index = binarySearch(nums, 0, nums.length-1, unknownNum);
        if (index == -1)
            System.out.println("8 not found in the given list...");
        else
            System.out.println("8 found at index: " + index);
    }
    
}