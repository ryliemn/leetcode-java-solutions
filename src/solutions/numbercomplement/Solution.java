package solutions.numbercomplement;

/**
 * I used some bit manipulation for this problem. To find a number's bitwise complement, you simply need to XOR it
 * against a bit string consisting of all ones. The only tricky part is finding the correct length bit mask, since
 * the problem states no leading zeroes.
 *
 * I did this by using a variable, starting at 2 to the 0th power, which is one. While this variable is less than or
 * equal to num, I bitshift the variable to the left by one, effectively multiplying it by two. I then subtract one
 * from it, resulting in a bitstring of all 1s.
 *
 * For example, take 5, or 101 in binary. The next largest power of two is 8, or 1000 in binary. Subtracting 1 from
 * that gives us 111, which is an appropriate bitstring to XOR against 101. Doing so gives us 010, or 2 in decimal,
 * giving us the correct answer.
 *
 * I'm using a long to account for a single edge case, when 2^32 - 1 is passed in as num. If I used an int for the
 * variable, it would never reach 2^32, and instead continuously overflow.
 */

public class Solution {
    public int findComplement(int num) {
        long pow = 1; // 2 to the 0th
        while (pow <= num) {
            pow = pow << 1;
        }
        pow = pow - 1;
        return (int) (pow ^ num);
    }
}
