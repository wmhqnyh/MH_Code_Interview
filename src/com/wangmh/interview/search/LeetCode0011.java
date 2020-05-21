package com.wangmh.interview.search;

/**
* <pre>
*   @author : mh.wang
*   @date   : 2020/5/20 18:43
*   @desc   : LeetCode 0011
* </pre>
 *
 * 11. 盛最多水的容器
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 *
 *
 *
 *
 * 图中垂直线代表输入数组 [1,8,6,2,5,4,8,3,7]。在此情况下，容器能够容纳水（表示为蓝色部分）的最大值为 49。
 *
 *
 *
 * 示例：
 *
 * 输入：[1,8,6,2,5,4,8,3,7]
 * 输出：49
 * 通过次数208,599提交次数329,685
 *
*/
public class LeetCode0011 {
    public int maxArea(int[] height) {
        if (height.length <= 1) return -1;
        int l = 0, r = height.length - 1, res = 0;
        //找出最大高度
        while (l < r) {
            int h = Math.min(height[l], height[r]);
            res = Math.max(res, h * (r - l));
            if (height[l] < height[r]) l++;
            else r--;
        }
        return res;
    }

    public static void main(String[] args) {
        LeetCode0011 sol = new LeetCode0011();
        int[] heights = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(sol.maxArea(heights));
    }
}
