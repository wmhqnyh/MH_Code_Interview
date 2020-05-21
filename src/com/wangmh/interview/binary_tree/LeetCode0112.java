package com.wangmh.interview.binary_tree;

import com.wangmh.interview.wmh.TreeNode;

/**
* <pre>
*   @author : mh.wang
*   @date   : 2020/5/18 13:45
*   @desc   : LeetCode0112
* </pre>
 * 112. 路径总和
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 *
 * 通过次数76,214提交次数153,395
*/
public class LeetCode0112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        int rootVal = root.val;
        sum-=rootVal;
        if(root.left == null && root.right == null){
            return (sum == 0);
        }
        return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
    }
}
