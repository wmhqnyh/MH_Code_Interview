package com.wangmh.interview.search;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *   @author : mh.wang
 *   @date   : 2020/5/19 16:56
 *   @desc   : LeetCode 0046
 * </pre>
 * <p>
 * 46. 全排列
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,2,3]
 * 输出:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 * 通过次数128,900提交次数169,513
 */
public class LeetCode0046 {
    /**
     * 搜索的顺序问题
     * <p>
     * 1.
     *
     * @param nums
     * @return
     */
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        int l = nums.length;
        boolean[] visited = new boolean[l];
        dfs(nums, 0, result, visited);
        return result;
    }

    private void dfs(int[] nums, int pos, List<List<Integer>> result, boolean[] visited) {
        int n = nums.length;
        if (pos == n) {
            result.add(new ArrayList<>(path));
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                path.add(nums[i]);
                dfs(nums, pos + 1, result, visited);
                path.remove(path.size() - 1);
                visited[i] = false;
            }
        }
    }
}
