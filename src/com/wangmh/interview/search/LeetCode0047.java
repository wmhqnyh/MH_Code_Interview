package com.wangmh.interview.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <pre>
 *   @author : mh.wang
 *   @date   : 2020/5/19 19:58
 *   @desc   : LeetCode0047
 * </pre>
 * 47. 全排列 II
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 *
 * 示例:
 *
 * 输入: [1,1,2]
 * 输出:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 * 通过次数58,992提交次数100,558
 */
public class LeetCode0047 {
    /**
     * 搜索的顺序问题
     * <p>
     * 1.
     *
     * @param nums
     * @return
     */
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        int l = nums.length;
        boolean[] visited = new boolean[l];
        Arrays.sort(nums);
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
                if (i > 0 && nums[i] == nums[i - 1] && !visited[i-1]) continue;
                visited[i] = true;
                path.add(nums[i]);
                dfs(nums, pos + 1, result, visited);
                path.remove(path.size() - 1);
                visited[i] = false;
            }
        }
    }
}
