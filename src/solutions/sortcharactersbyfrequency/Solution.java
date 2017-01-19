package solutions.sortcharactersbyfrequency;

import java.util.*;

/**
 * Start by looping through the string and creating a map, mapping a character to the number of times it appears in
 * the string.
 *
 * Next, declare another map, mapping an integer (a count) to a list of characters. Run through the map created in
 * the previous step, and map all counts of characters to the corresponding character. We use a list of characters,
 * because multiple characters may occur the same number of times.
 *
 * Since we want the characters to appear in order of frequency, sort the key set and reverse it.
 *
 * Then, loop through the reverse sorted key set, appending each character in each count's list that many number of
 * times.
 */

public class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
            } else {
                freq.put(c, 1);
            }
        }

        Map<Integer, List<Character>> revFreq = new HashMap<>();

        for (char c : freq.keySet()) {
            int count = freq.get(c);
            if (!revFreq.containsKey(count)) {
                revFreq.put(count, new ArrayList<>());
            }
            revFreq.get(count).add(c);
        }

        StringBuilder sb = new StringBuilder();

        List<Integer> counts = new ArrayList<>(revFreq.keySet());
        Collections.sort(counts);
        Collections.reverse(counts);

        for (int count : counts) {
            List<Character> charList = revFreq.get(count);
            for (char c : charList) {
                for (int i = 0; i < count; i++) {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}
