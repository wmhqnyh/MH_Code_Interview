package com.wangmh.interview.string;

/**
* <pre>
*   @author : mh.wang
*   @date   : 2020/5/19 13:40
*   @desc   : LeetCode 680
* </pre>
 *
 * 680. 验证回文字符串 Ⅱ
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 *
 * 示例 1:
 *
 * 输入: "aba"
 * 输出: True
 * 示例 2:
 *
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 * 注意:
 *
 * 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
 * 通过次数29,756提交次数76,675
*/
public class LeetCode0680 {
    public boolean validPalindrome(String s) {
        if (s == null || s.length() == 0) return true;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return helper(s, i + 1, j) || helper(s, i, j - 1);
            i++;
            j--;
        }
        return true;
    }

    private boolean helper(String s, int i, int j) {
        if (s == null || s.length() == 0) return true;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
