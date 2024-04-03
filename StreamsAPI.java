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

public class Solution {
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Traditional loop to filter even numbers and print them
        for (Integer number : numbers) {
            if (number % 2 == 0) { // Check if number is even
                System.out.println(number); // Print even number
            }
        }

        //Streams API
        numbers.stream()
               .filter(number -> number % 2 == 0) // Filter even numbers
               .forEach(System.out::println);      // Print each even number
    }
    
}

