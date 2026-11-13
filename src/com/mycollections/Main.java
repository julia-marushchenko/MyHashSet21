/**
 *  Java program to create, update, read, and delete HashSet.
 */

package com.mycollections;

import java.util.HashSet;
import java.util.Set;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create.
        Set<Long> numbers = new HashSet<>();

        // Add.
        numbers.add(1000000000L);
        numbers.add(2000000000L);
        numbers.add(3000000000L);

        // Display.
        System.out.println(numbers); // Output: [3000000000, 2000000000, 1000000000]

        // Update.
        numbers.add(4000000000L);

        // Display.
        System.out.println(numbers); // Output: [3000000000, 2000000000, 1000000000, 4000000000]

        // Clear.
        numbers.clear();

    }
}