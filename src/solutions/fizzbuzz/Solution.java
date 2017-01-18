package solutions.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

/**
 * It's fizzbuzz.
 */

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> fb = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                fb.add("FizzBuzz");
            } else if (i % 5 == 0) {
                fb.add("Buzz");
            } else if (i % 3 == 0) {
                fb.add("Fizz");
            } else {
                fb.add(i + "");
            }
        }
        return fb;
    }
}
