package com.wangmh.interview.dp;

/**
 * <pre>
 *   @author : mh.wang
 *   @date   : 2020/5/17 17:59
 *   @desc   :
 * </pre>
 * <p>
 * 523. 连续的子数组和
 * 给定一个包含非负数的数组和一个目标整数 k，编写一个函数来判断该数组是否含有连续的子数组，其大小至少为 2，总和为 k 的倍数，即总和为 n*k，其中 n 也是一个整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [23,2,4,6,7], k = 6
 * 输出: True
 * 解释: [2,4] 是一个大小为 2 的子数组，并且和为 6。
 * 示例 2:
 * <p>
 * 输入: [23,2,6,4,7], k = 6
 * 输出: True
 * 解释: [23,2,6,4,7]是大小为 5 的子数组，并且和为 42。
 * 说明:
 * <p>
 * 数组的长度不会超过10,000。
 * 你可以认为所有数字总和在 32 位有符号整数范围内。
 * 通过次数12,327提交次数54,359
 */
public class LeetCode0523 {
    public boolean checkSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) return false;
        int n = nums.length;
        int[][] dp = new int[n][n];
        dp[0][0] = nums[0];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (i == j) dp[i][j] = nums[i];
                dp[i][j] = dp[i][j - 1] + nums[j];
                if (k == 0 && dp[i][j] == 0) return true;
                if ((j - i) >= 1 && k != 0 && dp[i][j] % k == 0) return true;
            }
        }
        return false;
    }

    private int helper(int[] nums, int m, int n) {
        if (nums == null || nums.length == 0) return 0;
        int sum = 0;
        for (int k = m; k <= n; k++) {
            sum += nums[k];
        }
        return sum;
    }

    public static void main(String[] args) {
        LeetCode0523 sol = new LeetCode0523();
        //int[] nums = new int[]{23,2,4,6,7};
        int[] nums = new int[]{1, 2, 3};
        boolean result = sol.checkSubarraySum(nums, 5);
        System.out.println(result);
    }
}
