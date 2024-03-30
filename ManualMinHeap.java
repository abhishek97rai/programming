import java.util.*;

class Solution {

  public static void main(String[] args) {
    //good video to understand heapify operations: https://www.youtube.com/watch?v=Dvq-YKeuO9Y&ab_channel=BlueTreeCode
    //Create a Min Heap structure
    //perform 3 operations - add, poll, peek
    MinHeap minHeap = new MinHeap(7);
    minHeap.add(4);
    System.out.println(minHeap.peek()); //4
    minHeap.add(-4);
    minHeap.add(0);
    minHeap.add(-1);
    System.out.println(minHeap.peek()); //-4
    minHeap.add(3);
    minHeap.add(-1);
    minHeap.add(1);
    System.out.println(minHeap.peek()); //-4
    //capacity reached, next insertions should remove min element from heap and add new element
    System.out.println(Arrays.toString(minHeap.getArray())); //-4,-1,-1,0,1,3,4
    minHeap.add(2);
    System.out.println(minHeap.peek()); //-1
    System.out.println(Arrays.toString(minHeap.getArray())); //-1,-1,0,1,2,3,4
    System.out.println(minHeap.poll()); //-1
    System.out.println(Arrays.toString(minHeap.getArray())); //-1,0,1,2,3,4
    System.out.println(minHeap.poll()); //-1
    System.out.println(Arrays.toString(minHeap.getArray())); //0,1,2,3,4
    minHeap.add(-2);
    System.out.println(minHeap.peek()); //-2
    System.out.println(Arrays.toString(minHeap.getArray())); //-2,0,1,2,3,4
  }
  
}

class MinHeap {
    
    int[] heap;
    int size;
    int capacity;

    MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    public void add(int val) {
        if (size == capacity)
            poll();
        size++;
        heap[size-1] = val;
        heapUp(size-1);
    }

    public void heapUp(int index) {
        while (index > 0) {
            int parentIndex = (index-1)/2;
            if (heap[index] < heap[parentIndex])
                swap(index, parentIndex);
            index = parentIndex;
        }
    }

    public void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public int poll() {
        int val = heap[0];
        swap(0, size-1);
        size--;
        heapDown(0);
        return val;
    }

    public void heapDown(int index) {
        if (index == size-1)
            return;
        int leftChildIndex = index*2 + 1;
        int rightChildIndex = index*2 + 2;
        int smallest = index;
        if (leftChildIndex < size && heap[leftChildIndex] < heap[smallest])
            smallest = leftChildIndex;
        if (rightChildIndex < size && heap[rightChildIndex] < heap[smallest])
            smallest = rightChildIndex;
        if (smallest != index) {
            swap(index, smallest);
            heapDown(smallest);
        }
    }

    public int peek() {
        return heap[0];
    }

    //this method only returns the heap array, which doesnt actually represent the sorted array
    //it just represents the array that the heap uses to maintain its sorted structure
    public int[] getArray() {
        return heap;
    }

}
