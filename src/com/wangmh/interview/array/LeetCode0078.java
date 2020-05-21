package com.wangmh.interview.array;

import java.util.ArrayList;
import java.util.List;

/**
* <pre>
*   @author : mh.wang
*   @date   : 2020/5/19 22:15
*   @desc   :
* </pre>
 *
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * 说明：解集不能包含重复的子集。
 *
 * 示例:
 *
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 * 通过次数88,760提交次数114,903
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subsets
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
*/
public class LeetCode0078 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;

        int n = nums.length;
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> path = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i >> j & 1) != 0) path.add(nums[j]);
            }
            result.add(path);
        }
        return result;
    }
}
