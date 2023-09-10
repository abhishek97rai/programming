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

class MinHeap {
  
  int size;
  int capacity;
  int[] heap;

  MinHeap(int capacity) {
    this.size = 0;
    this.capacity = capacity;
    this.heap = new int[capacity];
  }

  void insert(int value) {
    if (size == capacity) {
      System.out.println("Capacity reached! Cannot insert!");
    } else {
      heap[size] = value;
      size++;
      //bring the new element to its correct position by heapifying
      heapUp(size-1);
    }
  }

  int getMin() {
    if (size == 0) {
      System.out.println("Empty heap, no element can be returned!");
    }
    int val = heap[0];
    heap[0] = heap[size-1];
    size--;
    heapDown(0);
    return val;
  }

  void heapUp(int index) {
    int parentIndex = (index-1)/2;
    while (index > 0 && heap[parentIndex] > heap[index]) {
      swap(index, parentIndex);
      index = parentIndex;
      parentIndex = (index-1)/2;
    }
  }

  void heapDown(int index) {
    int leftChildIndex = index*2 + 1;
    int rightChildIndex = index*2 + 2;
    int smallest = index;
    if (leftChildIndex < size && heap[leftChildIndex] < heap[smallest]) {
      smallest = leftChildIndex;
    }
    if (rightChildIndex < size && heap[rightChildIndex] < heap[smallest]) {
      smallest = rightChildIndex;
    }
    //if any of children are smaller, then swap and keep heapifying
    if (smallest != index) {
      swap(index, smallest);
      index = smallest;
      heapDown(index);
    }
  }

  void swap(int ind1, int ind2) {
      int temp = heap[ind1];
      heap[ind1] = heap[ind2];
      heap[ind2] = temp;
    }
}

class Solution {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java " + Runtime.version().feature());

    for (String string : strings) {
      System.out.println(string);
    }

    MinHeap minHeap = new MinHeap(5);
    minHeap.insert(7);
    minHeap.insert(4);
    minHeap.insert(9);
    minHeap.insert(1);
    minHeap.insert(2);
    minHeap.insert(6);
    minHeap.insert(8);
    System.out.println("Current min: " + minHeap.getMin());
    System.out.println("Current min: " + minHeap.getMin());
    System.out.println("Current min: " + minHeap.getMin());
  }
  
}
