public class LinearSearch {
    
    //linear search method
    static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 0, 11, 1, 7, -3, 9};
        System.out.println("Linear Search:");
        int knownNum = -3;
        System.out.println("Searching for -3 in the list...");
        int index = -1;
        index = linearSearch(nums, knownNum);
        if (index == -1)
            System.out.println("-3 not found in the given list...");
        else
            System.out.println("-3 found at index: " + index);
        int unknownNum = 8;
        System.out.println("Searching for 8 in the list...");
        index = linearSearch(nums, unknownNum);
        if (index == -1)
            System.out.println("8 not found in the given list...");
        else
            System.out.println("8 found at index: " + index);
    }
    
}