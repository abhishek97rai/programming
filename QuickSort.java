class QuickSort {
    
  public static void main(String[] args) {
    int[] arr = {6, -3, 0, -1, 3, 6, 9, 100, 4};
    System.out.println(Arrays.toString(arr));
    quickSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static void quickSort(int[] nums) {
    quickSort(nums, 0, nums.length-1);
  }

  public static void quickSort(int[] nums, int l, int r) {
    if (l < r) {
        //pivot is index of actual pivot element
        int pivot = partition(nums, l, r);
        quickSort(nums, l, pivot-1);
        quickSort(nums, pivot+1, r);
    }
  }

  public static int partition(int[] nums, int l, int r) {
    //take last element as pivot
    int pivot = nums[r];
    int i = l-1;
    for (int j = l; j < r; j++) {
        if (nums[j] < pivot) {
            i++;
            swap(nums, i, j);
        }
    }
    //swap nums[i+1] with nums[r], ie pivot, to set pivot to its correct position
    swap(nums, i+1, r);
    //return correct index of pivot, for which all elements to the left are smaller than it and right are greater than or equal to it
    return i+1;
  }

  public static void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
    
}
