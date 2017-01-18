package solutions.reversestring;

/**
 * As simple as it gets. Have a for loop run in reverse, from the string's last element to the first element. As it
 * goes over each element, append it to the string builder. Return the toString of the string builder.
 */

public class Solution {
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
