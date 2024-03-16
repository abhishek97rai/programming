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
        int[] testCases = {24, 35, 48, 53}; // Add more test cases as needed
        
        for (int n : testCases) {
            List<Integer> primeFactors = getAllPrimeFactors(n);
            System.out.println("The prime factors of " + n + " are: " + primeFactors);
        }
    }

    // Method to return list of all prime factors of n
    public static List<Integer> getAllPrimeFactors(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        
        // Find prime factors
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }

        primeFactors.add(n);
        return primeFactors;
    }
}
