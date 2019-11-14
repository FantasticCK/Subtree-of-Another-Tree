package com.CK;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (t == null)
            return true;

        if (s == null)
            return false;

        if (isSameTree(s, t))
            return true;

        boolean left = isSubtree (s.left, t);
        boolean right = isSubtree (s.right, t);
        return left || right;

    }

    private boolean isSameTree(TreeNode s, TreeNode t){
        if ( s==null && t==null)
            return true;

        if ( (s == null && t != null) || (s !=null && t == null) )
            return false;

        if (s.val != t.val)
            return false;

        boolean left = isSameTree (s.left, t.left);
        boolean right = isSameTree (s.right, t.right);
        return left && right;
    }
}