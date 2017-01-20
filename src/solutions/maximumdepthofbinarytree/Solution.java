package solutions.maximumdepthofbinarytree;

//There's a very straightforward recursive solution to this problem, but we're going to pretend we're dealing with huge trees and we'd run out
//of stack space if we did that. Non-recursive methods of going through trees tend to involve queues, so we're going to do that.
//
//We want some way of attaching a depth to a node. For this I've declared a helper class, that I've just called Tuple. It has two properties;
//node, and depth. They should be self explanatory.
//
//Seed the queue with the given root node, paired with a height of 1. Enter a while loop, that will continue so long as we have elements
//in our queue. Pop the next node off the queue (which to begin with will be the root) and grab the depth of it if it's greater than the
//current max depth. Then, offer the node's children to the queue, paired with depths one greater than the current node's depth (of course,
//assuming there are children).
//
//In the end, return the max depth found.

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private class Tuple {
        public TreeNode node;
        public int depth;
        
        public Tuple(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }
    }
    
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root, 1));
        int maxDepth = 0;
        while (!q.isEmpty()) {
            Tuple cur = q.poll();
            maxDepth = Math.max(maxDepth, cur.depth);
            if (cur.node.left != null) q.offer(new Tuple(cur.node.left, cur.depth + 1));
            if (cur.node.right != null) q.offer(new Tuple(cur.node.right, cur.depth + 1));
        }
        return maxDepth;
    }
}
