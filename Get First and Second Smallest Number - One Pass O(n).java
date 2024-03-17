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
        // Test cases
        int[][] testCases = {
            {7, 2, 5, 1},
            {10, 5, 3, 8, 2},
            {100, 200, 50, 75, 125}
        };

        for (int[] testCase : testCases) {
            int[] result = getFirstAndSecondSmallest(testCase);
            System.out.println("For input: " + Arrays.toString(testCase) + ", First and second smallest integers are: " + Arrays.toString(result));
        }
    }

    public static int[] getFirstAndSecondSmallest(int[] array) {
        // logic is - iterate, update both first and second in each iteration
        // if a number is less than first, second becomes first and first becomes that number
        // else if the number is less than second and >= first, then update second with that number 
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int n: array) {
          if (n < first) {
            second = first;
            first = n;
          } else if (n < second && n >= first) {
            second = n;
          }
        }
        return new int[]{first, second};
    }
}
