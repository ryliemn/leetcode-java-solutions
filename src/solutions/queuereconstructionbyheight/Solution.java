package solutions.queuereconstructionbyheight;

/**
 * Start the solution by declaring a parallel array of ints, called myK, K being the value for the person indicating
 * how many people are in front of them of equal or greater height. We want to edit those values, but we don't want to
 * edit the original pairs, so the parallel array will do. Declare each value in the array to be equivalent to it's
 * corresponding person's k value.
 *
 * The general idea of the algorithm I'll be using is to first find the shortest person with nobody in front of them
 * (a k value of 0). Once this person is found, add them to the front of the queue. Next, take our parallel array of k
 * values, and decrement each value in this array where the height of the corresponding person is equal to or less than
 * the person who was just added.
 *
 * Since we know by adding that first peron at a given height, all the remaining people with an equal or lesser height
 * must have at least one person in front of them (and this person we've added serves as one of those people), we can go
 * through and decrement the k value for each of those people. What this allows us to do is treat the remainder of the
 * queue as a completely new queue, since the queue up to that point has been completely accounted for by decrementing
 * the k values.
 *
 * Repeat the process for the rest of the people.
 */

public class Solution {
    public int[][] reconstructQueue(int[][] people) {
        int[] myK = new int[people.length];
        for (int i = 0; i < people.length; i++ ) {
            myK[i] = people[i][1];
        }

        int[][] queue = new int[people.length][2];
        int shortestIdx = -1;
        for (int i = 0; i < queue.length; i++) {
            for (int j = 0; j < people.length; j++ ) {
                if ((shortestIdx == -1 || people[j][0] < people[shortestIdx][0]) && myK[j] == 0) {
                    shortestIdx = j;
                }
            }
            queue[i] = people[shortestIdx];
            for (int j = 0; j < myK.length; j++) {
                if (people[j][0] <= queue[i][0]) {
                    myK[j] = myK[j] - 1;
                }
            }
            shortestIdx = -1;
        }
        return queue;
    }
}
