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
        int[] testCases = {10, 15, 21, 29, 35}; // Add more test cases as needed
        
        for (int n : testCases) {
            int leastPrimeFactor = getLeastPrimeFactor(n);
            System.out.println("The least prime factor of " + n + " is: " + leastPrimeFactor);
        }
    }

    // Method to find the least prime factor of n
    public static int getLeastPrimeFactor(int n) {
        //logic is simply to check from 2 to sqrt(n)
        //if n%p == 0, it means it is least prime factor
        if (n == 1)
          return 1;
        for (int i = 2; i * i <= n; i++) {
          if (n % i == 0)
            return i;
        }
        return n;
    }
}
