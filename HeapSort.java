/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {

  public static void main(String[] args) {
    int[] arr = {6, -3, 0, -1, 3, 6, 9, 100, 4};
    System.out.println(Arrays.toString(arr));
    heapSort(arr);
    System.out.println(Arrays.toString(arr));
  }
    
    public static void heapSort(int[] arr) {
        int n = arr.length;
        //first step is to create a maxheap structure out of the input
        //for that, we'll heapify each of the non leaf nodes
        for (int i = n/2-1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        //we have now ensured that the max element is at the root of the tree (ie index 0)
        //now we can swap first and last elements of the iterated reduced tree
        //and then heapDown 0th element to its correct position
        for (int i = n-1; i > 0; i--) {
            swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //max heap properties of keeping max at root
    public static void heapify(int[] arr, int currSize, int index) {
        int largest = index;
        int leftChildIndex = index*2 + 1;
        int rightChildIndex = index*2 + 2;
        if (leftChildIndex < currSize && arr[leftChildIndex] > arr[largest])
            largest = leftChildIndex;
        if (rightChildIndex < currSize && arr[rightChildIndex] > arr[largest])
            largest = rightChildIndex;
        if (largest != index) {
            swap(arr, largest, index);
            heapify(arr, currSize, largest);
        }
    }
}
