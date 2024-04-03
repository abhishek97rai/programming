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

import java.util.function.Consumer;

public class Solution {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        //pre java 8 way
        Consumer<Integer> consumer = new MyConsumer();
        numbers.forEach(consumer);
        //lambda expression way
        numbers.forEach(n -> System.out.println(n));
    }
    
}

//this is a functional interface, ie an interface with just one method
class MyConsumer implements Consumer<Integer> {
    public void accept(Integer number) {
        System.out.println(number);
    }
}
