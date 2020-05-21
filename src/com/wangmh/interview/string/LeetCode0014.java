package com.wangmh.interview.string;

/**
* <pre>
*   @author : mh.wang
*   @date   : 2020/5/20 23:36
*   @desc   : LeetCode0014
* </pre>
 *
 * 14. 最长公共前缀
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * 通过次数248,799提交次数668,349
*/
public class LeetCode0014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        int n = strs.length;
        String result = strs[0];
        for (int i = 1; i < n; i++) {
            while (!strs[i].startsWith(result)) {
                result = result.substring(0, result.length() - 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] s = new String[]{"flower","flow","flight"};

        String[] s2 = new String[]{"c","acc","ccc"};
        LeetCode0014 sol = new LeetCode0014();
        System.out.println(sol.longestCommonPrefix(s));
        System.out.println(sol.longestCommonPrefix(s2));
    }
}
