package com.wangmh.interview.dp;

/**
 * <pre>
 *   @author : mh.wang
 *   @date   : 2020/5/19 14:57
 *   @desc   :
 * </pre>
 * <p>
 * 1143. 最长公共子序列
 * 给定两个字符串 text1 和 text2，返回这两个字符串的最长公共子序列的长度。
 * <p>
 * 一个字符串的 子序列 是指这样一个新的字符串：它是由原字符串在不改变字符的相对顺序的情况下删除某些字符（也可以不删除任何字符）后组成的新字符串。
 * 例如，"ace" 是 "abcde" 的子序列，但 "aec" 不是 "abcde" 的子序列。两个字符串的「公共子序列」是这两个字符串所共同拥有的子序列。
 * <p>
 * 若这两个字符串没有公共子序列，则返回 0。
 * <p>
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入：text1 = "abcde", text2 = "ace"
 * 输出：3
 * 解释：最长公共子序列是 "ace"，它的长度为 3。
 * 示例 2:
 * <p>
 * 输入：text1 = "abc", text2 = "abc"
 * 输出：3
 * 解释：最长公共子序列是 "abc"，它的长度为 3。
 * 示例 3:
 * <p>
 * 输入：text1 = "abc", text2 = "def"
 * 输出：0
 * 解释：两个字符串没有公共子序列，返回 0。
 * <p>
 * <p>
 * 提示:
 * <p>
 * 1 <= text1.length <= 1000
 * 1 <= text2.length <= 1000
 * 输入的字符串只含有小写英文字符。
 * 通过次数21,368提交次数35,823
 */
public class LeetCode1143 {

    /*
         <闫氏DP分析法>

         1.动态方程定义f[i][j]表示第一个字符串的前 ii 个字符和第二个字符串的前 jj 个字符的最长公共子序列 集合
         2 四种情况 包含 不包含

         00---都不包含   f[i-1][j-1]
         01---不包含前面包含后面  f[i-1][j] 可以包含这个集合，但是不等同这个集合
         10---包含前面不包含后面  f[i][j-1] 可以包含这个集合，但是不等同这个集合
         11---两者都包含 f[i][j]

     */
    public int longestCommonSubsequence(String text1, String text2) {
        int N = 1010;
        int[][] dp = new int[N][N];
        int m = text1.length();
        int n = text2.length();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                if (text1.charAt(i-1) == text2.charAt(j-1)) dp[i][j] = Math.max(dp[i][j],dp[i - 1][j - 1] + 1);
            }
        }
        return dp[m][n];
    }
}
