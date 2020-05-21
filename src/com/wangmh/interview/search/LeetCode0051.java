package com.wangmh.interview.search;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *   @author : mh.wang
 *   @date   : 2020/5/19 15:21
 *   @desc   : LeetCode 0051
 * </pre>
 * <p>
 * 51. N皇后
 * n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * <p>
 * <p>
 * <p>
 * 上图为 8 皇后问题的一种解法。
 * <p>
 * 给定一个整数 n，返回所有不同的 n 皇后问题的解决方案。
 * <p>
 * 每一种解法包含一个明确的 n 皇后问题的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
 * <p>
 * 示例:
 * <p>
 * 输入: 4
 * 输出: [
 * [".Q..",  // 解法 1
 * "...Q",
 * "Q...",
 * "..Q."],
 * <p>
 * ["..Q.",  // 解法 2
 * "Q...",
 * "...Q",
 * ".Q.."]
 * ]
 * 解释: 4 皇后问题存在两个不同的解法。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 皇后，是国际象棋中的棋子，意味着国王的妻子。皇后只做一件事，那就是“吃子”。当她遇见可以吃的棋子时，就迅速冲上去吃掉棋子。当然，她横、竖、斜都可走一到七步，可进可退。（引用自 百度百科 - 皇后 ）
 * 通过次数40,314提交次数58,078
 */
public class LeetCode0051 {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        if (n == 0) return result;

        List<String> res = new ArrayList<>();
        boolean[][] visited = new boolean[n][n];
        //填充当前位置  当前位置的水平方向、垂直方向、对角线方向都无法放置
        //x表示水平方向 y表示垂直方向 对角线方向x=y 反对角线x+y=n
        dfs(n, res, visited);
        return result;
    }

    private void dfs(int n, List<String> res, boolean[][] visited) {


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

            }

        }
    }
}
